package state;

import exceptions.CustomException;
import model.Truck;

public class OnRepair implements State {
    @Override
    public void changeDriver(Truck truck) throws CustomException {
        throw new CustomException("Нельзя сменить водителя");
    }

    @Override
    public void startDriving(Truck truck) {
        /*
        truck.setStateObj(new OnBase)
        ||
        truck.setStateObj(new OnRoute)
         */
    }

    @Override
    public void startRepair(Truck truck) throws CustomException {
        throw new CustomException("Уже в ремонте");
    }
}
