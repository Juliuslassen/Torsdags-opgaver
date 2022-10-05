package Task1;

public class Car {

    private String manufacturer;
    private String model;
    private int year;
    private String bodyStyle;
    private Driver driver;

    public Car(String manufacturer, String model, int year, String bodyStyle){
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.bodyStyle = bodyStyle;

    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }

    @Override
    public String toString() {
        return "manufacturer: " + manufacturer + ".\n"+
        "Model: " + model+ ", ("+ year +"). \nBodystyle: " + bodyStyle;
    }
}
