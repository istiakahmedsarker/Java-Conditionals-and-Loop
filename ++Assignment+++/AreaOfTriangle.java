import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please provide the base");
        int base = in.nextInt();
        System.out.println("Please provide the height");
        int height = in.nextInt();
        double area = base*height*0.5;
        System.out.println(area);
    }
}
