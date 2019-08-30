/*
 * Copyright (c) 2019. by Gaurav Parmar
 *
 * Project: designpatterns
 * Class: Editor
 * GitHub profile: https://github.com/gauravhp
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

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
