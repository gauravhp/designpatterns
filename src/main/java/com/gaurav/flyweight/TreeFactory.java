/*
 * Copyright (c) 2019. Gaurav Parmar
 *
 * Project: designpatterns
 * Class: TreeFactory
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

import java.util.ArrayList;
import java.util.List;

/*
 Flyweight factory decides whether to re-use existing
 flyweight or to create a new object.
*/
public class TreeFactory {
    private static List<TreeType> treeTypes = new ArrayList<TreeType>();

    public static TreeType getTreeType(String name, String color, String texture){
        TreeType newTreeType = new TreeType(name,color,texture);
        if(treeTypes.contains(newTreeType)){
            System.out.println("Found existing:" + name);
            return treeTypes.get(treeTypes.indexOf(newTreeType));
        } else {
            System.out.println("Created new:" + name);
            treeTypes.add(newTreeType);
        }
        return newTreeType;
    }
}
