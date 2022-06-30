package Day28_assignments.itemTask;

import java.text.DecimalFormat;

public class Item {
    private String name;
    private double unitPrice;
    private int quantity;
    private static DecimalFormat df = new DecimalFormat("#.##");

    public Item(String name,double unitPrice,int quantity){
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public void setName(String name){
        if (name.isEmpty() || name.isBlank() || Character.isDigit(name.indexOf(0))){
            System.err.println(name+": cannot be empty, blank or start with a digit");
            System.exit(1);
        }
        char[] eachChar = name.toCharArray();
            for (char c : eachChar) {
                if (Character.isLetter(c) || Character.isSpaceChar(c)) {
                    //No prevision is needed
                } else {
                    System.err.println(name + ": cannot contain any special chars");
                    System.exit(1);
                }
            }
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setUnitPrice(double unitPrice){
        if (unitPrice < 0){
            System.err.println(unitPrice+": Unit price cannot be negative number");
            System.exit(1);
        }
        this.unitPrice = unitPrice;
    }

    public double getUnitPrice(){
        return this.unitPrice;
    }

    public void setQuantity(int quantity){
        if (quantity < 0) {
            System.err.println(quantity + ": quantity cannot be a negative number");
            System.exit(1);
        }else if (getName().equalsIgnoreCase("toilet paper") && quantity > 1){
            System.out.println("Toilet Paper quantity can be more than one for per household!");
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public double calcCost(){
        return getUnitPrice() * getQuantity();
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", totalPrice=" + df.format(calcCost()) +
                '}';
    }
}

/*
3. create a class called Item
        private variables:
            name, unitPrice, quantity

        Encapsulate all the fields:
            Conditions:
                name can not be empty or blank
                name can not contain any special characters other than space
                name must start with letters
                unit price can not be negative
                quantity can not be negative
                if the Item name is toilet paper (case insensitive) then the quantity can not be more than 1


        Add a constructor that allows user to set all the fields when the object is created.
                (If the arguments not valid it should not be set to the instances)

        Methods:
            calcCost(): returns the total cost
            toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
 */
