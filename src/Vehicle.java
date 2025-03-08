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




    @Override
    public String toString(){
        return ("Vehicle Make: " + Make + "\nVehicle Model: " + Model + "\nVehicle Year: " + Year +
                "\nVehicle Color: " + Color + "\nVehilce Cost: $" + Price);
    }

}
