/*
 * Copyright (c) 2019. Gaurav Parmar
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

package com.gaurav.command;

public class Editor {
    String text;

    public Editor(String text) {
        this.text = text;
    }

    public Editor() {
    }

    public String getSelection(String selection) {
        return text.contains(selection)?selection:"";
    }

    public boolean deleteSelection(String selection){
        if(text.contains(selection)){
            text.replace(selection,"");
            return true;
        }
        return false;
    }


    public boolean replaceSelection(String selection,String replacement){
        if(text.contains(selection)){
            text.replace(selection,replacement);
            return true;
        }
        return false;
    }
}
