import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the numbers and input x to quit");
        ArrayList <Integer>  givenNumbers = new ArrayList<>();
        String userInput = in.next();
        int avg = 0;

        while(true){
            if(userInput.charAt(0) == 'x' || userInput.charAt(0) == 'X' ){
                break;
            }
            else{
                int integerUserInput = Integer.parseInt(userInput);
                givenNumbers.add(integerUserInput);
                for(int i=0;i< givenNumbers.size();i++){
                    int singleInt = givenNumbers.get(i);
//                    avg = avg + singleInt;
                    System.out.println(singleInt);
                }

            }
            userInput = in.next();
        }
//        avg  = avg / givenNumbers.size();
//        System.out.println(avg);
        System.out.println(avg);
//        System.out.println(givenNumbers);
        System.out.println(givenNumbers.size());
    }
}