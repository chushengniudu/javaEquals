package singletonpattern;

/**
 * 创建一个 Singleton 类。
 */
public class SingleObject {
    //创建 singletonpattern.SingleObject 的一个对象
    private static SingleObject instane = new SingleObject();

    //让构造函数为 private，这样该类就不会被实例化
    private SingleObject() {
    }

    //获取唯一可用的对象
    public static SingleObject getInstane() {
        return instane;
    }

    //显示消息
    public void showMessage() {
        System.out.println("Hello World!");
    }
}
