package com.eomcs.pms;

public class ServerApp {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new ServerApp().getGreeting());
    }
}