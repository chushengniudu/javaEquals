package singletonpattern;

/**
 * Created by liuzheng on 2017/4/26.
 * 1、懒汉式，线程不安全
 */
public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
