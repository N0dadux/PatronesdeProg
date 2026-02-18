package Subjects;

import java.util.ArrayList;
import java.util.List;

import Displays_Observers.*;

public class WeatherDataObject implements ISubject {
    private float[] data;
    private List<IObserver> observers;

    public WeatherDataObject(float[] data) {
        this.data = data;
        this.observers = new ArrayList<IObserver>();
    }

    public void dataChange() {
        // Notify observers about data change
    }

    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            if (observer instanceof TempDisplay) {
                observer.update(this.data[0]);
            } else if (observer instanceof HumidityDisplay) {
                observer.update(this.data[1]);
            } else if (observer instanceof PressureDisplay) {
                observer.update(this.data[2]);
            }
        }
    }

    public List<IObserver> getObservers() {
        return observers;
    }

    public void setObservers(List<IObserver> observers) {
        this.observers = observers;
    }
}
