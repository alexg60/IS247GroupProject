import java.util.ArrayList;
import java.util.Scanner;

public class InventoryManager {
    public static void addVehicle(ArrayList<Vehicle> listOFVehicles){
        Scanner scan = new Scanner(System.in);
        System.out.println(" ==== Adding Vehicle ==== ");
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
        listOFVehicles.add(newVehicle);
        System.out.println(" ==== Successfully Added Vehicle ==== ");
    }

    public static void removeVehicle(ArrayList<Vehicle> listOFVehicles){
        Scanner scan = new Scanner(System.in);
        if(listOFVehicles.isEmpty()){
            System.out.println("There are no vehicles in inventory to remove.");
        }else{
            for (int i = 0; i < listOFVehicles.size(); i++) {
                System.out.println(i + 1 + ": \n" + listOFVehicles.get(i));
            }
            System.out.print("Enter the number of the vehicle you want to remove: ");
            int numOfVehicle = (int)scan.nextInt() - 1;
            listOFVehicles.remove(numOfVehicle);
        }
    }

    public static void listAllVehicles(ArrayList<Vehicle> listOFVehicles){
        for(Vehicle item : listOFVehicles){
            System.out.print(item);
        }
    }

    public static void saleOfVehicle(Vehicle vehicleSold, SalesPerson newSalesPerson) {
        double carPrice = vehicleSold.getPrice();
        newSalesPerson.addSales(carPrice);
        double salesCommision = newSalesPerson.getCommissionRate() * carPrice;
        newSalesPerson.addCommissionSales(salesCommision);
        System.out.println("Vehicle Sold By: " + newSalesPerson.getName());
        System.out.println("Price Sold For: " + vehicleSold.getPrice());
        System.out.println("Commission Earned: " + salesCommision + "\n");
    }
}
