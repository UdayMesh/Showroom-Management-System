import java.util.Scanner;

public class Showroom implements utility{

    String showroom_name;

    String showroom_address;

    String manager_name;

    int total_employees;

    int total_cars_in_stock = 0;

    @Override
    public void get_details() {
        System.out.println("Showroom name: "+ showroom_name);
        System.out.println("Showroom Adreesss: "+showroom_address);
        System.out.println("Manager Name: "+ manager_name);
        System.out.println("Total Employees: "+total_employees);
        System.out.println("Total Cars In Stock"+ total_cars_in_stock);
    }

    @Override
    public void set_details() {
        Scanner sc= new Scanner(System.in);
        System.out.println("==================================== *** ENTER SHOWROOM NAME *** ====================================");
        System.out.println();
        System.out.println("ENTER SHOWROOM NAME");
        showroom_name = sc.nextLine();
        System.out.println("SHOWROOM ADDRESS");
        showroom_address = sc.nextLine();
        System.out.println("MANAGER NAME");
        manager_name = sc.nextLine();
        System.out.println("TOTAL EMPLOYEES");
        total_employees = sc.nextInt();
        System.out.println("TOTAL CARS");
        total_cars_in_stock = sc.nextInt();


    }
}
