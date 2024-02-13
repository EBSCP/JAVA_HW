public class Cylinder extends Circle{
    public double Height = 1.0;

    public Cylinder () {
        this(0,0,"");
    }
    public Cylinder (double Height) {
       this(Height,0,"");
    }
    public Cylinder (double Height,double radius) {
        super(radius);
        this.Height =Height;
    }
    public Cylinder (double Height,double radius, String color) {
        super(radius,color);
        this.Height =Height;
    }
    public double getHeight () {
        return  Height;
    }
    public void setHeight (double height) {
        this.Height =height;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    public double getVolume() {
        return 3.14*radius*radius*radius*Height;
    }
}
