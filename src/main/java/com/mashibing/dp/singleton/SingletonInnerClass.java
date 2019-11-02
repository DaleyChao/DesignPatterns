package com.mashibing.dp.singleton;

public class SingletonInnerClass {
    private SingletonInnerClass() {

    }

    private static class Holder {
        private static final SingletonInnerClass INSTANCE = new SingletonInnerClass();
    }

    public static SingletonInnerClass getInstance() {
        return Holder.INSTANCE;
    }


    public static void main(String[] args) {
        for(int i = 0;i<100;i++){
            new Thread(()->{
                System.out.println(SingletonInnerClass.getInstance().hashCode());
            }).start();
        }
    }
}
