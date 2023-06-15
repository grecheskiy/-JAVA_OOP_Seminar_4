package Seminar_4_5;

public class printElement<T> {
        T el;

    printElement(T e) {
        el = e;
    }

    T getEl() {
        return el;
    }

    void showElement() {
        System.out.println("Type T - " + el.getClass().getName());
    }
}
