package Displays_Observers;

public class PressureDisplay implements IDisplay, IObserver{
          private float pressure;

          
          @Override
          public void update(float value) {
                    setPressure(value);
          }
          
          @Override
          public void display() {
                    System.out.println("Current pressure: "+ getPressure() + "mAtm");
          }
          
          public float getPressure() {
                    return pressure;
          }

          public void setPressure(float pressure) {
                    this.pressure = pressure;
          }


}
          
