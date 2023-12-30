import java.util.Scanner;

public class takeIntegerUntilXero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int userInput = in.nextInt();
        int primaryValue = 0;
        while(userInput != 0){
            primaryValue = primaryValue + userInput;
            userInput = in.nextInt();
        }
        System.out.println(primaryValue);
    }
}

