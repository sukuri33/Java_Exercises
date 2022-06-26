package Day25_Assignments.PizzaTask;

public class Pizza {
    char size;
    int numberOfCheeseTopping, numberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping,int numberOfPepperoniTopping)
    {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calcCost(){
        double totalCost = 0.0;
        switch (size){
            case 'S':
                totalCost += 10;
                break;
            case 'M':
                totalCost += 12;
                break;
            case 'L':
                totalCost += 14;
                break;
            default:
        }
        totalCost += (numberOfCheeseTopping *2) + (numberOfPepperoniTopping*2);
        return totalCost;
    }


    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", pizza cost=" + calcCost() +
                '}';
    }
}

/*
Task01:
    Create a custom class named Pizza:
        Attributes:
            size, numberOfCheeseTopping, numberOfPepperoniTopping

            Add a constructor that can set all the fields

        Actions:
            calcCost(): returns the totalCost of the pizza
            toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping

 */