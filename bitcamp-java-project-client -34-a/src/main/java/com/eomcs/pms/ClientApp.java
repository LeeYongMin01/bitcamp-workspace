package com.eomcs.pms;

public class ClientApp {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new ClientApp().getGreeting());
    }
}
