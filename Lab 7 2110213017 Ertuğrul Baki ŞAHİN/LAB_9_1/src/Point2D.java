public class Point2D {
    public  int x =0 ;
    public  int y = 0;

    public  Point2D () {
    this(0,0);
    }
    public  Point2D (int x,int y) {
        this.x =x;
        this.y =y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

}
