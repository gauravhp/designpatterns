/*
 * Copyright (c) 2019. Gaurav Parmar
 *
 * Project: designpatterns
 * Class: GUIFactoryTest
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

package com.gaurav.abstractfactory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class GUIFactoryTest {
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

    @Test
    public void createWinButton() {
        GUIFactory guiFactory = new WinFactory();
        Button button = guiFactory.createButton();
        button.paint();
        assertEquals("Windows button\n",outContent.toString());
    }

    @Test
    public void createMacButton() {
        GUIFactory guiFactory = new MacFactory();
        Button button = guiFactory.createButton();
        button.paint();
        assertEquals("MAC Button\n",outContent.toString());
    }

    @Test
    public void createWinCheckbox() {
        GUIFactory guiFactory = new WinFactory();
        Checkbox checkbox = guiFactory.createCheckbox();
        checkbox.paint();
        assertEquals("Windows checkbox\n",outContent.toString());
    }

    @Test
    public void createMacCheckbox() {
        GUIFactory guiFactory = new MacFactory();
        Checkbox checkbox = guiFactory.createCheckbox();
        checkbox.paint();
        assertEquals("MAC checkbox\n",outContent.toString());
    }
}