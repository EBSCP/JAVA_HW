public class Square  extends  Shape2D{
    public Square(double width) {
        super(width);
    }
    @Override
    public double getArea() {
        return 6*width*width;
    }

    @Override
    public String toString() {
        return "Width:"+width+"Area:"+getArea();
    }
}
