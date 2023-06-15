package Seminar_4_1;

public class Gen <T, R> {
    T ob;
    R ob2;
    Gen(T o, R o2) {
        ob = o;
        ob2 = o2;
    }
    T getOb() {
        return ob;
    }
    R getOb2() {
        return ob2;
    }
    void showType() {
        System.out.println("Type T - this is " + ob.getClass().getName());
        System.out.println("Type R - this is " + ob2.getClass().getName());
    }
 }
