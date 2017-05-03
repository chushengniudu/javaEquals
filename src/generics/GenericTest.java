package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * 类型通配符
 */
public class GenericTest {
    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> numbers = new ArrayList<Number>();

        name.add("liuzheng");
        age.add(18);
        numbers.add(314);

        getDate(name);
        getUperNumber(age);
        getUperNumber(numbers);
    }

    public static void getDate(List<?> date) {
        System.out.println("date:" + date.get(0));
    }

    public static void getUperNumber(List<? extends Number> date) {
        System.out.println("date:" + date.get(0));
    }

}
