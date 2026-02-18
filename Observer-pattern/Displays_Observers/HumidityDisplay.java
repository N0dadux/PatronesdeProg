package Displays_Observers;

public class HumidityDisplay implements IObserver, IDisplay {

          private float humidity;

          @Override
          public void display() {
                    System.out.println("Current Humidity: "+ getHumidity() + "%");
          }

          @Override
          public void update(float value) {
                    setHumidity(value);
          }

          public float getHumidity() {
                    return humidity;
          }

          public void setHumidity(float humidity) {
                    this.humidity = humidity;
          }
}