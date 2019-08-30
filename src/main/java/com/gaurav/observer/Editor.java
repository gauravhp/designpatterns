package com.gaurav.observer;

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
        eventManager.notifyListeners(EventManager.EventType.OPEN, path);
    }

    public void saveFile(){
        if(file.exists()){
            eventManager.notifyListeners(EventManager.EventType.SAVE,file.getAbsolutePath());
        } else {
            System.out.println("File does not exist");
        }
    }
}
