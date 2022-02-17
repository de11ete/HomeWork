/**
 * Java 1.Home Work #2
 *
 * @author Ivan
 * @version 12.02.2022
 */
public class HomeWorkTwo {
    public static void main(String[] args) {
        System.out.println(checkSumSign(15, 7));
        chisloPositive(8);
        System.out.println(chisloNegative(-5));
        strokaChislo("Ho ho ho", 3);
    }
    
    static boolean checkSumSign(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }
    
    static void chisloPositive(int a) {
        System.out.println(a >= 0? "Число положительное" : "Число отрицательное");
    }
    
    static boolean chisloNegative(int a) {
        return a < 0;
    }
    
    static void strokaChislo(String s, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(s);
        }
    }
}
