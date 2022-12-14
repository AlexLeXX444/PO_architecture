package Work_1.Program.modelElements;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    private int id;
    private List<PoligonalModel> models = new ArrayList<>();
    private List<Flash> flashes = new ArrayList<>();
    private Camera camera;

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, Camera camera) {
        this.id = id;
        this.models = models;
        this.flashes = flashes;
        this.camera = camera;
    }

    public int getId() {
        return id;
    }
    public List<PoligonalModel> getModels() {
        return models;
    }
    public List<Flash> getFlashes() {
        return flashes;
    }
    public Camera getCamera() {
        return camera;
    }

    @Override
    public String toString() {
        return "-=== SCENE ===-\n" + 
        "ID: " + id + "\n" + 
        "MODELS: " + models.toString() + "\n " + 
        "FLASHES: " + flashes.toString() + "\n" + 
        "CAMERA: " + camera.toString();
    }
}
