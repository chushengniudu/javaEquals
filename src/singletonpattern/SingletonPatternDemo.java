package singletonpattern;

/**
 * 从 singleton 类获取唯一的对象。
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        //不合法的构造函数
        //编译时错误：构造函数 singletonpattern.SingleObject() 是不可见的
        //singletonpattern.SingleObject object = new singletonpattern.SingleObject();

        //获取唯一可用的对象
        SingleObject object = SingleObject.getInstane();
        object.showMessage();
    }
}
