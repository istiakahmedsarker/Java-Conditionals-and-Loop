import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int i = 0;

        if(a / 10 == 3 ){
            System.out.println("it's dvisible" + a);
            i++;
            System.out.println("its divisible");
        }
        System.out.println("it's not dvisible" + a);
    }
}
