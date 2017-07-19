package xyz.samsonovs.TemplateJSP.simplecode.classes;

/**
 * Created by Костя on 15.07.2017.
 */
public class Car {
    private String developer;
    private String model;
    private String color;
    private int distance=0;
    private int year=0;

    public Car()
    {
        this.developer="Toyota";
        this.color="White";
        this.distance=0;
    }

    public Car(String a)
    {
        this.developer="Toyota";
        this.color="White";
        this.distance=0;
        this.model=a;
    }

    public void driveToMSK(){
        this.distance+=13;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }
}
