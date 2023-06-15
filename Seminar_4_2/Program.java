package Seminar_4_2;

public class Program {

    public static void main(String[] args) {
    
        Numeric <Integer> a = new Numeric<Integer>(5);
        System.out.println("Obratnaya velichina a = 1/a = " + a.dubReturn());
        System.out.println("Drobnaya chast a = " + a.dubRestReturn());

        Numeric <Double> b = new Numeric<Double>(8.7);
        System.out.println("Obratnaya velichina b = 1/b = " + b.dubReturn());
        System.out.printf("Drobnaya chast b = %.2f\n", b.dubRestReturn());

        Numeric <Float> c = new Numeric<Float>(1.25f);
        Numeric <Double> d = new Numeric<Double>(-1.25);
        Numeric <Integer> e = new Numeric<Integer>(-5);
        Numeric <Long> f = new Numeric<Long>(-5L);        

        if(d.abcEquals(c)) {
            System.out.println("Absolute values are the same ");
        }
        else System.out.println("Absolute values do not match ");

        if(e.abcEquals(f)) {
            System.out.println("Absolute values are the same ");
        }
        else System.out.println("Absolute values do not match ");
    } 
}
