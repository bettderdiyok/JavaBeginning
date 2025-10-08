import java.util.ArrayList;


public class ClassStack {
    public static void main(String[] args) {
        MyStack stack1 = new MyStack();
        stack1.push("Java");
        stack1.push(123);
        stack1.push(45.6);
        Ogrenci ogr1 = new Ogrenci("Bet", 1342, 80);
        stack1.push(ogr1);
        System.out.println(stack1.elementSize());
        System.out.println(stack1.isEmpty());
        System.out.println(stack1.showElement());
        System.out.println(stack1.pop());
        stack1.printStack();



    }
}

class MyStack{
    private ArrayList<Object> list;

    public MyStack() {
        list = new ArrayList<>();
    }

    public int elementSize(){
        return list.size();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public Object showElement(){
        return list.get(list.size()-1);
    }

    public Object pop(){
        Object lastElement = list.get(list.size()-1);
        list.remove(lastElement);
        return lastElement;
    }

    public void push(Object o){
        list.add(o);
    }

    public void printStack(){
        for (Object stackObject : list) {
            System.out.println(stackObject);
        }
    }

}
class Ogrenci {
    private String isim;
    private int numara;
    private double notOrt;

    public Ogrenci(String isim, int numara, double notOrt) {
        this.isim = isim;
        this.numara = numara;
        this.notOrt = notOrt;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "isim='" + isim + '\'' +
                ", numara=" + numara +
                ", notOrt=" + notOrt +
                '}';
    }
}