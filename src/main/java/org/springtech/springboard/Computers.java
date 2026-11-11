package org.springtech.springboard;

public class Computers {
    private String make;
    private String model;
    private int ram;
    private String operatingSystem;

    public Computers(String make, String operatingSystem, String model, int ram) {
        this.make = make;
        this.operatingSystem = operatingSystem;
        this.model = model;
        this.ram = ram;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
