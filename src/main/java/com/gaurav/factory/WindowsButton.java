package com.gaurav.factory;

public class WindowsButton implements Button{
    public void render() {
        System.out.println("Windows button render");
    }

    public void onClick(String action) {
        System.out.println("Windows button :" + action);
    }
}
