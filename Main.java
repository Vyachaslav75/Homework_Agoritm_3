import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(10));
        }
        list.print();
        list.reverse();
        list.print();
    }

    
}