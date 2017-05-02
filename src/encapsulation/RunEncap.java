package encapsulation;

/**
 * Java 封装
 * 1. 良好的封装能够减少耦合。
 * 2. 类内部的结构可以自由修改。
 * 3. 可以对成员变量进行更精确的控制。
 * 4. 隐藏信息，实现细节。
 */
public class RunEncap {
    public static void main(String[] args) {
        EncapsulationDemo encapsulationDemo = new EncapsulationDemo();
        encapsulationDemo.setAge(18);
        encapsulationDemo.setIdNum("22");
        encapsulationDemo.setName("nice");
        encapsulationDemo.sysEncapsulat();
    }
}
