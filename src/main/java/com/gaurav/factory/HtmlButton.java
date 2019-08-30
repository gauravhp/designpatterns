package com.gaurav.factory;

public class HtmlButton implements Button {
    public void render() {
        System.out.println("HTML button render");
    }

    public void onClick(String action) {
        System.out.println("HTML button :" + action);
    }
}
