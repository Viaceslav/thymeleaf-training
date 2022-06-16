package pl.pawlowski.helloword;

public class Car {

    private String model;
    private String marka;

    public Car(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
}
