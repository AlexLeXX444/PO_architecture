package Work_1.Program.inMemoryModel;

import java.util.ArrayList;
import java.util.List;

import Work_1.Program.modelElements.*;;

public class ModelStore implements IModelChanger{
    private List<PoligonalModel> models = new ArrayList<>();
    private List<Scene> scenes = new ArrayList<>();
    private List<Flash> flashes = new ArrayList<>();
    private List<Camera> cameras = new ArrayList<>();
    private List<String> changeObservers = new ArrayList<>();

    public ModelStore(List<PoligonalModel> models, List<Scene> scenes, List<Flash> flashes, List<Camera> cameras) {
        this.NotifyChange(models.toString());
        this.models = models;
        this.NotifyChange(scenes.toString());
        this.scenes = scenes;
        this.NotifyChange(flashes.toString());
        this.flashes = flashes;
        this.NotifyChange(cameras.toString());
        this.cameras = cameras;
    }

    public List<PoligonalModel> getModels() {
        return models;
    }
    public List<Scene> getScenes() {
        return scenes;
    }
    public List<Flash> getFlashes() {
        return flashes;
    }
    public List<Camera> getCameras() {
        return cameras;
    }
    public List<String> getChangeObservers() {
        return changeObservers;
    }
    
    public void NotifyChange(String s) {
        changeObservers.add("Change: " + s);
    }
}
