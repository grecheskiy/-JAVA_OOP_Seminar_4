package Seminar_4_4;

public class Summa {
    int sum;

    <T extends Number> Summa(T arg) {

        sum = 0; //значения передаются конструктору, конструктор сделал обобщенным
        for (int i = 0; i <= arg.intValue(); i++) {
           sum += i; 
        }
    }
    int getSum() {
    return sum;
    }
}
