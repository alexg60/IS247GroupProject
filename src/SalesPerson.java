import javax.lang.model.element.Name;

public class SalesPerson extends Employee{
    private double commissionRate;
    private double totalSales;
    private double commissionEarnings;
    SalesPerson(){
        super();
        this.Name = "Blank Employee";
        this.Title = "Sales-Person";
        this.Salary = 10000;
        this.commissionRate = 0.1;
        this.totalSales = 0;
    }

    SalesPerson(String name,double salary,double rate, double initialSales){
        super();
        this.Name = name;
        this.Salary = salary;
        this.Title = "Sales-Person";
        this.commissionRate = rate;
        this.totalSales = initialSales;

    }


    //Getters and Setters Below
    //Salary
    public double getSalary(){
        return this.Salary;
    }
    public void setSalary(double salary){
        this.Salary = salary;
    }
    //Name
    public String getName(){
        return this.Name;
    }
    public void setName(String name){
        this.Name = name;
    }
    //Title
    public String getTitle(){
        return this.Title;
    }
    //Commission Rate
    public double getCommissionRate(){
        return this.commissionRate;
    }
    public void setCommissionRate(double rate){
        this.commissionRate = rate;
    }
    //Sales
    public double getTotalSales(){
        return this.totalSales;
    }
    public void setTotalSales(double sale){
        this.totalSales = sale;
    }

    public void addSales(double sale){
        this.totalSales += sale;
    }

    public void addCommissionSales(double commission){
        this.commissionEarnings += commission;
    }

    @Override
    public String toString(){
        return "\nEmployee Name: " + Name + "\nEmployee Title: " + Title + "\nEmployee Salary: " + Salary +
                "\nEmployee Sales: " + totalSales + "\nEmployee ID: " + ID + "\n";
    }

}
