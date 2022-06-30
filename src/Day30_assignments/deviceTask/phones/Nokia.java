package Day30_assignments.deviceTask.phones;

import Day30_assignments.deviceTask.Phone;

public class Nokia extends Phone {

    public Nokia(String model, String color, int size, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Nokia", model, color, size, price, hasBattery, hasPowerButton);
    }

    public void selfDefense(){
        System.out.println("The other day I used my "+getBrand()+" phone to defended myself");
    }

}
