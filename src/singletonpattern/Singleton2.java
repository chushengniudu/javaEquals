package singletonpattern;

/**
 * 2、懒汉式，线程安全
 * synchronized(同步)
 */
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {

    }

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
