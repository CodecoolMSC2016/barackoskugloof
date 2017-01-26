import java.util.ArrayList;

//Result: Stores the result of the simulation. It has getters and setters
// to read and write its members (data class).
public class Result {
        ArrayList<Integer> resultData = new ArrayList<>();
    public void setResult(ArrayList<Integer> simData){

        resultData = simData;
    }
    public ArrayList<Integer> getResult(){
        return resultData;
    }



}/*
    public WinningNumbers[] calculateNumbers(int[] numberList){
        for (int number : numberList){

        }





    }

}*/