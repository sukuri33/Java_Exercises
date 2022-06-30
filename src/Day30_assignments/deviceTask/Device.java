package Day30_assignments.deviceTask;


public class Device {
    private String brand,model,color;
    private int size;
    private double price;
    private boolean hasBattery,hasPowerButton;


    public Device(String brand, String model, String color, int size, double price, boolean hasBattery, boolean hasPowerButton) {
        setBrand(brand);
        setModel(model);
        setColor(color);
        setSize(size);
        setPrice(price);
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null && brand.isBlank() && brand.isEmpty()){
            System.err.println("Brand cannot be null, blank or empty");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null && model.isBlank() && model.isEmpty()){
            System.err.println("Model cannot be null, blank or empty");
            System.exit(1);
        }
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.err.println("Price cannot be 0 or a negative number!");
            System.exit(1);
        }
        this.price = price;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }
    
    public void turnOn(){
        System.out.println("Turning on"+getBrand()+":"+getModel());
    }

    public void turnOff(){
        System.out.println("Turning off"+getBrand()+":"+getModel());
    }

    public String toString() {
        return getClass().getSimpleName() +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}
