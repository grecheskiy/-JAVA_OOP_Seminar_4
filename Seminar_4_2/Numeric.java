package Seminar_4_2;

public class Numeric <T extends Number>{ //наследуем, чтобы получить доступы ко всем числам
    T num;
    Numeric(T m) {
        num = m;
    }
    double dubReturn() {
        return 1 / num.doubleValue();
    }
    double dubRestReturn() {
        return num.doubleValue() - num.intValue();
    }

    boolean abcEquals(Numeric<?> a) {
        if (Math.abs(num.doubleValue()) == Math.abs(a.num.doubleValue())) {
            return true;
        } else {
            return false;
        }
    }
}
