package com.gaurav.factory;

public class WebDialog extends Dialog {
    public Button createButton() {
        return new HtmlButton();
    }
}
