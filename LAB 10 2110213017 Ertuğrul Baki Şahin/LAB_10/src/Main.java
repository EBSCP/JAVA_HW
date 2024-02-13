public class Main {
    public static void main(String[] args) {
        Shape2D s1 = new Circle(15);
        Shape2D s2 = new Cylinder(18,19);
        Shape2D s3 = new Pyramid(10,19,20);

       Shape2D[] shape2DS= {s1,s2,s3};

        for (Shape2D a: shape2DS) {
            System.out.println(a+"area"+a.toString());
        }
    }

}