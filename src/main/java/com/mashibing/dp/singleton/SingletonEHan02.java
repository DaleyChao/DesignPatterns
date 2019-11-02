package com.mashibing.dp.singleton;

public class SingletonEHan02 {
    private static final SingletonEHan02 INSTANCE ;
     static {
        INSTANCE = new SingletonEHan02();
    }
    private SingletonEHan02(){

    }
    public static SingletonEHan02 getInstance(){
         return INSTANCE;
    }
}
