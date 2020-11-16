package world.ucode.Avatar;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class Avatar {
    private String name;
    private Type type;
    private double maxHealth = 10;
    private double health = 10;
    private double happiness = 10;
    private double hunger = 10;
    private double thirst = 10;
    private double cleanliness = 10;

    private final Map<Action, Method> actions = new HashMap<Action, Method>() {{
        try {
//            put(Action.PLAY, Avatar.class.getDeclaredMethod("play"));
            put(Action.FEED, Avatar.class.getDeclaredMethod("feed"));
            put(Action.GIVE_WATER, Avatar.class.getDeclaredMethod("giveWater"));
//            put(Action.GIVE_MEDICINE, Avatar.class.getDeclaredMethod("giveMadicine"));
            put(Action.CLEAN_UP, Avatar.class.getDeclaredMethod("cleanUp"));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }};

    public Avatar(Type type, String name) {
        this.type = type;
        this.name = name;
        System.out.println("********************\n" + name + " " + type.toString() + "\n********************");
    }

//    public Avatar(ResultSet Avatar) {
//        try {
//            type = toType(Avatar.getString("type"));
//            name = Avatar.getString("name");
//            health = Double.parseDouble(Avatar.getString("health"));
//            happiness = Double.parseDouble(Avatar.getString("happiness"));
//            hunger = Double.parseDouble(Avatar.getString("hunger"));
//            thirst = Double.parseDouble(Avatar.getString("thirst"));
//            cleanliness = Double.parseDouble(Avatar.getString("cleanliness"));
//        }
//        catch(SQLException ignored) {
//            System.err.println("SQLException");
//        }
//    }

    public Type toType(String type) {
        if (type.equals("girl"))
            return Type.GIRL;
        if (type.equals("boy"))
            return Type.BOY;
        if (type.equals("shark"))
            return Type.SHARK;
        return null;
    }

    public void ActionHandler(Action action, Avatar avatar) throws InvocationTargetException, IllegalAccessException {
        actions.get(action).invoke(avatar);
    }

    public String GetName() {
        return name;
    }
    public Type GetType() {
        return type;
    }
    public double GetMaxHealth() {return maxHealth;}
    public double GetHealth() {return health;}
    public double GetHappiness() {return happiness;}
    public double GetHunger() {return hunger;}
    public double GetThirst() {return thirst;}
    public double GetCleanliness() {return cleanliness;}

    public int LiveCycle() {
        if (GetHealth() > 0) {
            SetHappiness(GetHappiness() - 0.005);
            SetHunger(GetHunger() - 0.005);
            SetThirst(GetThirst() - 0.005);
            SetCleanliness(GetCleanliness() - 0.005);
            SetHealth(GetHealth() - 0.005);
            return 0;
        }
        return -1;
    }
    private void play() {
        SetHappiness(GetHappiness() + 1);
        SetHunger(GetHunger() - 0.5);
        SetThirst(GetThirst() - 0.5);
        SetCleanliness(GetCleanliness() - 0.5);
        SetHealth(GetHealth() - 0.5);
    }
    private void feed() {
        SetHunger(GetHunger() + 1);
        SetHealth(GetHealth() + 1);
    }
    private void giveWater() {
        SetThirst(GetThirst() + 1);
        SetHealth(GetHealth() + 1);
    }
    private void giveMadicine() {
        SetHealth(GetHealth() + 1);
    }
    private void cleanUp() {
        SetCleanliness(GetCleanliness() + 1);
    }
    public void SetHealth(double value) {
        health = value;
    }
    public void SetHappiness(double value) {
        if (value < 1)
            SetHealth(GetHealth() - 0.05);
        else
            happiness = value;
    }
    public void SetHunger(double value) {
        if (value < 1)
            SetHealth(GetHealth() - 0.05);
        else
            hunger = value;
    }
    public void SetThirst(double value) {
        if (value < 1)
            SetHealth(GetHealth() - 0.05);
        else
            thirst = value;
    }
    public void SetCleanliness(double value) {
        if (value < 1)
            SetHealth(GetHealth() - 0.05);
        else
            cleanliness = value;
    }
}
