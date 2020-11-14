package world.ucode.Avatar;

public enum Type {
    GIRL("girl"),
    BOY("boy"),
    SHARK("shark");

    private final String name;
    Type(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
