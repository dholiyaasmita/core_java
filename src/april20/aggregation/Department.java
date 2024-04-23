package april20.aggregation;

public class Department {
    String departmentName;
    Student student;

    public Department(String departmentName, Student student) {
        this.departmentName = departmentName;
        this.student = student;
    }

    @Override
    public String toString() {
        return "departmentName='" + departmentName + '\'' +
                ", student=" + student;

    }

    //    public void printDepartmentDetails(){
//        System.out.println("Department name: "+departmentName);
//        System.out.println("Student details: "+student);
//    }
}
