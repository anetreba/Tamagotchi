package world.ucode.Avatar;

public class Avatar {
    private String name;
    private Type type;
    private double maxHealth = 10;
    private double health = 10;
    private double happiness = 10;
    private double hunger = 10;
    private double thirst = 10;
    private double cleanliness = 10;

    public Avatar(Type type, String name) {
        this.type = type;
        this.name = name;
        System.out.println("********************\n" + name + " " + toString() + "\n********************");
    }
}
