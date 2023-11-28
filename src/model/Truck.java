package model;

import exceptions.CustomException;
import state.State;

public class Truck {
    private int id;
    private String name;
    private String driver;
    private String state;
    private State stateObj; // OnBase -> OnRoute

    public void setStateObj(State stateObj) {
        this.stateObj = stateObj;
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
        sb.append(", driver='").append(driver).append('\'');
        sb.append(", state='").append(state).append('\'');
        sb.append('}');
        return sb.toString();
    }
}