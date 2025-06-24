package CircularLinkedList;

public class testCircularLinkedList {
    public static void main(String[] args) {
        CircularLinkedList<Integer> list = new CircularLinkedList<Integer>();

        list.insertHead(10);
        list.insertHead(5);
        list.insertEnd(20);

        System.out.println("Print Lista");
        System.out.println(list);

        System.out.print("Procurando elemento 5:");
        System.out.println(list.search(5));

        System.out.println("Removendo Head 5");
        list.removeHead();
        System.out.println(list);

        }
}

