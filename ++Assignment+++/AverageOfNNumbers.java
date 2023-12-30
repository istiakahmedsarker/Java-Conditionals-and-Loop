import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Tell how many numbers you want to input");
        ArrayList <Integer>  givenNumbers = new ArrayList<>();
        int userInput = in.nextInt();
        int avg = 0;

        while(true){

            String input = in.next();
            if(input.charAt(0) == 'x' || input.charAt(0) == 'X' ){
                break;
            }
            else{
                givenNumbers.add(userInput);
                for(int i=0;i< givenNumbers.size();i++){
                    int singleInt = givenNumbers.get(i);
                    avg = avg + singleInt;
                }
                avg  /= givenNumbers.size();
            }
        }
        System.out.println(avg);
    }
}