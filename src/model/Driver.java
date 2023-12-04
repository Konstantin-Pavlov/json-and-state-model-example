package model;

public class Driver {
    private String id;
    private String name;

    private boolean isAvalible;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isAvailable() {
        return isAvalible;
    }

    public void setAvailable(boolean avalible) {
        isAvalible = avalible;
        if (avalible) {
            System.out.printf("водитель %s теперь свободен%n", this.getName());
        } else {
            System.out.printf("водитель %s теперь за рулем%n", this.getName());
        }
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
