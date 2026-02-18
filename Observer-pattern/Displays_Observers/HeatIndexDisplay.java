package Displays_Observers;

public class HeatIndexDisplay implements IObserver, IDisplay {

    private float heatIndex;
    private double temperature;
    private float humidity;

    
    @Override
    public void display() {
        System.out.println("Current Heat Index: " + calcularIndiceCalor(getTemperature(),(double) getHumidity())+ "°C");
    }
    
    public double calcularIndiceCalor(double T, double R) {

        // Constantes de la ecuación
        double c1 = -8.78469475556;
        double c2 = 1.61139411;
        double c3 = 2.33854883889;
        double c4 = -0.14611605;
        double c5 = -0.012308094;
        double c6 = -0.0164248277778;
        double c7 = 2.211732e-3;
        double c8 = 7.2546e-4;
        double c9 = -3.582e-6;
        
        // Fórmula del índice de calor
        double HI = c1
        + (c2 * T)
        + (c3 * R)
        + (c4 * T * R)
        + (c5 * T * T)
        + (c6 * R * R)
        + (c7 * T * T * R)
        + (c8 * T * R * R)
        + (c9 * T * T * R * R);
        
        return HI;
    }
    
    public float getHeatIndex() {
        return heatIndex;
    }
    
    @Override
    public void update(float value) {
        setHumidity(value);
    }

    public void update(double value){
        setTemperature(value);
    }

    public float getTemperature() {
        return (float) temperature;
    }
    
    public void setTemperature(double value) {
        this.temperature = value;
    }
    
    public float getHumidity() {
        return humidity;
    }
    
    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
}
