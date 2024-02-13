public class Cylinder extends  Shape3D{
    public Cylinder(double height, double raduis) {
        super(height, raduis);
    }
    @Override
    public double getVolume() {
        return PI*raduis*raduis*height;
    }
    @Override
    public  double getArea() {
        return (PI*2*raduis*raduis)+(PI*2*raduis*height);
    }

    @Override
    public String toString() {
        return "Area"+getArea()+"volume"+getVolume();
    }
}
