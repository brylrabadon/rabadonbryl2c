package activity4;

import java.util.Scanner;

public class activity4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  

        String name;
        int rate, ttl;
        float wage, ctb, net;

        System.out.print("Enter employee name: ");
        name = sc.nextLine();

        System.out.print("Enter hourly rate: ");
        rate = Integer.parseInt(sc.nextLine());  
        System.out.print("Enter total hours worked this week: ");
        ttl = Integer.parseInt(sc.nextLine());  

        wage = rate * ttl;
        ctb = wage * 0.10f;
        net = wage - ctb;

        System.out.println("\n===== Wage Summary =====");
        System.out.println("Employee: " + name);
        System.out.printf("Hourly Rate: ₱%.2f\n", (float)rate);
        System.out.println("Hours Worked: " + ttl);
        System.out.printf("Gross Pay: ₱%.2f\n", wage);
        System.out.printf("SSS Contribution (10%%): ₱%.2f\n", ctb);
        System.out.println("----------------------------");
        System.out.printf("Net Weekly Wage: ₱%.2f\n", net);

        sc.close();
    }
}