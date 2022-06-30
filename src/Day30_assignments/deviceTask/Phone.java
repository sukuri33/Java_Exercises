package Day30_assignments.deviceTask;

public class Phone extends Device{

    public Phone(String brand, String model, String color, int size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    public void call(){
        System.out.println("making a call with"+getModel()+" and its brand is "+getBrand());
    }

    public void text(){
        System.out.println("texting with"+getModel()+" and its brand is "+getBrand());
    }
}
