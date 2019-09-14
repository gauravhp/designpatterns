/*
 * Copyright (c) 2019. Gaurav Parmar
 *
 * Project: designpatterns
 * Class: Panel
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

// Complex components may override the default
// implementation. If the help text can't be provided in a new
// way, the component can always call the base implementation
// (see Component class).

public class Panel extends Container {
    String modalHelpText;

    public Panel(String modalHelpText) {
        this.modalHelpText = modalHelpText;
    }

    public Panel() {
    }

    @Override
    public void showHelp() {
        if(modalHelpText!=null && !modalHelpText.isEmpty()){
            System.out.println("This is modal help " + modalHelpText);
        } else {
            super.showHelp();
        }
    }
}
