package com.gaurav.factory;

import static org.junit.Assert.*;
import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FactoryTest {
    Dialog dialog;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUp(){
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }


    @After
    public void release(){
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void testWindowsButton(){
        dialog = new WindowsDialog();
        dialog.render();
        assertEquals("Windows button :close dialog\nWindows button render\n",outContent.toString());
    }

    @Test
    public void testHtmlButton(){
        dialog = new WebDialog();
        dialog.render();
        assertEquals("HTML button :close dialog\nHTML button render\n",outContent.toString());
    }
}
