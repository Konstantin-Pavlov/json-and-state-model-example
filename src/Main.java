import model.Driver;
import model.Truck;
import state.OnBase;
import state.OnRepair;
import state.OnRoute;
import util.FileUtil;
import state.State;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Truck[] trucks = FileUtil.getTrucks();
        Driver[] drivers = FileUtil.getDrivers();
        State[] states = {new OnBase(),new OnRepair(), new OnRoute()};

        String fmt0  = "%-2s | %-15s | %-10s | %-8s%n";
        String fmt1 = "%-4s | %-10s | %-5s%n";

//        System.out.println(Arrays.toString(drivers));

        for (int i = 0; i < trucks.length; i++) {
            trucks[i].setDriver(drivers[i]);
        }

        for (Truck truck : trucks) {
            int r = new Random().nextInt(3);
            truck.setStateObj(states[r]);
        }


        System.out.printf(fmt0, "#", "bus", "driver", "state");
        drawLine('-', 50);
        for (Truck truck : trucks) {
            System.out.printf(fmt0, truck.getId(), truck.getName(), truck.getDriverName(), truck.getState());
        }

        System.out.println();

        System.out.printf(fmt1, "#", "driver",  "bus");
        drawLine('-', 50);
        for (Driver driver : drivers) {
            System.out.printf(fmt1, driver.getId(),  driver.getName(), "");
        }



        //        Truck truck = trucks[1];
//        truck.setStateObj(new OnBase());
//        truck.startDriving();
//        truck.startDriving();
//        truck.changeDriver();
//        truck.startDriving();
//        truck.startRepair();
//        truck.changeDriver();

    }

    public static void drawLine(char fillCharacter, int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(fillCharacter);
        }
        System.out.println();
    }
}