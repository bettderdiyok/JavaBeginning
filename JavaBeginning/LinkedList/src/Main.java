public class Main {
    public static void main(String[] args) {
     Node head;
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(7);
        Node n5 = new Node(8);
        Node n6 = new Node(15);
        Node n7 = new Node(59);
        Node temp1 = new Node(75);//en üste node ekledik
        Node temp2 = new Node(122); // Araya node eklemek için

//Bunları birbirine bağlamak için

        head = temp1;
        temp1.next=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=temp2;
        temp2.next=n5;
        n5.next=n6;
        n6.next=n7;

        Node n8 = new Node(99);
        Node n9 = new Node(79);
        n7.next=n8;
        n8.next=n9;


        System.out.println(head.data);
        System.out.println(head.next);
        System.out.println();

       Node temp;
       temp = head;
       while(temp.next != null){
          System.out.println(temp.data);
          temp=temp.next;
       }
    }
}
class Node {
   Node next;
   int data;

   public  Node(int data){
       this.data=data;

   }
}