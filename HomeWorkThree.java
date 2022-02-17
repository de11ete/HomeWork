/**
 * Java 1.Home Work #3
 *
 * @author Ivan
 * @version 17.02.2022
 */
import java.util.Arrays;
import java.util.Scanner;

class HomeWorkThree {
    public static void main(String[] args) {
        System.out.println("Task 1: ");
        invertArray();
        System.out.println("\nTask 2: ");
        fillArray ();
        System.out.println("\nTask 3: ");
        changeArray();
        System.out.println("\nTask 4: ");
        fillDiagonal();
        System.out.println("Task 5: ");
        inValue(5, 2);
    }
    
    static void invertArray() {
        int[] arr = {1, 0, 0, 1, 1, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }
    
    static void fillArray () {
        int[] arr = new int [100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }
    
    static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }
    
    static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][i] = 1;
                arr[i][4 - i - 1] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void inValue(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }
}

