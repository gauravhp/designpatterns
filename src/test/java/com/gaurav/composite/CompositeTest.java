/*
 * Copyright (c) 2019. Gaurav Parmar
 *
 * Project: designpatterns
 * Class: CompositeTest
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

package com.gaurav.composite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CompositeTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test(expected = Test.None.class)
    public void testComposite() {
        CompoundGraphic compoundGraphic = new CompoundGraphic();

        Dot dot = new Dot(1, 2);
        compoundGraphic.add(dot);
        compoundGraphic.add(new Circle(5, 3, 10));

        compoundGraphic.move(1,1);
        compoundGraphic.draw();
        compoundGraphic.remove(dot);

    }

}