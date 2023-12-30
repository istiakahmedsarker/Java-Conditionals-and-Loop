import java.util.ArrayList;
import java.util.Scanner;

public class FactorsOfANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int primaryValue = 1;
        ArrayList<Integer> factors = new ArrayList<>();
        while(primaryValue < n){
            if(n % primaryValue == 0){
                factors.add(primaryValue);

            }
            primaryValue++;
        }
        System.out.println(factors);
    }
}
