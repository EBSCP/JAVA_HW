public abstract class Shape2D {
    public static  final  double PI = 3.14;
    public double height;
    public double raduis;
    public double width;

    public  Shape2D (double height,double width) {
        this.height =height;
        this.width = width;
    }
    public Shape2D (double raduis) {
        this.raduis =raduis;
    }
    public abstract double getArea();

    @Override
    public  abstract String toString();
}
