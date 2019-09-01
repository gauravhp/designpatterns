/*
 * Copyright (c) 2019. Gaurav Parmar
 *
 * Project: designpatterns
 * Class: CompoundGraphic
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

package com.gaurav.Composite;

import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic implements Graphic {
    private List<Graphic> graphicList;

    public CompoundGraphic() {
        graphicList = new ArrayList<Graphic>();
    }

    public void add(Graphic graphic){
        graphicList.add(graphic);
    }

    public void remove(Graphic graphic){
        graphicList.remove(graphic);
    }

    public void move(int x, int y) {
        for(Graphic graphic: graphicList){
            graphic.move(x,y);
        }
    }

    public void draw() {
        for(Graphic graphic: graphicList){
            graphic.draw();
        }
    }
}
