/*
 * Copyright (c) 2019. Gaurav Parmar
 *
 * Project: designpatterns
 * Class: ChainOfResponsibilityTest
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

package com.gaurav.chainofresponsibility;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChainOfResponsibilityTest {

    @Test(expected = Test.None.class)
    public void testChainOfResponsibility() {
        Dialog dialog = new Dialog("http://wikipedia.org");
        Panel panel = new Panel("Panel Help");
        Button okButton = new Button();
        okButton.setToolTipText("This is ok button");
        Button cancel = new Button();
        cancel.setToolTipText("This is cancel button");
        panel.add(okButton);
        panel.add(cancel);
        dialog.add(panel);

        dialog.showHelp();
        panel.showHelp();
        okButton.showHelp();
        cancel.showHelp();
    }
}