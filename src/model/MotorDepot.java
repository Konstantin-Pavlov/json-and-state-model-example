package model;

import exceptions.CustomException;
import util.FileUtil;

public class MotorDepot {

    private static final Driver[] drivers = FileUtil.loadJsonArray("data/drivers.json", Driver[].class);
    private static final Truck[] trucks = FileUtil.loadJsonArray("data/trucks.json", Truck[].class);

    private MotorDepot() {

    }

    public static Driver[] getDrivers() {
        return drivers;
    }

    public static Truck[] getTrucks() {
        return trucks;
    }

    public static Driver getAvalibleDriver() throws CustomException {
        if (drivers != null) {
            for (Driver driver : drivers) {
                if (driver.isAvailable()) {
                    return driver;
                }
            }
        } else {
            throw new CustomException("Попытка получить водителя при пустом массиве водителей");
        }
        return null;
    }

}
