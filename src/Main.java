public class Main {

    public static void main(String[] args){
        Simulation simulation = Simulation.generateSimulation(2);
        Logger logger = new Logger();
        Simulator simulator = new Simulator(simulation, logger);
        Result result = simulator.run();
        System.out.println(result.getResult().get(0));


    }
}