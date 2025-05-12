import javax.lang.model.element.Name;

/**
 * Created By Alex Gilbert
 * Sales Person class is a class extended from the Employee Class
 * Stores information
 */
public class SalesPerson extends Employee{
    private double commissionRate;
    private double totalSales;
    private double commissionEarnings;

    /**
     * Initializes a blank constructor with standard values
     */
    SalesPerson(){
        super();
        this.Name = "Blank Employee";
        this.Title = "Sales-Person";
        this.Salary = 10000;
        this.commissionRate = 0.1;
        this.totalSales = 0;
    }

    /**
     *
     * @param name String name of the sales person
     * @param salary double salary of the sales person
     * @param rate double Commission rate / percentage of sales sales person receives
     * @param initialSales double amount of sales the salesman has at time of creation
     */
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

    /**
     * Returns salary
     * @return
     */
    public double getSalary(){
        return this.Salary;
    }

    /**
     * changes salary
     * @param salary
     */
    public void setSalary(double salary){
        this.Salary = salary;
    }
    //Name

    /**
     * Returns sales person name
     * @return
     */
    public String getName(){
        return this.Name;
    }

    /**
     * sets sales person name
     * @param name
     */
    public void setName(String name){
        this.Name = name;
    }
    //Title

    /**
     * returns sales person title
     * @return
     */
    public String getTitle(){
        return this.Title;
    }
    //Commission Rate

    /**
     * return sales person commission rate
     * @return
     */
    public double getCommissionRate(){
        return this.commissionRate;
    }

    /**
     * sets sales person commission rate
     * @param rate
     */
    public void setCommissionRate(double rate){
        this.commissionRate = rate;
    }
    //Sales

    /**
     * returns sales person tatal sales
     * @return
     */
    public double getTotalSales(){
        return this.totalSales;
    }

    /**
     * set sales person total sales
     * @param sale
     */
    public void setTotalSales(double sale){
        this.totalSales = sale;
    }

    /**
     * adds a sales to the total sale with inputed sale
     * @param sale
     */
    public void addSales(double sale){
        this.totalSales += sale;
    }

    /**
     * adds an amount total commission earned
     * @param commission
     */
    public void addCommissionSales(double commission){
        this.commissionEarnings += commission;
    }

    /**
     * Overides the toString method, which formats how the information is displayed
     * @return
     */
    @Override
    public String toString(){
        return "\nEmployee Name: " + Name + "\nEmployee Title: " + Title + "\nEmployee Salary: " + Salary +
                "\nEmployee Sales: " + totalSales + "\nEmployee ID: " + ID + "\n";
    }

}
