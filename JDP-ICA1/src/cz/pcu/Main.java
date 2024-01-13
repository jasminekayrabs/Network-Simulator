package cz.pcu;

import cz.pcu.simulation.SimulationManager;
import cz.pcu.simulation.event.EventScheduler;

public class Main {
    public static void main(String[] args) {

        var simulationManager = SimulationManager.getInstance();
        simulationManager.setEventScheduler(new EventScheduler());
        simulationManager.buildNetwork("path to topology file");
        simulationManager.startSimulation();
    }
}
