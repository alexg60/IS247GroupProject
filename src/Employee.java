public class Employee {
    private String Name;
    private String Title;
    private double Salary;
    private int ID;

    Employee(){
        this.Name = "Blank Name";
        this.Title = "Sales-Person";
        this.Salary = 25000;
        this.ID = 1;
    }

    Employee(String name, String title, double salary, int id){
        this.Name = name;
        this.Title = title;
        this.Salary = salary;
        this.ID = id;
    }

    Employee(String name, double salary, int id){
        this.Name = name;
        this.Title = "Car Sales-Person";
        this.Salary = salary;
        this.ID = id;
    }


}
