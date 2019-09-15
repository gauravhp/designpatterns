/*
 * Copyright (c) 2019. Gaurav Parmar
 *
 * Project: designpatterns
 * Class: Application
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

package com.gaurav.command;

import java.util.List;

public class Application {
    String clipboard;
    List<Editor> editors;
    Editor activeEditor;
    CommandHistory history;

    public Application(String clipboard, List<Editor> editors, Editor activeEditor, CommandHistory history) {
        this.clipboard = clipboard;
        this.editors = editors;
        this.activeEditor = activeEditor;
        this.history = history;
    }

    public Command copyCommand(){
        Command command = new CopyCommand(this,activeEditor);
        return command;
    }


    public void executeCommand(Command command){
        if(command.execute()){
            history.push(command);
        }
    }

    public void undo(){
        Command command = history.pop();
        if(command!=null){
            command.undo();
        }
    }
}
