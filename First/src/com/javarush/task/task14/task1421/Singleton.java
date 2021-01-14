package com.javarush.task.task14.task1421;

public final class Singleton {
    private static Singleton instance;
    public String name;

    public static Singleton getInstance(String name) {
        if (instance == null) {
            instance = new Singleton(name);
        }
        return instance;
    }

    private Singleton(String name) {
        this.name = name;
    }
}
