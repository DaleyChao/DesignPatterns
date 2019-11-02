package com.mashibing.dp.singleton;

public class SingletonLazySynchronized02 {
    private static SingletonLazySynchronized02 INSTANCE;

    private SingletonLazySynchronized02() {

    }

    public static SingletonLazySynchronized02 getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonLazySynchronized02.class) {
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new SingletonLazySynchronized02();
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for(int i = 0;i<100;i++){
            new Thread(()->{
                System.out.println(SingletonLazySynchronized02.getInstance().hashCode());
            }).start();
        }
    }
}
