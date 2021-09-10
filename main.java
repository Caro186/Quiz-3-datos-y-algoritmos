package Quiz3;
public class main {
  
    public static void main(String[] args) {
        // Create an empty linked list
        LinkedList linked_list = new LinkedList();
        DoubleEndedList y3 = new DoubleEndedList();
        // Insert some elements in the list
        linked_list.insertFirst(3);
        linked_list.insertFirst(8);
        linked_list.insertFirst(9);
        linked_list.insertFirst(1);
        linked_list.insertFirst(9);
        y3.insertFirst(77);
        y3.insertFirst(70);
        y3.insertFirst(5);
        y3.insertFirst(9);
        y3.insertLast(1);
        y3.insertLast(7);
        y3.displayList();
        
        // Get and print the size of the list.
        // It should match the number of elements we inserted
        int size = linked_list.size();
        int r = y3.size();
        System.out.println(size);
        
        System.out.println(r);
        
    }
    
    }

