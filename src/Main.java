
public class Main {

    public static void main(String[] args) {
        try{
            int generations = 100;  // Integer.parseInt(args[0]);
            Simulation simulation = Simulation.generateSimulation(generations);
            Logger logger = new Logger();
            Simulator simulator = new Simulator(simulation, logger);
            Result result = simulator.run();
            result.getWinningNumbers();

        }
        catch (Exception e){
            if(args[0].equals("-gui")){



            }
        }
    }
}