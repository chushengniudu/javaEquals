
public class Main {

    public static void main(String[] args) {
//
//        System.out.println(a == b);//true
        String a = "abc";
        String b = "abc";
        String c = new String("abc");
        System.out.println(c == b);//false
        System.out.println(c.equals(b));//true

        String d = new String("abc");
        System.out.println(c == d);//false
        System.out.println(d.equals(c));//true

        String e = new String("abcd");
        System.out.println(e.equals(d));//false

        Integer i1 = 100, i2 = 100;
        System.out.println(i1 == i2);//true
        Integer i3 = 1000, i4 = 1000;
        System.out.println(i3 == i4);//fales
    }
}
