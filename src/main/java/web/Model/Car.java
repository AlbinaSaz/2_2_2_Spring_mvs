package web.Model;

public class Car {

    private String model;
    private int power;
    private String color;

    public Car(){};

    public Car(String model, int power, String color) {
        this.model = model;
        this.power = power;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", power=" + power +
                ", color='" + color + '\'' +
                '}';
    }
}
