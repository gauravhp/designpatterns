/*
 * Copyright (c) 2019. Gaurav Parmar
 *
 * Project: designpatterns
 * Class: FlyweightTest
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

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FlyweightTest {
    @Test(expected = Test.None.class)
    public void testFlyweight() {
        List<Tree> treeList = new ArrayList<Tree>();
        Tree oakTree1 = new Tree(1,2,TreeFactory.getTreeType("oak","darkgreen","smooth"));
        Tree mahagony1 = new Tree(2,3,TreeFactory.getTreeType("mahagony","blue","dotted"));
        Tree eucalyptus1 = new Tree(3,4,TreeFactory.getTreeType("eucalyptus","lightgreen","ridged"));
        Tree oakTree2 = new Tree(4,5,TreeFactory.getTreeType("oak","darkgreen","smooth"));
        Tree eucalyptus2 = new Tree(5,6,TreeFactory.getTreeType("eucalyptus","lightgreen","ridged"));

        treeList.add(oakTree1);
        treeList.add(mahagony1);
        treeList.add(eucalyptus1);
        treeList.add(oakTree2);
        treeList.add(eucalyptus2);

        System.out.println(treeList.size());
        for(Tree tree: treeList){
            tree.draw();
        }
    }
}