/**
 * Created by Alex Gilbert
 * Vehicle Class has the properties of make, model, year, color, and price
 * Class has different constructors to fit needs and has getters and setter to update information
 */

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

    /**
     *
     * @param make make of the vehicle
     * @param model model of the vehicle
     * @param year year the vehicle was manufactured
     * @param color color of the vehicle
     * @param price price of the vehicle
     */
    public Vehicle(String make, String model, int year, String color, double price){
        this.Make = make;
        this.Model = model;
        this.Year = year;
        this.Color = color;
        this.Price = price;
    }

    /**
     *
     * @param make make of the vehicle
     * @param model model of the vehicle
     * @param year year the vehicle was manufactured
     * @param price price of the vehicle
     */
    public Vehicle(String make, String model, int year, double price){
        this.Make = make;
        this.Model = model;
        this.Year = year;
        this.Price = price;
        this.Color = "white";
    }

    /**
     *
     * @return double price of the vehicle
     */
    public double getPrice() {
        return Price;
    }

    /**
     *
     * @return int year of manufacturing of the vehicle
     */
    public int getYear() {
        return Year;
    }

    /**
     *
     * @return String color of the vehicle
     */
    public String getColor() {
        return Color;
    }

    /**
     *
     * @return String make of the vehicle
     */
    public String getMake() {
        return Make;
    }

    /**
     *
     * @return String model of the vehicle
     */
    public String getModel() {
        return Model;
    }

    /**
     * Sets the color of the vehicle
     * @param color new color of the vehicle
     */
    public void setColor(String color) {
        Color = color;
    }

    /**
     * Sets the make of the vehicle
     * @param make new make of the vehicle
     */
    public void setMake(String make) {
        Make = make;
    }

    /**
     * Sets the model of the vehicle
     * @param model New model of the Vehicle
     */
    public void setModel(String model) {
        Model = model;
    }

    /**
     * Sets the price of the vehicle
     * @param price New Price of Vehicle
     */
    public void setPrice(double price) {
        Price = price;
    }

    /**
     * Sets the manufacturing year of the vehicle
     * @param year New make Year of the vehicle
     */
    public void setYear(int year) {
        Year = year;
    }

    /**
     * Overidding the toString method to format how information
     * is printed
     * @return String
     */
    @Override
    public String toString(){
        return ("Vehicle Make: " + Make + "\nVehicle Model: " + Model + "\nVehicle Year: " + Year +
                "\nVehicle Color: " + Color + "\nVehilce Cost: $" + Price + "\n\n");
    }

}
