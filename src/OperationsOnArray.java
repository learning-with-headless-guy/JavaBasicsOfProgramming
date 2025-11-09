import java.util.Scanner;

public class OperationsOnArray {
    void main() {
//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[5];
//
//        System.out.println("Enter 5 numbers:");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.println("Array elements are:");
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }

//        int[] arr = {1,2,3,4,5};
//        int sum = 0;
//        for (int i = 0; i < arr.length ; i++) {
//            sum = sum + arr[i]; //i = 0, sum = 0 + 1 = 1, sum = 1 + 2 = 3, sum = 3 + 3 = 6, sum = 6 + 4 = 10, ....
//        }
//        IO.println("Sum is " + sum);
//        sum  = 1 + 2 + 3 + 4 + 5 = 15

        int[] marks = {20, 35, 50, 20, 80, 30, 20, 60};
        int max = marks[0]; //20

        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i]; //35, 50, 55, 100
            }
        }

        IO.println("Maximum marks is "+ max);
    }
}
