/**
 * Java 1.Home Work #1
 *
 * @author Ivan
 * @version 09.02.2022
 */
public class HomeWorkOne {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    
    static void hello() {
        System.out.println("Hello!");
    }
    
    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    
    static void checkSumSign() {
        int a = 22;
        int b = a/11 * 2;
        //if (a + b >= 0) {
        //    System.out.println("Сумма положительная");
        //} else {
        //    System.out.println("Сумма отрицательная");
        //}
        System.out.println(a + b >= 0? "Сумма положительная" : "Сумма отрицательная");
    }
    
    static void printColor() {
        int value = 35;
        if (value < 0) {
            System.out.println("Красный");
        }
        if (value >0 && value <= 100) {
            System.out.println("Жёлтый");
        }
        if (value > 100) {
            System.out.println("Зелёный");
        }
    }
    
    static void compareNumbers() {
        int a = 200;
        int b = 33;
        //if (a >= b) {
        //    System.out.println("a >= b");
        //} else {
        //    System.out.println("a < b");
        //}
        System.out.println(a >= b? "a >= b" : "a < b");
    }
}
