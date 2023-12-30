import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please provide the length");
        int length = in.nextInt();
        System.out.println("Please provide the Width");
        int width = in.nextInt();
        double areaOfRectangle = length * width;
        System.out.println(areaOfRectangle);
    }
}
