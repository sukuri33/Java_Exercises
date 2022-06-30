package Day30_assignments.deviceTask.phones;

import Day30_assignments.deviceTask.Phone;

public class IPhone extends Phone {

    public IPhone(String model, String color, int size, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Apple", model, color, size, price, hasBattery, hasPowerButton);
    }

    public void faceTime(){
        System.out.println("Face time by using "+getModel()+" and brand is "+getBrand());
    }

}
