import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please provide the base");
        int radius = in.nextInt();
        System.out.println("Please provide the height");
        int height = in.nextInt();
        double area = radius*radius*height*Math.PI/3;
        System.out.println(area);
    }
}
