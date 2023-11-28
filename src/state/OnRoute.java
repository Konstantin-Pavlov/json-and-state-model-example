package state;

import exceptions.CustomException;
import model.Truck;

public class OnRoute implements State{
    @Override
    public void changeDriver(Truck truck) throws CustomException {
        throw new CustomException("Грузовик в пути, невозможно сменить водителя");
    }

    @Override
    public void startDriving(Truck truck) throws CustomException {
        throw new CustomException("Грузовик уже в пути");
    }

    @Override
    public void startRepair(Truck truck) {
        truck.setStateObj(new OnRepair());
        System.out.println("успешно встали на ремонт");
    }
}
