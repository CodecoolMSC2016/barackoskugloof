public class Main {

    public static void main(String[] args) {
        Simulation simulation = Simulation.generateSimulation(Integer.parseInt(args[0]));
        Logger logger = new Logger();
        Simulator simulator = new Simulator(simulation, logger);
        Result result = simulator.run();
        result.getWinningNumbers();
    }
}