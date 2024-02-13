public class Sphere extends  Shape3D {
    public Sphere(int depht, double raduis) {
        super(depht, raduis);
    }
    @Override
    public double getVolume() {
        return (4*PI*raduis*raduis*raduis)/3;
    }
    @Override
    public double getArea() {
        return 4*PI*raduis*raduis;
    }

    @Override
    public String toString() {
        return "Area"+getArea()+"Volume"+getVolume();
    }
}
