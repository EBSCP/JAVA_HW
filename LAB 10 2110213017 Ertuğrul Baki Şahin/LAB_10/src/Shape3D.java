public abstract class Shape3D  extends  Shape2D{
    public double depht;
    public Shape3D(double depht,double height,double width) {
        super(height, width);
        this.depht=depht;
    }

    public Shape3D(double height,double raduis) {
        super(height,raduis);
    }
    public  abstract double getVolume();
    public abstract  String toString();
}
