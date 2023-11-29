package state;

import exceptions.CustomException;
import model.Truck;

public class OnBase implements State {

    @Override
    public void changeDriver(Truck truck) {
        //.....
    }

    @Override
    public void startDriving(Truck truck) {
        truck.setStateObj(new OnRoute());
        truck.setState("route");
        System.out.println("успешно вышли на маршрут");
    }

    @Override
    public void startRepair(Truck truck) {
        truck.setStateObj(new OnRepair());
        truck.setState("ремонт");
        System.out.println("успешно встали на ремонт");
    }
}
