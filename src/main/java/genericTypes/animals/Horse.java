package genericTypes.animals;

public class Horse extends Animal {

    private boolean mounted;

    public Horse(String name, boolean mounted) {
        super(name);
        this.mounted = mounted;
    }

    public boolean isMounted() {
        return mounted;
    }

    public void setMounted(boolean mounted) {
        this.mounted = mounted;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "mounted=" + mounted +
                ", name='" + name + '\'' +
                '}';
    }
}
