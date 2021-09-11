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
      Q1.Enqueue(5);
      Q1.Enqueue(8);
      Q1.Enqueue(3);
      Q1.Enqueue(12);
      Q1.Enqueue(0);
      Q1.Enqueue(89);
      Q1.Enqueue(77);

      System.out.println("Dequeue");

      Q1.Dequeue();
      Q1.Dequeue();
      Q1.Dequeue();


   }

}

// Una vez realizadas las diferentes pruebas e investigaciones acerca de la dobe lista enlazada y las colas
// se logra implementar los diferentes metodos de Enqueue,peek y Dequeu, se concluye que el
// resultado fue el esperado.