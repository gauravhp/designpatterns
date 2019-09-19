/*
 * Copyright (c) 2019. Gaurav Parmar
 *
 * Project: designpatterns
 * Class: AuthenticationDialog
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

package com.gaurav.mediator;

public class AuthenticationDialog implements Mediator {
    CheckBox checkbox;
    TextBox textBox;
    Button button;

    @Override
    public CheckBox getCheckbox() {
        return checkbox;
    }

    @Override
    public TextBox getTextBox() {
        return textBox;
    }

    @Override
    public Button getButton() {
        return button;
    }

    public AuthenticationDialog() {
    }

    @Override
    public void notify(Component sender, String event) {
        if(sender.getClass()==CheckBox.class){
            if(event.equalsIgnoreCase("CheckBox")){
                System.out.println("Checkbox clicked");
            }
        }

        if(sender.getClass()==TextBox.class){
            if(event.equalsIgnoreCase("TextBox")){
                System.out.println("TextBox Key was pressed");
            }
        }

        if(sender.getClass()==Button.class){
            if(event.equalsIgnoreCase("Button")){
                System.out.println("Button was clicked");
            }
        }
    }

    @Override
    public void registerComponent(Component component) {
        component.setMediator(this);
        switch (component.getName()){
            case "CheckBox":
                checkbox = (CheckBox) component;
                break;
            case "TextBox":
                textBox = (TextBox) component;
                break;
            case "Button":
                button = (Button) component;
                break;
        }
    }


}
