import java.util.Scanner;

public class Cars extends Showroom implements utility{

    String car_name;
    String car_color;
    String car_fuel_type;
    int car_price;
    String car_type;
    String car_transmission;


    @Override
    public void get_details() {
        System.out.println("NAME: "+ car_name);
        System.out.println("COLOR: "+ car_color);
        System.out.println("FUEL TYPE: "+ car_fuel_type);
        System.out.println("PRICE: "+ car_price);
        System.out.println("TRANSMISSION"+ car_transmission);

    }

    @Override
    public void set_details() {
        Scanner sc= new Scanner(System.in);
        System.out.println("==================================== *** ENTER CAR DETAIL *** ====================================");
        System.out.println();
        System.out.println("CAR NAME: ");
        car_name = sc.nextLine();
        System.out.println("CAR COLOR: ");
        car_color = sc.nextLine();
        System.out.println("FUEL TYPE: ");
        car_fuel_type = sc.nextLine();
        System.out.println("CAR PRICE: ");
        car_price = sc.nextInt();
        System.out.println("TRANSMISSION");
        car_transmission = sc.nextLine();
        total_cars_in_stock++;


    }
}
