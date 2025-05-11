import java.util.Random;

/**
 * Created By Alex Gilbert
 * Employee Class for storing personal information with properties of name, title, salary, and ID
 * Employee Call with fields with getters and setters for manipulaiton
 */

public class Employee {
    /**
     * Name of the Employee
     */
    String Name;
    /**
     * Job Title of the Employee
     */
    String Title;
    /**
     * Salary of the Employee
     */
    double Salary;
    /**
     * Personal Identification Number of the Employee
     */
    int ID;

    /**
     * Blank Constructor for Employee
     * This is a constructor to initialize Employee
     */
    Employee(){
        this.Name = "Blank Name";
        this.Title = "Sales-Person";
        this.Salary = 25000;
        Random random = new Random();
        this.ID = random.nextInt(100000);
    }

    /**
     * This is a constructor to initialize Employee
     * @param name the name of the employee
     * @param title the job title of the employee
     * @param salary the salary of the employee
     */
    Employee(String name, String title, double salary){
        this.Name = name;
        this.Title = title;
        this.Salary = salary;
        Random random = new Random();
        this.ID = random.nextInt(100000);
    }

    /**
     * This is a constructor to initialize Employee without Job Title
     * @param name the name of the employee
     * @param salary the salary of the employee
     */
    Employee(String name, double salary){
        this.Name = name;
        this.Title = "Employee";
        this.Salary = salary;
        Random random = new Random();
        this.ID = random.nextInt(100000);    }

    /**
     * Overide the toString Method to format the way the information is printed
     * @return String
     */
    @Override
    public String toString(){
        return "\nEmployee Name: " + Name + "\nEmployee Title: " + Title + "\nEmployee Salary: " + Salary +
                "\nEmployee ID: " + ID + "\n";
    }


}
