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

        /*
        do{
            System.out.println("===== Welcome to the Car Dealership Management System =====");
            System.out.println("1: View All Inventory");
            System.out.println("2: Add New Car");
            System.out.println("3: Remove Car");
            System.out.println("4: Financing");
            System.out.println("5: Kelly Blue Book Lookup")
            System.out.println("6: Quit");
            System.out.print("Enter a number matching an option above: ");
            value = scan.nextInt();

            switch(value){
                case 1:
                    //Vehicle.listAllVehicles
                    for(Vehicle item : listOFVehicles){
                        System.out.print(item);
                    }
                    break;
                case 2:
                    //.AddNewVehcile
                    System.out.println("Adding Car");
                    System.out.print("Enter the make of the car: ");
                    String make = scan.next();
                    System.out.print("Enter the model of the car: ");
                    String model = scan.next();
                    System.out.print("Enter the Year of the car: ");
                    int year = scan.nextInt();
                    System.out.print("Enter the color of the car: ");
                    String color = scan.next();
                    System.out.print("Enter the price of the car: ");
                    double price = scan.nextDouble();

                    Vehicle newVehicle = new Vehicle(make, model, year, color, price);
                    listOfVehicles.add(newVehicle);

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

        Possible APIs to use
        https://api-ninjas.com/api/cars

         */
    }
}