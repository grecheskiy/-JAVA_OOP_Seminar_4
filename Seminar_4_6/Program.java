package Seminar_4_6;

public class Program {
    public static void main(String[] args) {
        Array array = new Array();

        Integer[] intArray = { 1, 2, 3, 4, 5 };
        String[] strArray = { "one", "two", "three", "four", "five" };
 
        array.<Integer>printArray(intArray);
        array.<String>printArray(strArray);
    }
}
