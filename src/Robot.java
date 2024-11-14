public class Robot {
    int batteryLevel = 100; // Battery level percentage (0 + 100)
    int speed = 0; // Current speed of the robot
    int weight = 100;
    String color = "red";
    String name = "Joey"; // Name of thr robot

    public void displayInfo() {
        name = "Joey";
        color = "red";
        weight = 100;
        System.out.println("Robot Information: " + "\n" + "Name: " + name + "\n" + "Color: " + color + "\n" + "Weight: " + weight + "g");
    }

    public void move() {
        speed = 5;
        System.out.println(name + " is moving at speed " + speed + " mph.");
    }

    public void stop() {
         speed = 0;
         System.out.println(name + " has stopped.");
    }

    public void chargeBattery() {
        batteryLevel = 100;
        System.out.println(name +"'s battery is fully charged.");
    }

    public void checkBatteryLevel() {
        System.out.println(name + "'s current battery level is " + batteryLevel + "%.");
    }

    public void checkWeight() {
        System.out.println(name + "'s current weight is " + weight + "g.");
    }

}