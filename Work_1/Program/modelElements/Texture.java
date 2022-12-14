package Work_1.Program.modelElements;

public class Texture {
    private String name;

    public Texture(String name) {
        this.name = name;
    }

    public Texture() {
        this("default");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  "Texture [" + name + "]";
    }
}
