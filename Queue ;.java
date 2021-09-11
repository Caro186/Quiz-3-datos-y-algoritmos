/**
 * @author: Carolina Rodriguez
 */

package Quiz3;

class Queue {
   private static DoubleEndedList DQ;

   public Queue() {
      DQ = new DoubleEndedList();
   }

   public static void Enqueue(Object newP) {
      DQ.insertLast(newP);
   }

   public void Dequeue() {
      DQ.remove_first();
   }

   public Node peek() {
      return DQ.getHead();
   }

   public void displayList() {
      DQ.displayList();
   }

   public static void main(String[] args) {
      // Create an empty linked list
      Queue Q1 = new Queue();
      Q1.Enqueue(990000);
      Q1.Enqueue(3);
      Q1.Enqueue(5);
      Q1.Enqueue(7);
      Q1.Dequeue();

      Q1.Enqueue(7777777);
      Node head = Q1.peek();
      Q1.displayList();
      int element = (int) head.getData();
      System.out.println(element);
   }

}

// Una vez realizadas las diferentes pruebas, el resultado fue el esperado.