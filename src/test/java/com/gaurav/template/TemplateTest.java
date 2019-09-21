/*
 * Copyright (c) 2019. Gaurav Parmar
 *
 * Project: designpatterns
 * Class: TemplateTest
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

package com.gaurav.template;

import org.junit.Test;

import static org.junit.Assert.*;

public class TemplateTest {
    @Test(expected = Test.None.class)
    public void testTemplate() {
        Network network = null;
        String message =  "Hello World!";
        String loginId = "JohnDoe";
        String password = "JaneDoe";

        network = new Facebook(loginId,password);
        network.post(message);

        network = new Twitter(loginId,password);
        network.post(message);
    }
}