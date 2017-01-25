import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * Simulation: Contains the simulation data.

 It has the following methods:

 generateData(), writes one simulated round to a file. We recommend the CSV format.
 load(), loads the content of an instance of a Simulation and returns it.
 */
public class Simulation {
    ArrayList<Integer> simData = new ArrayList<>();

    public Simulation() {
        // csvből beolvasás és példányosítás
    }

    public void generateSimulation(int times) {
        for (int i = 0; i < times; i++) {
            generateData();

        }
    }

    public void generateData() { // amúgy csvbe kell írni lel aztán beolvasni a load()-al. Majd otthon.
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter("db.csv");

            for (int i = 0; i < 6; i++) {
                Random rnd = new Random();
                Integer num = rnd.nextInt(45) + 1;
                fileWriter.append(num.toString() + ", ");
            }

        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {

            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }


        }
    }
}