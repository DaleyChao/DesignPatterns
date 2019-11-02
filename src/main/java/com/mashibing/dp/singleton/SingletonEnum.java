package com.mashibing.dp.singleton;

public class SingletonEnum {
    private SingletonEnum(){

    }
    private static enum innerEnum{
        /**
         * 枚举单例
         */
        INSTANCE;
        private SingletonEnum singletonEnum;
        innerEnum(){
            singletonEnum = new SingletonEnum();
        }
        private SingletonEnum getInstance(){
            return singletonEnum;
        }
    }

    public static SingletonEnum getInstance(){
        return innerEnum.INSTANCE.getInstance();
    }

    public static void main(String[] args) {
        for(int i = 0;i<100;i++){
            new Thread(()->{
                System.out.println(SingletonEnum.getInstance().hashCode());
            }).start();
        }
    }
}
