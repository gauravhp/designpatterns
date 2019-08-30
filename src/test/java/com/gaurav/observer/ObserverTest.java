package com.gaurav.observer;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
    }

    @Test
    public void saveFile(){
        testOpenFile();
        textEditor.saveFile();
        assertEquals("Email message : \'/Users/gaparmar/designpatterns/temp.txt\' sent to admin@gaurav.com\n",outContent.toString());
    }

}
