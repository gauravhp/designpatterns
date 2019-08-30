/*
 * Copyright (c) 2019. by Gaurav Parmar
 *
 * Project: designpatterns
 * Class: LoggingListenerImpl
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
