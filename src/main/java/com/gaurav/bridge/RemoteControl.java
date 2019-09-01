/*
 * Copyright (c) 2019. Gaurav Parmar
 *
 * Project: designpatterns
 * Class: RemoteControl
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

/*
 The "abstraction" defines the interface for the "control"
 part of the two class hierarchies. It maintains a reference
 to an object of the "implementation" hierarchy and delegates
 all of the real work to this object.
*/

public class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public RemoteControl() {
    }

    public void togglePower(){
        if(device.isEnabled()){
            device.disable();
        } else {
            device.enable();
        }
    }

    public void volumeUp(){
        device.setVolume(device.getVolume()+10);
    }

    public void volumeDown(){
        device.setVolume(device.getVolume()-10);
    }

    public void channelUp(){
        device.setChannel(device.getChannel()+1);
    }

    public void channelDown(){
        device.setChannel(device.getChannel()-1);
    }
}
