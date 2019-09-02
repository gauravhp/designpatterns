/*
 * Copyright (c) 2019. Gaurav Parmar
 *
 * Project: designpatterns
 * Class: TreeType
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

package com.gaurav.flyweight;

/*
 The flyweight class contains a portion of the state of a
 tree. These fields store values that are unique for each
 particular tree. For instance, you won't find here the tree
 coordinates. But the texture and colors shared between many
 trees are here. Since this data is usually BIG, you'd waste a
 lot of memory by keeping it in each tree object. Instead, we
 can extract texture, color and other repeating data into a
 separate object which lots of individual tree objects can
 reference.
*/
public class TreeType {
    private String name;
    private String color;
    private String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null || obj.getClass()!= this.getClass())
            return false;
        TreeType treeTypeNew = (TreeType)obj;

        return (treeTypeNew.name==this.name && treeTypeNew.color == this.color && treeTypeNew.texture == this.texture);
    }

    public void draw(int x, int y){
        System.out.println("Drew a tree with (" + name + "," + color + "," + texture + ") at (" + x + "," + y + ")");
    }

}
