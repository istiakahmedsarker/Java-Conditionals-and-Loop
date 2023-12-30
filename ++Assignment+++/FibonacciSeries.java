import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <Integer> fibonacciSeries = new ArrayList<>();
        fibonacciSeries.add(0);
        fibonacciSeries.add(1);
        int userInput = in.nextInt();
        int num1 = 0;
        int num2 = 1;
        for (int i =1; i <= userInput;i++){
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            fibonacciSeries.add(sum);
        }
        System.out.println(fibonacciSeries);
    }
}
