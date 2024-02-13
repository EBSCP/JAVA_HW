import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
            Developer D1 = new RegularDeveloper(0,"Ali",1000);
            Developer D2 = new SeniorDeveloper(1,"Veli",4000);
            Developer D3 = new FreeLanceDeveloper(2,"Mehmet",15);

        ArrayList<Double> Array = new ArrayList<>();
        Array.add(D1.Income());
        Array.add(D2.Income());
        Array.add(D3.Income());

        for(Double arrayLists: Array) {
         System.out.println("Income:"+arrayLists);
        }

    }
}