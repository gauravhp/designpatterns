/*
 * Copyright (c) 2019. Gaurav Parmar
 *
 * Project: designpatterns
 * Class: Tv
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

public class Tv implements Device {
    boolean enable;
    int volume;
    int channel;

    public Tv() {
        this.enable=false;
        this.volume=0;
        this.channel=1;
    }

    public boolean isEnabled() {
        return enable;
    }

    public void enable() {
        enable=true;
    }

    public void disable() {
        enable=false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int percent) {
        this.volume=percent;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel=channel;
    }
}
