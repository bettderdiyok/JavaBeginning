public class Queue {
    int [] queue = new int[10];
    int head=0;
    int tail=0;

    void enqueue(int num){
     queue[tail++]=num;
    }

    void dequeue(){
        System.out.println("Number has been removed : " + queue[head++]);
    }

    void print(){
        for(int i=head; i<tail; i++){
            System.out.println(queue[i]);

        }
    }

}
