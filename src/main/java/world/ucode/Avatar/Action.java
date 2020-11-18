package world.ucode.Avatar;

public enum Action {
//    PLAY("Play"),
    FEED("feed"),
    GIVE_WATER("givewater"),
    GIVE_MEDICINE("medicine"),
    CLEAN_UP("cleanup");

    private final String name;

    Action(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
