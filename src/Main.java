import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        int value;

        //Simple Testing of Code Systems (Will be romoved Later)
        Vehicle car1 = new Vehicle();
        Vehicle car2 = new Vehicle("Ford","F-150",2020,"Blue", 22999);
        ArrayList<Vehicle> listOFVehicles = new ArrayList<>();

        listOFVehicles.add(car1);
        listOFVehicles.add(car2);

        do{
            System.out.println("===== Welcome to the Car Dealership Management System =====");
            System.out.println("1: View All Inventory");
            System.out.println("2: Add New Car");
            System.out.println("3: Remove Car");
            System.out.println("4: Financing");
            System.out.println("5: Kelly Blue Book Lookup");
            System.out.println("6: Quit");
            System.out.print("Enter a number matching an option above: ");
            value = scan.nextInt();
            System.out.println();
            switch(value){
                case 1:
                    //Vehicle.listAllVehicles
                    InventoryManager.listAllVehicles(listOFVehicles);
                    break;
                case 2:
                    //AddNewVehcile
                    InventoryManager.addVehicle(listOFVehicles);
                    break;
                case 3:
                    //.RemoveVehicle
                    InventoryManager.removeVehicle(listOFVehicles);
                    break;
                case 4:
                    //Financing and or sales
                    System.out.println(" ===== Sales Page ===== ");
                    System.out.println("The Range of cars in the inventory: 1 - " + listOFVehicles.size());
                    System.out.print("Enter number of the car object: ");
                    int carNumber = scan.nextInt();
                    carNumber -= 1;
                    //----- Figure out how to input the object name into the method -----
                    System.out.print("Enter the customer's credit score (0-850): ");
                    int creditScore = (int) scan.nextInt();
                    if(creditScore > 850 || creditScore < 0){
                        System.out.println("Error: credit score not in valid range");
                        System.out.println("Enter a credit score between 0 and 850: ");
                        creditScore = scan.nextInt();
                    }
                    System.out.print("Enter the length of the loan in years: ");
                    int loanYears = scan.nextInt();
                    //----- add error prevention for all the inputs -----
                    Financing.getFinancing(listOFVehicles.get(carNumber), creditScore, loanYears);;
                    break;
                case 5:
                    /*
                    This is where to add the option to connect to the Kelly Blue Book API
                    the user will need to input a cars vin number which will then be used to loop up that vehicle
                     */
                    loop = false;
                    break;
                case 6:
                    loop = false;
                    break;
                default:
                    System.out.println("Error: Invalid Input. Enter an Integer between 1 and 6.");
            }
        }while(loop);

        //Possible APIs to use
        //https://api-ninjas.com/api/cars


    }
}