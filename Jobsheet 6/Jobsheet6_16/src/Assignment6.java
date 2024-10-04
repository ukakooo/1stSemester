import java.util.Scanner;
public class Assignment6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int angle1, angle2, angle3, angleTotal;

        System.out.print("Input 1st angle: ");
        angle1 = sc.nextInt();
        System.out.print("Input 2nd angle: ");
        angle2 = sc.nextInt();
        System.out.print("Input 3rd angle: ");
        angle3 = sc.nextInt();

        angleTotal = angle1 + angle2 + angle3;

        if (angleTotal == 180) {
            if (angle1 == angle2 && angle1 == angle3 && angle2 == angle3) {
                System.out.println("The triangle is Equiangular");
            } else if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println("The triangle is Obtuse Angled");
            } else if (angle1 < 90 && angle2 < 90 && angle3 < 90) {
                System.out.println("The triangle is Acute Angled");
            }
        } else 
            System.out.println("Invalid triangle angles");
        
            sc.close();
    } 
}