public class Circle implements Comparable<Circle> {
    public final static double PI = 3.14;
    public double radius;
    public String Color;

    public Circle(double raduis,String Color) {
        this.radius = raduis;
        this.Color = Color;
    }
    public double CalculateArea() {
        return radius*radius*PI;
    }

    @Override

    public int compareTo(Circle circle) {
        return  Integer.compare((int) this.CalculateArea(), (int) this.radius);
    }
}
