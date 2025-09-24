
public class Arrays {

	public static void main(String[] args) {
		//Diziler birden fazla değişkeni tutmak için kullanılır.
        int[] studentNotes = new int[5]; // 5 elemanlı bir dizi
        studentNotes[0] = 70;
        studentNotes[1] = 50;
        studentNotes[2] = 10;
        studentNotes[3] = 30;
        studentNotes[4] = 90;

        for(int i=0; i<5; i++){
        	System.out.println(studentNotes[i]);
        	//ilk değer vermesek bile dizi elemanlar 0 oluyor
        	
        }
        System.out.println(studentNotes.length);
	}

}
