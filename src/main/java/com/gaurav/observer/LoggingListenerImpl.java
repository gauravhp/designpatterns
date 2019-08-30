package com.gaurav.observer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LoggingListenerImpl implements EventListener {
    private File logFile;

    public LoggingListenerImpl(String logFileStr, String message) {
        this.logFile = new File(logFileStr);
    }

    public void update(String message) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(logFile));
            writer.write(message);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
