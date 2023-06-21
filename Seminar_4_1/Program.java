package Seminar_4_1;

public class Program {
    public static void main(String[] args) {
    Gen <Integer, String> iOb = new Gen<Integer, String>(88, "abc");
    //создаеи объекты разных типов
    iOb.showType();
    int v = iOb.getOb();
    String str = iOb.getOb2();

    System.out.println("Znachenie v = " + v);
    System.out.println("Znachenie str = " + str);
    }
}
