package OOPExamples;

public class MainStudent {
    public static void main(String[] args) {
         Student[] allStudent = new Student[4];
         for(int i=0; i< allStudent.length; i++){
         int randomID = (int) (Math.random() * 5000);
         int randomNote = (int) (Math.random() * 100);
         Student newStudent = new Student(randomID, randomNote);
         allStudent[i] = newStudent;
        }
         studentNoteSorting(allStudent);

    }

    public static void studentNoteSorting(Student[] students){
        //before sorting
        for (Student num : students){
            System.out.println(num.getStudentNote());
        }
        System.out.println();
        //Selection sorting
        for(int i=0; i< students.length; i++){
            int minIndex = i;
            Student temp = students[i];
            for (int j=i+1; j<students.length; j++) {
                if(students[j].getStudentNote() < students[minIndex].getStudentNote()){
                    minIndex = j;
                }
            }
              //Swap
            students[i] = students[minIndex];
            students[minIndex] = temp;



        }

        for (Student student : students){
            System.out.print(student.getStudentNote() + "\n" );

        }

        }

    }

