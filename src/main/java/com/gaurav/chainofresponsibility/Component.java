/*
 * Copyright (c) 2019. Gaurav Parmar
 *
 * Project: designpatterns
 * Class: Component
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

// The base class for simple components.
public abstract class Component implements ComponentWithContextualHelp {
    String toolTipText;

    // The component's container acts as the next link in the
    // chain of handlers.
    protected Container container;

    @Override
    public void showHelp() {
        if (toolTipText!=null) {
            System.out.println(toolTipText);
        } else {
            container.showHelp();
        }
    }

    public void setToolTipText(String toolTipText) {
        this.toolTipText = toolTipText;
    }
}
