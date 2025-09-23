public class Stack {
    int [] stack = new int[20];
    int top=0;
    void push(int a){
        stack[top]=a;
        top++;
        System.out.println(a +" has been added to the stack");
    }

    void print(){
        for(int i=top-1; i>=0; i--){
            System.out.println(stack[i]);
        }

        }

    int pop() {
        if (size() == 0) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            System.out.println(stack[top - 1] + " has been removed to the stack");
            return stack[--top];
        }

    }



    int size(){
        return top;
    }

}
