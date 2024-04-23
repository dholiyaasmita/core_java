package april20.aggregation;

public class AggregationDemoMain {
    public static void main(String[] args) {
        Student student = new Student(19027,"Dwij");

        Department department = new Department("Mechenical Eng.",student);
        System.out.println(department.toString());

        System.out.println(department.student.studentName);
    }
}
