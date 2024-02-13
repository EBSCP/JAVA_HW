import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(3.14,"Black");
        Circle c2 = new Circle(3,"Yellow");
        Circle c3 = new Circle(2,"Green");

        LinkedList<Double> linkedList = new LinkedList<>();
        linkedList.add(c1.CalculateArea());
        linkedList.add(c2.CalculateArea());
        linkedList.add(c3.CalculateArea());

        for (Double linkedlists : linkedList) {
            Collections.sort(linkedlists);
        }
    }
}