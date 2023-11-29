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
        Truck[] trucks = FileUtil.readFile();
        State[] states = {new OnBase(),new OnRepair(), new OnRoute()};

        for (Truck truck : trucks) {
            int r = new Random().nextInt(3);
            truck.setStateObj(states[r]);
        }

        String fmt = "%-2s | %-15s | %-10s | %-8s%n";

        System.out.printf(fmt, "#", "bus", "driver", "state");
        drawLine('-', 50);
        for (Truck truck : trucks) {
            System.out.printf(fmt, truck.getId(), truck.getName(), truck.getDriver(), truck.getState());
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