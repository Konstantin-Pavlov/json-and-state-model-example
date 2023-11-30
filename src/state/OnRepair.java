package state;

import exceptions.CustomException;
import model.Truck;

import java.util.Random;

public class OnRepair implements State {
    @Override
    public void changeDriver(Truck truck) throws CustomException {
        throw new CustomException("Нельзя сменить водителя");
    }

    @Override
    public void startDriving(Truck truck) {
        if (new Random().nextBoolean()) {
            truck.setStateObj(new OnRoute());
        } else {
            truck.setStateObj(new OnBase());
        }
    }

    @Override
    public void startRepair(Truck truck) throws CustomException {
        throw new CustomException("Уже в ремонте");
    }
}
