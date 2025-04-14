import java.io.IOException;
import java.util.*;

// 
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
        Employee employee = new Employee();
        Employee employee1 = new Employee("Alex Gilbert","Branch Manager",125000);
        System.out.println(employee);
        System.out.println(employee1);

        do{
            System.out.println("===== Welcome to the Car Dealership Management System =====");
            System.out.println("1: View All Inventory");
            System.out.println("2: Add New Car");
            System.out.println("3: Remove Car");
            System.out.println("4: Financing");
            System.out.println("5: Car API LookUp");
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
                    CarAPI apiClient = new CarAPI();
                    String make = "Toyota";
                    String model = "Camry";

                    String carData = apiClient.getCarInfo(make, model);
                    System.out.println("Car Data: ");
                    String prettyJson = formatJson(carData);
                    System.out.println(prettyJson);
                    break;
                case 6:
                    System.out.println("Quitting Dealership Management System");
                    loop = false;
                    break;
                default:
                    System.out.println("Error: Invalid Input. Enter an Integer between 1 and 6.");
            }
        }while(loop);

        //Possible APIs to use
        //https://api-ninjas.com/api/cars


    }

    public static String formatJson(String json) {
        StringBuilder formatted = new StringBuilder();
        int indentLevel = 0;
        boolean inQuotes = false;

        for (char ch : json.toCharArray()) {
            switch (ch) {
                case '"':
                    formatted.append(ch);
                    if (ch == '"') {
                        inQuotes = !inQuotes;
                    }
                    break;
                case '{':
                case '[':
                    formatted.append(ch);
                    if (!inQuotes) {
                        formatted.append('\n');
                        indentLevel++;
                        formatted.append("  ".repeat(indentLevel));
                    }
                    break;
                case '}':
                case ']':
                    if (!inQuotes) {
                        formatted.append('\n');
                        indentLevel--;
                        formatted.append("  ".repeat(indentLevel));
                    }
                    formatted.append(ch);
                    break;
                case ',':
                    formatted.append(ch);
                    if (!inQuotes) {
                        formatted.append('\n');
                        formatted.append("  ".repeat(indentLevel));
                    }
                    break;
                case ':':
                    formatted.append(ch);
                    if (!inQuotes) {
                        formatted.append(" ");
                    }
                    break;
                default:
                    formatted.append(ch);
            }
        }
        return formatted.toString();
    }
}
