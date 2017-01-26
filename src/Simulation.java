import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
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
        for (int i = 0; i < times -1; i++) {
            generateData();

        }
    }

    public void generateData() { // amúgy csvbe kell írni lel aztán beolvasni a load()-al. Majd otthon.
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter("db.csv", true);

            for (int i = 0; i < 6; i++) {
                Random rnd = new Random();
                Integer num = rnd.nextInt(45) + 1;
                fileWriter.append(num.toString() + ",");
            }
            fileWriter.append("  " + Logger.getDateTime() + "\n");


        } catch (IOException e) {
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

    public void load() {
        BufferedReader br = null;
        String line;
        String cvsSplitBy = ",";
        try {
            br = new BufferedReader(new FileReader("db.csv"));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] numbers = line.split(cvsSplitBy);

                for (String number : numbers) {
                    System.out.println(number); //should not print, only for debug
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}