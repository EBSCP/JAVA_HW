public class Cone extends Shape3D{
    public  Cone(double height,double raduis) {
        super(height, raduis);
    }
    @Override
    public double getVolume(){
        return (PI*raduis*raduis*height)/3;
    }
    @Override
    public double getArea(){
        return PI*raduis*2*raduis*height;
    }

    @Override
    public String toString() {
        return "Area:"+getArea()+"Volume:"+getVolume();
    }
}
