package tech.stack;

/**
 * @author jianyuan.chen@advance.ai
 * @date 2020/8/14 02:01
 */
public class App {

    public static void main(String[] args) {
        String m = "hello,world";
        String n = "hello,world";
        String u = new String(m);
        String v = new String("hello,world");
        System.out.println(m == n);
        System.out.println(m == u);
        System.out.println(m == v);
        System.out.println(u == v);
        System.out.println(m.equals(u));
        System.out.println(m.equals(v));
        System.out.println(u.equals(v));

        Integer a = new Integer(100);
        Integer b = new Integer(100);
        Integer c = new Integer(200);
        Integer d = new Integer(200);
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(c == d);
        System.out.println(c.equals(d));


        Integer i1 = 100;
        Integer i2 = 100;
        Integer i3 = 200;
        Integer i4 = 200;
        System.out.println(1111111111);
        System.out.println(i1==i2);
        System.out.println(i3==i4);
    }

}

