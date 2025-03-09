import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        int value;

        //Simple Testing of Code Systems (Will be romoved Later)
        Vehicle car1 = new Vehicle();
        System.out.println(car1.toString());

        Financing.getFinancing(car1, 700, 4);
        Financing.getFinancing(car1, 700, 5);
        Financing.getFinancing(car1, 700, 6);
        Financing.getFinancing(car1, 500, 6);
        Financing.getFinancing(car1, 200, 5);
        /*
        do{
            System.out.println("===== Welcome to the Car Dealership Management System =====");
            System.out.println("1: View All Inventory");
            System.out.println("2: Add New Car");
            System.out.println("3: Remove Car");
            System.out.println("4: Financing");
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
                    //Financing and or sales
                    System.out.println(" ===== Sales Page ===== ");
                    System.out.print("Enter name of the car object: ");
                    ----- Figure out how to input the object name into the method -----
                    System.out.print("Enter the customer's credit score: ");
                    int creditScore = scan.nextInt();
                    System.out.print("Enter the length of the loan in years: );
                    int loanYears = scan.nextInt();
                    ----- add error prevention for all the inputs -----
                    Financing.getFinancing(carObject, creditScore, loanYears);
                    break;
                case 5:
                    loop = false;
                    break;
                default:
                    System.out.println("Error: Invalid Input. Enter an Integer between 1 and 5.");
            }
        }while(loop);

         */
    }
}