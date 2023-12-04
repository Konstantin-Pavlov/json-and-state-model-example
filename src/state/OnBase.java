package state;

import exceptions.CustomException;
import model.Driver;
import model.MotorDepot;
import model.Truck;

public class OnBase implements State {

    @Override
    public void changeDriver(Truck truck) throws CustomException {
        Driver newDriver = null;
        try {
            newDriver = MotorDepot.getAvalibleDriver();
        } catch (CustomException e) {
            throw new CustomException(e.getMessage());
        }
        if(newDriver == null){
            throw new CustomException("нет свободных водителей");
        }
        truck.getDriverObj().setAvailable(true);
        truck.setDriver(newDriver);
        newDriver.setAvailable(false);
        System.out.printf("теперь грузовик %s ведёт водитель %s%n", truck.getName(), newDriver.getName());

    }

    @Override
    public void startDriving(Truck truck) {
        truck.setStateObj(new OnRoute());
        System.out.println("успешно вышли на маршрут");
    }

    @Override
    public void startRepair(Truck truck) {
        truck.setStateObj(new OnRepair());
        System.out.println("успешно встали на ремонт");
    }
}
