package state;

import exceptions.CustomException;
import model.Truck;

public interface State {
    void changeDriver(Truck truck) throws CustomException;

    void startDriving(Truck truck) throws CustomException;

    void startRepair(Truck truck) throws CustomException;
}
