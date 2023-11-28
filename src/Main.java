import model.Truck;
import state.OnBase;
import util.FileUtil;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Truck[] trucks = FileUtil.readFile();

        System.out.println(Arrays.toString(trucks));

//        Truck truck = trucks[1];
//        truck.setStateObj(new OnBase());
//        truck.startDriving();
//        truck.startDriving();
//        truck.changeDriver();
//        truck.startDriving();
//        truck.startRepair();
//        truck.changeDriver();

    }
}