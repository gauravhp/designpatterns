/*
 * Copyright (c) 2019. Gaurav Parmar
 *
 * Project: designpatterns
 * Class: BuilderTest
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

package com.gaurav.builder;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class BuilderTest {

    Director director = new Director();
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }


    @Test(expected = Test.None.class)   // Expected that no exception is thrown
    public void construcSportsVariant() {
        CarBuilder carBuilder = new CarBuilder();
        director.construcSportsVariant(carBuilder);
        Car car = carBuilder.getProduct();
        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.construcSportsVariant(manualBuilder);
        Manual manual = manualBuilder.getProduct();
        System.out.println(car.toString());
        System.out.println(manual.toString());
    }

    @Test(expected = Test.None.class)   // Expected that no exception is thrown
    public void constructSuvVariant() {
        CarBuilder carBuilder = new CarBuilder();
        director.constructSuvVariant(carBuilder);
        Car car = carBuilder.getProduct();
        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSuvVariant(manualBuilder);
        Manual manual = manualBuilder.getProduct();
        System.out.println(car.toString());
        System.out.println(manual.toString());
    }
}