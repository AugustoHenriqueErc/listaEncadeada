package CircularLinkedList;

public class testCircularLinkedListExceptionHandeling
{
    public static void main(String[] args) {
        CircularLinkedList<Integer> list = new CircularLinkedList<Integer>();

        System.out.println("Testando Exception Handeling removeHead");

        try {
            list.removeHead();

        }catch (Exception e)
        {
            System.out.println();
        }

    }
}
