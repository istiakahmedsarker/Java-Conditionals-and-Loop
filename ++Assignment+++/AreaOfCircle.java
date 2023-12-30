import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int radius = in.nextInt();
        double ans = radius*radius* Math.PI;
        System.out.println(ans);
    }
}
