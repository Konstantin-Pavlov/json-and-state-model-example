package model;

import util.FileUtil;

public class MotorDepot {
    private static final Driver[] drivers = FileUtil.getDrivers();
    ;
    private static final Truck[] trucks = FileUtil.getTrucks();

    private MotorDepot() {

    }

    public static Driver[] getDrivers() {
        return drivers;
    }

    public static Driver getAvalibleDriver() {
        for (Driver driver : drivers) {
            if (driver.isAvalible()) {
                return driver;
            }
        }
        return null;
    }

    public static Truck[] getTrucks() {
        return trucks;
    }

}
