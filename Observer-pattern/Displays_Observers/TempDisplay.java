package Displays_Observers;

public class TempDisplay implements IObserver, IDisplay {

    private float temp;

    @Override
    public void update(float value) {
        setTemp(value);
    }

    @Override
    public void display() {
        System.out.println("Current Temperature: " + getTemp() + "°C");
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

}
