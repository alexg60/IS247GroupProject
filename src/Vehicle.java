public class Vehicle {
    private String Make;
    private String Model;
    private int Year;
    private String Color;
    public double Price;

    public Vehicle(){
        this.Make = "Ford";
        this.Model = "Ranger";
        this.Year = 2003;
        this.Color = "Red";
        this.Price = 2999.99;
    }

    public Vehicle(String make, String model, int year, String color, double price){
        this.Make = make;
        this.Model = model;
        this.Year = year;
        this.Color = color;
        this.Price = price;
    }

    public Vehicle(String make, String model, int year, double price){
        this.Make = make;
        this.Model = model;
        this.Year = year;
        this.Price = price;
        this.Color = "white";
    }

    public double getPrice() {
        return Price;
    }

    public int getYear() {
        return Year;
    }

    public String getColor() {
        return Color;
    }

    public String getMake() {
        return Make;
    }

    public String getModel() {
        return Model;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setMake(String make) {
        Make = make;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public void setYear(int year) {
        Year = year;
    }

    /**
     * Overidding the toString method to format how information
     * is printed
     * @return
     */
    @Override
    public String toString(){
        return ("Vehicle Make: " + Make + "\nVehicle Model: " + Model + "\nVehicle Year: " + Year +
                "\nVehicle Color: " + Color + "\nVehilce Cost: $" + Price + "\n\n");
    }

}
