import java.lang.reflect.Array;
import java.util.*;

/**
 * This is the main method that takes in inputs and connects the other classes to
 * run the Car Dealership Management System
 */
public class Main {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        int value;

        //Base Line Inventory
        Vehicle car1 = new Vehicle();
        Vehicle car2 = new Vehicle("Ford","F-150",2020,"Blue", 22999);
        ArrayList<Vehicle> listOFVehicles = new ArrayList<>();
        listOFVehicles.add(car1);
        listOFVehicles.add(car2);

        Employee employee2 = new Employee("Abdul Yagub", "Manager",100000);
        Employee employee3 = new Employee("MJ Sands","Mechanic",75000);
        ArrayList<Employee> listOFEmployees = new ArrayList<>();
        listOFEmployees.add(employee2);
        listOFEmployees.add(employee3);
        SalesPerson salesPerson1 = new SalesPerson();
        SalesPerson salesPerson2 = new SalesPerson("Alex Gilbert",50000,0.24,15000);
        ArrayList<SalesPerson> listOFSalesPeople = new ArrayList<>();
        listOFSalesPeople.add(salesPerson1);
        listOFSalesPeople.add(salesPerson2);

        do{
            System.out.println("===== Welcome to the Car Dealership Management System =====");
            System.out.println("1: View All Inventory");
            System.out.println("2: Add New Car");
            System.out.println("3: Remove Car");
            System.out.println("4: Financing");
            System.out.println("5: Sales");
            System.out.println("6: Car API LookUp");
            System.out.println("7: Employees");
            System.out.println("8: Quit");
            System.out.print("Enter a number matching an option above: ");
            value = scan.nextInt();
            System.out.println();
            switch(value){
                case 1:
                    //Vehicle.listAllVehicles
                    System.out.println(" ==== List of Vehicles ==== ");
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
                    System.out.println(" ===== Financing ===== ");
                    InventoryManager.listAllVehicles(listOFVehicles);
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
                    try{
                        Financing.getFinancing(listOFVehicles.get(carNumber), creditScore, loanYears);;
                    } catch (myCustomException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println(" ===== Sales ===== ");
                    Vehicle newVehicle = new Vehicle();
                    SalesPerson newSales = new SalesPerson();
                    if (listOFVehicles.isEmpty()) {
                        System.out.println("There are no vehicles in inventory to sell.");
                    } else {
                        for (int i = 0; i < listOFVehicles.size(); i++) {
                            System.out.println(i + 1 + ": \n" + listOFVehicles.get(i));
                        }
                        System.out.print("Enter the number of the vehicle you want to sell: ");
                        int numOfVehicle = (int) scan.nextInt() - 1;
                        newVehicle = listOFVehicles.get(numOfVehicle);
                    }
                    if(listOFSalesPeople.isEmpty()){
                        System.out.println("The Sales People list is empty.");
                    }else{
                        for (int i = 0; i < listOFSalesPeople.size(); i++) {
                            System.out.println(i + 1 + ": \n" + listOFSalesPeople.get(i));
                        }
                        System.out.print("Enter the number of the Sales Person that is making the sale: ");
                        int numOfEmployee = (int)scan.nextInt() - 1;
                        newSales = listOFSalesPeople.get(numOfEmployee);
                    }
                    InventoryManager.saleOfVehicle(newVehicle, newSales);
                    listOFVehicles.remove(newVehicle);
                    break;
                case 6:
                    /*This was supposed ot be a connection to the Kelly Blue Book API where you input a cars VIN number
                      and it displays the cars CARFAX and specifications, but access to that API cost money
                     */
                    CarAPI apiClient = new CarAPI();
                    String make = "Toyota";
                    String model = "Camry";
                    String carData = apiClient.getCarInfo(make, model);
                    System.out.println("Car Data: ");
                    String prettyJson = formatJson(carData);
                    System.out.println(prettyJson);
                    break;
                case 7:
                    System.out.println("Do you want to see employees or sales people: \n1: Employees \n2: Sales People");
                    System.out.print("Enter the number (1 or 2): ");
                    int choice = scan.nextInt();
                    if(choice != 1 && choice != 2){
                        System.out.println("Error: Enter a number between 1 and 2");
                        choice = scan.nextInt();
                    }
                    switch (choice){
                        case 1:
                            System.out.println(" ==== Employee Management ==== ");
                            System.out.println("1: Add Employee");
                            System.out.println("2: Remove Employee");
                            System.out.println("3: View Employees");
                            System.out.println("Enter a number matching the options above: ");
                            int choice2 = scan.nextInt();
                            if(choice2 == 1){
                                EmployeeManager.addEmployee(listOFEmployees);
                            } else if (choice2 == 2) {
                                EmployeeManager.removeEmployee(listOFEmployees);
                            } else if (choice2 == 3) {
                                EmployeeManager.listAllEmployees(listOFEmployees);
                            } else {
                                System.out.println("Error: Enter a number between 1-3");
                            }
                            break;
                        case 2:
                            System.out.println(" ==== Sales People Management ==== ");
                            System.out.println("1: Add Sales Person");
                            System.out.println("2: Remove Sales Person");
                            System.out.println("3: View Sales People");
                            System.out.println("Enter a number matching the options above: ");
                            choice2 = scan.nextInt();
                            if(choice2 == 1){
                                EmployeeManager.addSalesPerson(listOFSalesPeople);
                            } else if (choice2 == 2) {
                                EmployeeManager.removeSalesPerson(listOFSalesPeople);
                            } else if (choice2 == 3) {
                                EmployeeManager.listAllSalesPeople(listOFSalesPeople);
                            } else {
                                System.out.println("Error: Enter a number between 1-3");
                            }
                            break;
                    }
                    break;
                case 8:
                    System.out.println("Quitting Dealership Management System");
                    loop = false;
                    break;
                default:
                    System.out.println("Error: Invalid Input. Enter an Integer between 1 and 8.");
            }
        }while(loop);


    }

    /**
     * A return String method that formats the way the Json API data is displayed to make it easier to read and more
     * appealing to look at
     * @param json
     * @return
     */
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