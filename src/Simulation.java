import java.util.ArrayList;
import java.io.*;
import java.util.*;

/**
 * Simulation: Contains the simulation data.
 * <p>
 * It has the following methods:
 * <p>
 * generateData(), writes one simulated round to a file. We recommend the CSV format.
 * load(), loads the content of an instance of a Simulation and returns it.
 */
public class Simulation {
    ArrayList<int[]> simData = new ArrayList<>();

    public Simulation() {
    }

    public static Simulation generateSimulation(int times) {
        Simulation simulation = new Simulation();
        for (int i = 0; i < times; i++) simulation.generateData();
        simulation.simData = load();
        return simulation;
    }

    public static ArrayList<int[]> load() {
        Logger.log("I/O handling", "Reading stats from file.", "ts");
        BufferedReader br = null;
        String line;
        String cvsSplitBy = ",";
        ArrayList<int[]> result = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader("db.csv"));
            while ((line = br.readLine()) != null) {
                int[] row = new int[6];
                String[] split = line.split("@");
                String[] numbers = split[1].split(cvsSplitBy);
                Logger.log("Generated number", split[1], "ts");
                for (int i = 0; i < 6; i++) {
                    row[i] = Integer.parseInt(numbers[i]);
                }
                result.add(row);
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
        Logger.log("I/O handling", "Database reading  is done.", "ts");
        return result;
    }

    public void generateData() {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("db.csv", true);
            fileWriter.append(Logger.getDateTime() + " - @");
            ArrayList<Integer> drawnNums = new ArrayList<>();
            for (int i = 0; i < 6; i++) {
                Random rnd = new Random();
                Integer num = rnd.nextInt(45) + 1;
                if (drawnNums.contains(num)) {
                    i--;
                    continue;
                }
                drawnNums.add(num);
                fileWriter.append(num.toString() + ",");
            }
            fileWriter.append("\n");
        } catch (IOException e) {
            Logger.log("Error", e.toString(), "ts");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                Logger.log("Error", e.toString(), "ts");
            }
        }
    }
}
