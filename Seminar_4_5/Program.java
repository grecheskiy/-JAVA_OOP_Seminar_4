package Seminar_4_5;

public class Program {
    public static void main(String[] args) {
        printElement<Integer> a = new printElement<Integer>(10);
        System.out.println("Type T - " + a.getEl());

        printElement<String> b = new printElement<String>("abc");
        System.out.println("Type T - " + b.getEl());

        printElement<Double> c = new printElement<Double>(99.9);
        System.out.println("Type T - " + c.getEl());        
    }

}
