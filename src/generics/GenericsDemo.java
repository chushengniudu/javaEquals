package generics;

/**
 * Java 泛型
 */
public class GenericsDemo {
    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String[] agrs) {
        Integer[] integers = {1, 2, 3, 4, 5, 6};
        Double[] doubles = {1.1, 2.2, 3.3, 4.4};
        Character[] characters = {'H', 'E', 'L', 'L', 'O'};

        System.out.println( "整型数组元素为:" );
        printArray( integers  ); // 传递一个整型数组

        System.out.println( "\n双精度型数组元素为:" );
        printArray( doubles ); // 传递一个双精度型数组

        System.out.println( "\n字符型数组元素为:" );
        printArray( characters ); // 传递一个字符型数组

    }

}
