package OOPExamples;

public class Student {
   private int studentId;
   private int studentNote;


    public Student(int studentId, int studentNote) {
        this.studentId = studentId;
        this.studentNote = studentNote;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentNote() {
        return studentNote;
    }

    public void setStudentNote(int studentNote) {
        this.studentNote = studentNote;
    }
}

