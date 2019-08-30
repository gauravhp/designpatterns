package com.gaurav.factory;

public class WindowsDialog extends Dialog{
    public Button createButton() {
        return new WindowsButton();
    }
}
