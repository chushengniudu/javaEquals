package shapedome;

/**
 * Created by liuzheng on 2017/4/26.
 * 实体类
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
