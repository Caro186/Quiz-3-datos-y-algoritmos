package Quiz3;
     class Queue {
        private static DoubleEndedList DQ;
        
        public Queue(){
           DQ = new DoubleEndedList(); 
        }
       
        public static void Enqueue (Object newP) {
           DQ.insertLast(newP);
        }
        
       // public void Dequeue (Object newP) {
        //    DQ.insertLast(newP);
       // }
        
        public Node peek() {
            return  DQ.getHead();
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

            Q1.displayList();
            Node head = Q1.peek();
            int element = (int) head.getData();
            System.out.println(element);
        }   

}