/*
 * Copyright (c) 2019. Gaurav Parmar
 *
 * Project: designpatterns
 * Class: ShapeTest
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

package com.gaurav.prototype;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ShapeTest {

    @After
    public void tearDown() throws Exception {

    }

    @Before
    public void setUp() throws Exception {

    }

    @Test(expected = Test.None.class)
    public void clone1() {
        List<Shape> shapeList = new ArrayList<Shape>();
        Circle circle = new Circle();
        circle.radius = 5;
        circle.x = 10;
        circle.y = 12;
        circle.color="red";
        shapeList.add(circle);
        Circle anotherCircle = circle.clone();
        shapeList.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width=10;
        rectangle.height=11;
        rectangle.color="blue";
        shapeList.add(rectangle);
        Rectangle anotherRectangle = rectangle.clone();
        shapeList.add(anotherRectangle);

        for (Shape shape: shapeList){
            shape.printString();
        }

    }
}