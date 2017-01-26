import java.util.ArrayList;

//Result: Stores the result of the simulation. It has getters and setters
// to read and write its members (data class).
public class Result {
    ArrayList<Integer> resultData = new ArrayList<>();

    public ArrayList<Integer> getResult() {
        return resultData;
    }

    public void setResult(ArrayList<Integer> simData) {

        resultData = simData;
    }

    public void getWinningNumbers() {
        String result = "The six most common number are: ";
        for (Integer num : resultData.toArray(new Integer[0])) {
            result += num.toString() + ", ";
        }
        result = result.substring(0, result.lastIndexOf(" ") - 1) + ".";
        Logger.log("Result", result, "ts");
    }
}