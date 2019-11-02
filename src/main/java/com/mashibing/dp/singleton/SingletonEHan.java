package com.mashibing.dp.singleton;

public class SingletonEHan {
    private static final SingletonEHan INSTANCE = new SingletonEHan();

    private SingletonEHan() {
    }

    public static SingletonEHan getInstance() {
        return INSTANCE;
    }
}
