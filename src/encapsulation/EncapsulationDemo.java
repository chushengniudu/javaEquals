package encapsulation;

/**
 * Created by liuzheng on 2017/5/2.
 */
public class EncapsulationDemo {
    private String name;
    private String idNum;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sysEncapsulat() {
        System.out.print("Name : " + getName() +
                " Age : " + getAge());
    }
}
