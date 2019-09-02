/*
 * Copyright (c) 2019. Gaurav Parmar
 *
 * Project: designpatterns
 * Class: decoratorTest
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

package com.gaurav.decorator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class decoratorTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        File file = new File("temp.txt");
        file.delete();
    }

    @Test(expected = Test.None.class)
    public void testDecorator() throws Exception {
        DataSource source = new FileDataSource(new File("temp.txt"));
        source.writeData("Hello");
        System.out.println(source.readData());

        source = new EncryptionDecorator(source);
        source.writeData("Hello");
        System.out.println(source.readData());

        source = new CompressionDecorator(source);
        source.writeData("Hello");
        System.out.println(source.readData());

    }

}