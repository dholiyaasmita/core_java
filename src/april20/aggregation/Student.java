package april20.aggregation;

public class Student {

    int id;

    String studentName;

    public Student(int id, String studentName) {
        this.id = id;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                '}';
    }

    //    public void printStudentDetails(){
//        System.out.println("Student ID: "+id);
//        System.out.println("Student Name: "+studentName);
//    }
}
