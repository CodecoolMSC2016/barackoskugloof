import java.util.*;
import java.util.stream.Collectors;

/**
 * Simulator: It is responsible for running the Simulation of the game.
 */
public class Simulator {
    Simulation simulation;
    Logger logger;

    public Simulator(Simulation simulation, Logger logger) {
        this.simulation = simulation;
        this.logger = logger;
    }

    public Result run() {
        Result result = new Result();
        ArrayList<int[]> possibleResultArray;
        HashMap<Integer, Integer> hm = new HashMap<>();
        possibleResultArray = simulation.simData; //puts all generated numbers into array
        for (int[] possibleResultList : possibleResultArray) {
            for (Integer possibleResult:
                 possibleResultList) {
                if (hm.containsKey(possibleResult)) {
                    hm.put(possibleResult, hm.get(possibleResult) + 1);
                } else {
                    hm.put(possibleResult, 1);
                }
            }
        }
        Map<Integer,Integer> finalResult = hm.entrySet().stream().sorted(Map.Entry
                    .comparingByKey(Comparator.reverseOrder())).limit(6)
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        ArrayList<Integer> finalResultNums = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry:finalResult.entrySet()){
                Integer value = entry.getValue();
                finalResultNums.add(value);
            }

            result.setResult(finalResultNums);
        return result;
    }

        }