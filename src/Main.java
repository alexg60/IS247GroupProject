import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        int value;


        do{
            System.out.println("===== Welcome to the Car Dealership Management System =====");
            System.out.println("1: View All Inventory");
            System.out.println("2: Add New Car");
            System.out.println("3: Remove Car");
            System.out.println("4: Get prices and loan amount");
            System.out.println("5: Quit");
            System.out.print("Enter a number matching an option above: ");
            value = scan.nextInt();

            switch(value){
                case 1:
                    //Vehicle.listAllVehicles
                    break;
                case 2:
                    //.AddNewVehcile
                    break;
                case 3:
                    //.RemoveVehicle
                    break;
                case 4:
                    //.acccounting
                    break;
                case 5:
                    loop = false;
                    break;
                default:
                    System.out.println("Error: Invalid Input. Enter an Integer between 1 and 4.");
            }
        }while(loop);
    }
}