/*
 * Copyright (c) 2019. Gaurav Parmar
 *
 * Project: designpatterns
 * Class: BridgeTest
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

package com.gaurav.bridge;

import org.junit.Test;

import static org.junit.Assert.*;

public class BridgeTest {
    @Test
    public void testDevice() {
        Tv tv = new Tv();
        RemoteControl remote = new RemoteControl(tv);
        remote.togglePower();
        assertTrue(tv.isEnabled());
        remote.togglePower();
        assertTrue(!tv.isEnabled());

        remote.channelUp();
        assertEquals(tv.getChannel(),2);

        remote.channelDown();
        assertEquals(tv.getChannel(),1);

        remote.volumeUp();
        assertEquals(tv.getVolume(),10);

        remote.volumeDown();
        assertEquals(tv.getVolume(),0);

        Radio radio = new Radio();
        AdvancedRemoteControl advancedRemoteControl = new AdvancedRemoteControl(radio);

        advancedRemoteControl.volumeUp();
        assertEquals(radio.getVolume(),10);
        advancedRemoteControl.mute();
        assertEquals(radio.getVolume(),0);
    }
}