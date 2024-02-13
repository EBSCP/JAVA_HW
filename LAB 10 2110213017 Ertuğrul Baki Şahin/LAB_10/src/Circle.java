public class Circle extends Shape2D {
    public  Circle(double radius) {
        super(radius);
    }

    @Override
    public  double getArea(){
        return PI*raduis*raduis;
    }

    @Override
    public String toString() {
        return "Raduis:"+raduis+"Area"+getArea();
    }
}
