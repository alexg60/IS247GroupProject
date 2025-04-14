import java.util.Random;

public class Employee {
    private String Name;
    private String Title;
    private double Salary;
    private int ID;

    Employee(){
        this.Name = "Blank Name";
        this.Title = "Sales-Person";
        this.Salary = 25000;
        Random random = new Random();
        this.ID = random.nextInt(100000);
    }

    Employee(String name, String title, double salary){
        this.Name = name;
        this.Title = title;
        this.Salary = salary;
        Random random = new Random();
        this.ID = random.nextInt(100000);
    }

    Employee(String name, double salary){
        this.Name = name;
        this.Title = "Car Sales-Person";
        this.Salary = salary;
        Random random = new Random();
        this.ID = random.nextInt(100000);    }

    @Override
    public String toString(){
        return "Employee Name: " + Name + "\nEmployee Title: " + Title + "\nEmployee Salary: " + Salary +
                "\nEmployee ID: " + ID;
    }


}
