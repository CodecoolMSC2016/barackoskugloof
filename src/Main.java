public class Main {

    public static void main(String[] args){
        //nem simulation simulation = new Simulation();
        Simulation simulation = Simulation.generateSimulation(10); //args[0]
        Logger logger = new Logger();
        Simulator simulator = new Simulator(simulation, logger);
        Result result = simulator.run();
        result.getWinningNumbers();
    }
}