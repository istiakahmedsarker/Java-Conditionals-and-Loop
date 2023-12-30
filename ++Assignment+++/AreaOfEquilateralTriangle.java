import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please provide the side");
        int side = in.nextInt();
        double area = side *side * Math.sqrt(3) /4;
        System.out.println(area);
    }
}
