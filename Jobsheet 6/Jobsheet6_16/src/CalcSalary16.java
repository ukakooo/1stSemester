import java.util.Scanner;
/**
 * CalcSalary16
 */
public class CalcSalary16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String category;
        int salary, netSalary;
        double fanumTax;
        
        System.out.print("Input category: ");
        category = sc.nextLine();
        System.out.print("Input salary value: ");
        salary = sc.nextInt();

        if (category.equalsIgnoreCase("employee")) {
            if (salary <= 2000000)
                fanumTax = 0.1;
            else if (salary <= 3000000)
                fanumTax = 0.15;
            else
                fanumTax = 0.2;
            netSalary = (int) (salary - (fanumTax * salary));
            System.out.println("Clean salary : " + netSalary);
        } else if (category.equalsIgnoreCase("businessman")) {
            if (salary <= 2500000)
                fanumTax = 0.15;
            else if (salary <= 3500000)
                fanumTax = 0.2;
            else
                fanumTax = 0.25;
            netSalary = (int) (salary - (fanumTax * salary));
            System.out.println("Net salary : " + netSalary);
        } else 
            System.out.println("Invalid category");

            sc.close();
    }
    
}