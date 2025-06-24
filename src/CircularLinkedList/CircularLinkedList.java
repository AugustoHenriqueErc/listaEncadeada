package CircularLinkedList;

public class CircularLinkedList<T> {
    private Cell<T> tail;
    private Cell<T> head;
    public CircularLinkedList()
    {
        tail = null;
        head = null;
    }
    private boolean isEmpty()
    {
        if(tail == null &&  head == null) return true;
        else return false;
    }

    public void insertHead(T value){
        this.insertHead(new Cell<T>(value));
    }
    private void insertHead(Cell<T> cell){
        if(tail == null||head == null)
        {
            tail = cell;
            head = cell;
            tail.setNext(cell);
        }
        else {
            cell.setNext(head);
            head = cell;
            tail.setNext(cell);
        }
    }

    public void insertEnd(T value)
    {
        this.insertEnd(new Cell<T>(value));
    }

    private void insertEnd(Cell<T> cell)
    {
        if((tail == null||head == null))
        {
            tail = cell;
            head = cell;
            tail.setNext(cell);
        }
        else
        {
            tail.setNext(cell);
            cell.setNext(head);
            tail = cell;
        }
    }

    public void removeHead() throws NullPointerException
    {
        if(isEmpty()) throw new NullPointerException();
        else
        {
            head = head.getNext();
            tail.setNext(head);
        }
    }

    public void removeTail()
    {

    }

    public boolean search(T value)
    {
        Cell<T> aux = tail.getNext();
        while(aux != null)
        {
            if(aux.getValue() == value) return true;
        }
        return false;
    }

    @Override
    public String toString()
    {
        Cell<T> aux = head;
        StringBuilder sb = new StringBuilder();
        do
        {
            sb.append(aux.getValue()).append(", ");
            aux = aux.getNext();
        }while (aux != head);
        return sb.toString();
    }

}