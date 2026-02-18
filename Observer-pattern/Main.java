import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> debugRegisters = new ArrayList<>();
        debugRegisters.add("Temperature Sensor Initialized");
        debugRegisters.add("Humidity Sensor Initialized");
        debugRegisters.add("Pressure Sensor Initialized");
        debugRegisters.add("Data Logger Started");

        for (String register : debugRegisters) {
            System.out.println(register);
        }
    }
}
