package com.mashibing.dp.singleton;

public class SingletonLazySynchronized {
    private static SingletonLazySynchronized INSTANCE;

    private SingletonLazySynchronized() {

    }

    public static synchronized SingletonLazySynchronized getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new SingletonLazySynchronized();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for(int i = 0;i<100;i++){
            new Thread(()->{
                System.out.println(SingletonLazySynchronized.getInstance().hashCode());
            }).start();
        }
    }
}
