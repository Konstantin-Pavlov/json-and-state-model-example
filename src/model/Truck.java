package model;

import exceptions.CustomException;
import state.State;

public class Truck {
    private int id;
    private String name;
    private String driver;

    private String state;
    private State stateObj; // OnBase -> OnRoute

    private Driver driverObj;

    public void setDriver(Driver driverObj) {
        this.driverObj = driverObj;
    }

    public Driver getDriverObj() {
        return driverObj;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDriverName() {
        return this.driverObj.getName();
    }


    public String getState() {
        return state;
    }

    public void setStateObj(State stateObj) {
        this.stateObj = stateObj;
        setState(this.stateObj.getClass().getSimpleName());
    }

    public void setState(String state) {
        this.state = state;
    }

    public void changeDriver() {
        try {
            stateObj.changeDriver(this);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    public void startDriving() {
        try {
            stateObj.startDriving(this);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    public void startRepair() {
        try {
            stateObj.startRepair(this);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        String fmt = "%-10s :    %-10s%n";
        return String.format(fmt, "#", id) +
                String.format(fmt, "Bus", getName()) +
                String.format(fmt, "driver", getDriverName()) +
                String.format(fmt, "Bus state", state);
    }
}
