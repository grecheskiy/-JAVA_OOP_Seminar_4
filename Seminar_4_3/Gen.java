package Seminar_4_3;

public class Gen<T> {
    T ob;
    Gen(T o) {
        ob = o;
    }

    static void test(Gen<? extends A> o) {
        //
    }
}
