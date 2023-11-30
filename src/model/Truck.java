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

    public void changeDriver(){
        try{
            stateObj.changeDriver(this);
        } catch (CustomException e){
            System.out.println(e.getMessage());
        }
    }

    public void startDriving(){
        try{
            stateObj.startDriving(this);
        } catch (CustomException e){
            System.out.println(e.getMessage());
        }
    }

    public void startRepair(){
        try{
            stateObj.startRepair(this);
        } catch (CustomException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Truck{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", driver='").append(getDriverName()).append('\'');
        sb.append(", state='").append(state).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
