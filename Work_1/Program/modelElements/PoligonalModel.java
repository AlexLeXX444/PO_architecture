package Work_1.Program.modelElements;

public class PoligonalModel {
    private Poligon poligon;
    private Texture texture;

    public PoligonalModel(Poligon poligon, Texture texture) {
        this.poligon = poligon;
        this.texture = texture;
    }

    public PoligonalModel() {
        this(new Poligon(), new Texture());
    }

    public Poligon getPoligon() {
        return poligon;
    }

    public Texture getTexture() {
        return texture;
    }

    @Override
    public String toString() {
        return "Using texture: " + texture.getName() + " using poligon: " + poligon;
    }
}
