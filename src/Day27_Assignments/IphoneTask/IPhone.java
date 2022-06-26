package Day27_Assignments.IphoneTask;

public class IPhone {

    public static String brand,madeIn,designedIn;
    public String model,OS;
    public int size;
    public String color;
    public double price;
    public static boolean isSmartPhone;

    static{
        brand = "Apple";
        isSmartPhone = true;
        madeIn = "China";
        designedIn = "California";
    }

    public IPhone(String model, String OS, int size, String color, double price) {
        this.model = model;
        this.OS = OS;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public void printOS(){
        System.out.println("OS: "+OS);
    }

    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", OS='" + OS + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
