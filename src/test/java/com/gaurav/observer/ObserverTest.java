/*
 * Copyright (c) 2019. by Gaurav Parmar
 *
 * Project: designpatterns
 * Class: ObserverTest
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

package com.gaurav.observer;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ObserverTest {

    Editor textEditor;
    LoggingListenerImpl loggingListener;
    EmailAlertsListenerImpl emailAlertsListener;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUp(){
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));

        textEditor = new Editor();
        loggingListener = new LoggingListenerImpl("/Users/gaparmar/designpatterns/temp.txt","File has been opened at :");
        textEditor.getEventManager().subscribe(EventManager.EventType.OPEN,loggingListener);

        emailAlertsListener = new EmailAlertsListenerImpl("admin@gaurav.com");
        textEditor.getEventManager().subscribe(EventManager.EventType.SAVE,emailAlertsListener);
    }

    @After
    public void release(){
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void junitWorks(){
        assertTrue(true);
    }

    @Test
    public void testOpenFile(){
        textEditor.openFile("/Users/gaparmar/designpatterns/temp.txt");
        File file = new File("/Users/gaparmar/designpatterns/temp.txt");
        assertTrue(file.exists());
        assertTrue(file.length()>0);
    }

    @Test
    public void saveFile(){
        testOpenFile();
        textEditor.saveFile();
        assertEquals("Email message : \'/Users/gaparmar/designpatterns/temp.txt\' sent to admin@gaurav.com\n",outContent.toString());
    }

    @Test
    public void testUnsubscribe(){
        File file = new File("/Users/gaparmar/designpatterns/temp.txt");
        if(file.exists()) {
            file.delete();
        }

        textEditor.getEventManager().unsubscribe(EventManager.EventType.OPEN,loggingListener);
        textEditor.openFile("/Users/gaparmar/designpatterns/temp.txt");
        assertFalse(file.exists());
    }
}
