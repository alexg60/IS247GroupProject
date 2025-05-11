import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManager {
    public static void addEmployee(ArrayList<Employee> listOFEmployees){
        Scanner scan = new Scanner(System.in);
        System.out.println(" ==== Adding Employee ==== ");
        System.out.print("Enter the Name of the Employee: ");
        String name = scan.nextLine();
        System.out.print("Enter the Salary of the Employee: ");
        double salary = scan.nextDouble();
        System.out.print("Enter the Title of the Employee: ");
        String title = scan.next();
        Employee newEmployee = new Employee(name, title, salary);
        listOFEmployees.add(newEmployee);
        System.out.println(" ==== Successfully Added Employee ==== ");
    }
    public static void addSalesPerson(ArrayList<SalesPerson> listOFSalesPerson){
        Scanner scan = new Scanner(System.in);
        System.out.println(" ==== Adding Sales Person ==== ");
        System.out.println("Enter the Name of the Sales Person: ");
        String sname = scan.next();
        System.out.println("Enter the Salary of the Sales Perosn: ");
        double ssalary = scan.nextDouble();
        System.out.println("Enter the Commision rate of the Sales Person (between 0 and 1): ");
        double commisionRate = scan.nextDouble();
        double totalSales = 0;
        SalesPerson newSales = new SalesPerson(sname, ssalary,commisionRate,totalSales);
        listOFSalesPerson.add(newSales);
        System.out.println(" ==== Successfully Added Employee ==== ");
    }

    public static void removeEmployee(ArrayList<Employee> listOFEmployees){
        Scanner scan = new Scanner(System.in);
        if(listOFEmployees.isEmpty()){
            System.out.println("There are no Employees to remove.");
        }else{
            for (int i = 0; i < listOFEmployees.size(); i++) {
                System.out.println(i + 1 + ": \n" + listOFEmployees.get(i));
            }
            System.out.print("Enter the number of the Employee you want to let go: ");
            int numOfEmployee = (int)scan.nextInt() - 1;
            listOFEmployees.remove(numOfEmployee);
        }
    }

    public static void removeSalesPerson(ArrayList<SalesPerson> listOFSalesPeople){
        Scanner scan = new Scanner(System.in);
        if(listOFSalesPeople.isEmpty()){
            System.out.println("There are no Employees to remove.");
        }else{
            for (int i = 0; i < listOFSalesPeople.size(); i++) {
                System.out.println(i + 1 + ": \n" + listOFSalesPeople.get(i));
            }
            System.out.print("Enter the number of the Sales Person you want to let go: ");
            int numOfEmployee = (int)scan.nextInt() - 1;
            listOFSalesPeople.remove(numOfEmployee);
        }
    }

    public static void listAllEmployees(ArrayList<Employee> listOFEmployees){
        for(Employee item : listOFEmployees){
            System.out.print(item);
        }
    }

    public static void listAllSalesPeople(ArrayList<SalesPerson> listOFSalesPeople){
        for(SalesPerson item : listOFSalesPeople){
            System.out.println(item);
        }
    }
}
