/*
 * Copyright (c) 2019. Gaurav Parmar
 *
 * Project: designpatterns
 * Class: Radio
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

public class Radio implements Device {
    boolean enable;
    int volume;
    int channel;

    public Radio() {
        this.enable=false;
        this.volume=0;
        this.channel=1;
    }

    public boolean isEnabled() {
        return enable;
    }

    public void enable() {
        this.enable=true;
    }

    public void disable() {
        this.enable=false;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int percent) {
        this.volume=percent;
    }

    public int getChannel() {
        return this.channel;
    }

    public void setChannel(int channel) {
        this.channel=channel;
    }
}
