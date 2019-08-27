package observer;

import java.io.File;

public class Editor {
    private EventManager eventManager;
    private File file;

    public Editor() {
        this.eventManager = new EventManager();
    }

    public EventManager getEventManager(){
        return this.eventManager;
    }

    public void openFile(String path){
        this.file = new File(path);
        System.out.println("Opening file : " + file.getName());
        eventManager.notifyListeners(EventManager.EventType.OPEN, path);
    }

    public void saveFile(){
        if(file.exists()){
            System.out.println("Saving the file : " + file.getName());
            eventManager.notifyListeners(EventManager.EventType.SAVE,file.getAbsolutePath());
        }
    }
}
