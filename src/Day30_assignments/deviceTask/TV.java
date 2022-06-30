package Day30_assignments.deviceTask;

public class TV extends Device{

    public TV(String brand, String model, String color, int size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    public void channelUp(){
        System.out.println("Channel up "+getModel()+" and brand is "+getBrand());
    }

    public void channelDown(){
        System.out.println("Channel down "+getModel()+" and brand is "+getBrand());
    }
}
