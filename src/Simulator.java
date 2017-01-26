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
        ArrayList<Integer> finalResultNums = new ArrayList<>();
        ArrayList<int[]> possibleResultArray;
        HashMap<Integer, Integer> hm = new HashMap<>();
        possibleResultArray = simulation.simData;

        //puts all generated numbers into array
        for (int[] possibleResultList : possibleResultArray) {
            for (Integer possibleResult :
                    possibleResultList) {
                if (hm.containsKey(possibleResult)) {
                    hm.replace(possibleResult, hm.get(possibleResult) + 1);
                } else {
                    hm.put(possibleResult, 1);
                }
            }
        }
        for (int i = 0; i < 6; i++) {
            Map.Entry<Integer, Integer> maxEntry = null;
            for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
                if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                    maxEntry = entry;
                }
            }
            finalResultNums.add(maxEntry.getKey());
            hm.remove(maxEntry.getKey());

        }
        result.setResult(finalResultNums);
        return result;
    }

}