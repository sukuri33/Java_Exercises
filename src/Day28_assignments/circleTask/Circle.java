package Day28_assignments.circleTask;

public class Circle {
    private double radius;
    public static double pi = 3.14;

    public void setRadius(double radius){
        if (radius <= 0)
            System.exit(1);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public Circle(double radius){
        setRadius(radius);
    }

    public double calcArea(){
        return pi * getRadius() * getRadius();
    }


    public String toString() {
        return "Circle{" +
                "radius=" + getRadius() +
                "area=" + calcArea() +
                '}';
    }
}


/*
1. Create a class named Circle

        private variables:
            radius

        public variable:
            pi

         Encapsulate all the private fields

                 1. radius of the circle can not be zero or negative

         Add a constructor that can set the radius of circle when circle object is created
                 (If the arguments not valid it should not be set to the instances)

         Methods:
             calcArea()
             calcPerimeter()
             toString(): displays the radius, area and perimeter of the circle when the circle object is passed in the print statement
 */