import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Books B1 = new Books("KAŞAĞI",170);
        Books B2 = new Books("MADONNA",300);
        Books B3 = new Books("Olasılıksız",160);
        Books B4= new Books("KUYUCAKLI YUSUF",150);

        LinkedList<Double> linkedList =  new LinkedList<>();
        linkedList.add(B1.TotalPrice());
        linkedList.add(B2.TotalPrice());
        linkedList.add(B3.TotalPrice());
        linkedList.add(B4.TotalPrice());

        for (Double linkedLists: linkedList) {
            System.out.println("Total Price:"+linkedLists);
        }
    }
}