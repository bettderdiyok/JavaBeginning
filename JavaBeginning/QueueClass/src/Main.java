public class Main {
    public static void main(String[] args) {
       Queue q1 = new Queue();
       q1.enqueue(5);
       q1.enqueue(9);
       q1.enqueue(53);
       q1.enqueue(97);
       q1.print();

       q1.dequeue();
       q1.print();

    }
}