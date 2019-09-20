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

package com.gaurav.Memento;

public class Editor {
    private String text;
    private int curX,curY;
    private int selectionWidth;

    public Editor(String text, int curX, int curY, int selectionWidth) {
        this.text = text;
        this.curX = curX;
        this.curY = curY;
        this.selectionWidth = selectionWidth;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setCursor(int curX,int curY) {
        this.curX = curX;
        this.curY = curY;
    }

    public void setSelectionWidth(int selectionWidth) {
        this.selectionWidth = selectionWidth;
    }

    public Snapshot createSnapshot(){
        return new Snapshot(this,text,curX,curY,selectionWidth);
    }
}
