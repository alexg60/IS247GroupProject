import java.util.Random;

/**
 * Created By Alex Gilbert
 * Employee Class for storing personal information
 * Employee Call with fields
 */

public class Employee {
    /**
     * Name of the Employee
     */
    private String Name;
    /**
     * Job Title of the Employee
     */
    private String Title;
    /**
     * Salary of the Employee
     */
    private double Salary;
    /**
     * Personal Identification Number of the Employee
     */
    private int ID;

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
     * @param name
     * @param title
     * @param salary
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
     * @param name
     * @param salary
     */
    Employee(String name, double salary){
        this.Name = name;
        this.Title = "Car Sales-Person";
        this.Salary = salary;
        Random random = new Random();
        this.ID = random.nextInt(100000);    }

    /**
     * Overide the toString Method to format the way the information is printed
     * @return
     */
    @Override
    public String toString(){
        return "Employee Name: " + Name + "\nEmployee Title: " + Title + "\nEmployee Salary: " + Salary +
                "\nEmployee ID: " + ID;
    }


}
