package pl.pjatk.robbrz;

public class Car {

    private  String make;
    private  String model;
    private  String color;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(String honda, String civic) {
        this.make = "Honda";
        this.model = "Civic";
        this.color = "Red";
    }
}
