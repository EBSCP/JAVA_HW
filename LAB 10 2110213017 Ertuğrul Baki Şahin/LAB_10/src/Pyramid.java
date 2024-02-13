public class Pyramid extends Shape3D{
    public Pyramid(int depht,int height,int width) {
        super(depht, height, width);
    }
    @Override
    public  double getVolume() {
        return 1*(height*depht*width)/3;
    }
    @Override
    public  double getArea() {
        return (height*width)+((width/2)*(width/2)+(depht)*(depht))+width*((height/2)*(height/2)+(depht*depht));
    }
    @Override
    public String toString() {
        return "Area:"+getArea()+"Volume:"+getVolume();
    }
}
