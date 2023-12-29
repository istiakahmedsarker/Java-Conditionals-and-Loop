import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

//        for(int i = 1;i <= n;i++){
//            System.out.println(i);
//        }
        int num = n;

//        while(num <=5){
//            System.out.println(num);
//            num += 1;
//        }

        do{
            System.out.println(num);
            num++;
        }while(num <=5);
    }
}
