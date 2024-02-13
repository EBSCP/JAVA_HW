public class Circle {
    public double radius = 1.0;
    public  String  color ="Red";

    public Circle () {
        this(0,"");
    }
    public Circle (double radius) {
        this(radius,"");
    }
    public Circle (double radius,String color) {
            this.radius =radius;
            this.color =color;
    }

    public double getRadius() {
        return radius;
    }
    public String getColor () {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
       return radius*radius*3.14;
    }

}
