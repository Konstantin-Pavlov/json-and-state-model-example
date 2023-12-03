package model;

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

    public static Driver getAvalibleDriver() {
        for (Driver driver : drivers) {
            if (driver.isAvalible()) {
                return driver;
            }
        }
        return null;
    }

}
