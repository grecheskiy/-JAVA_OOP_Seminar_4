package Seminar_4_1;

public class Gen <T, R> { //класс использует параметры типа
    //создаю обобщенный класс 
    T ob;
    R ob2;
    //объевляю объекты типов Т, R
    Gen(T o, R o2) {
        ob = o;
        ob2 = o2;
    }
    //создаю конструктор
    T getOb() {
        return ob;
    }
    R getOb2() {
        return ob2;
    }
    //создаю методы
    void showType() {
        System.out.println("Type T - this is " + ob.getClass().getName());
        System.out.println("Type R - this is " + ob2.getClass().getName());
    }
    //создаю метод
 }
