public class Vehicle {
    private String Make;
    private String Model;
    private int Year;
    private String Color;

    public Vehicle(String make, String model, int year, String color){
        this.Make = make;
        this.Model = model;
        this.Year = year;
        this.Color = color;
    }

    public Vehicle(String make, String model, int year){
        this.Make = make;
        this.Model = model;
        this.Year = year;
    }

}
