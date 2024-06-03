package Test.OSP;

public class Vehicle {
    private int maxSpeed;
    private String type;

    public double calculateAllowedSpeed(){
//        if(type == "Car")
//            return maxSpeed * 0.8;
//        if (type == "Bus")
//            return maxSpeed * 0.5;
        return maxSpeed;
    }

    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

}
