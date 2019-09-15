/*
 * Copyright (c) 2019. Gaurav Parmar
 *
 * Project: designpatterns
 * Class: CommandHistory
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

import java.util.ArrayList;
import java.util.List;

public class CommandHistory {
    private List<Command> history;

    public CommandHistory() {
        this.history = new ArrayList<Command>();
    }

    public void push(Command command){
        history.add(command);
    }

    public Command pop(){
        Command c = history.get(history.size()-1);
        history.remove(history.size()-1);
        return c;
    }
}
