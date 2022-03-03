package Pack;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int rangeMax = 2000;
        int rangeMin = 1000;
        Employee emp = new Employee();
        Employee emp2 = new Employee();
        emp.setName("Tibor");
        emp.setPayment(1500);
        System.out.println(emp);
        emp.increasePayment(500);
        System.out.println(emp);

        emp2.setName("Bence");
        emp2.setPayment(1500);

        System.out.println(emp2);


        if (emp.isPaymentInRange(rangeMin, rangeMax)) {
            System.out.println("Payment is in Range of 1000 - 2000");
        } else {
            System.out.println("Payment isn't in Range of 1000 - 2000");
        }

        System.out.println("Tax: " + emp.tax());

        if (emp.greaterThanOtherEmployee(emp2)) {
            System.out.println("Emp has greater payment than emp2");
        } else {
            System.out.println("Emp hasn't got greater payment than emp2");
        }


        System.out.println("/////////////////////////////");
        System.out.println();
        System.out.println();

        int size = 3;
        Employee[] emps = new Employee[size];

        empSet(emps);
        empPrint(emps);

        System.out.println("She/he has the greatest Payment: " + greatestPayment(emps));
        System.out.println("Number of the employees whom Payment is in range of (1000-2000) :" + paymentIsInRangeArr(emps, rangeMin, rangeMax));

        System.out.println("The avarage Payment is: " + avaragePayment(emps));
        System.out.println("All employee payed tax: " + payedTax(emps));


    }

    private static int payedTax(Employee[] emps) {
        int sum = 0;
        for (Employee employee :
                emps) {

            sum = sum + (int) employee.tax();

        }
        return sum;
    }

    private static double avaragePayment(Employee[] emps) {
        double avg = 0;

        for (Employee employee :
                emps) {
            avg += employee.getPayment();
        }
        avg = avg / emps.length;
        return avg;
    }

    private static int paymentIsInRangeArr(Employee[] emps, int min, int max) {
        int sum = 0;

        for (Employee employee :
                emps) {

            if (max > employee.getPayment() && employee.getPayment() > min) {
                sum++;
            }

        }

        return sum;
    }

    private static String greatestPayment(Employee[] emps) {

        int max = 0;
        String name = "";
        for (Employee employee : emps) {

            if (max < employee.getPayment()) {
                max = employee.getPayment();
                name = employee.getName();
            }

        }
        return name;
    }

    private static void empPrint(Employee[] emps) {
        for (Employee employee : emps) {
            System.out.println(employee);
        }
    }

    private static void empSet(Employee[] emps) {
        for (int i = 0; i < emps.length; i++) {
            emps[i] = new Employee();
            emps[i].setName(scanString());
            emps[i].setPayment(scanInt());
        }
    }

    private static int scanInt() {
        System.out.println("Type a number!");
        Scanner sc = new Scanner(System.in);
        int x;
        do {
            while (!sc.hasNextInt()) {
                System.out.println("Thats not a number;");
                sc.next();

            }
            x = sc.nextInt();
        } while (x <= 0);
        return x;
    }

    private static String scanString() {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Type a name!");
        do {
            s = sc.nextLine();
        } while (s.length() < 2);

        return s;
    }
}
