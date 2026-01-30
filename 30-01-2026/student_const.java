// create a class for same student details and also create costructor to insert student details and return the data using tostring method

public class student_const {
    int Student_id;
    String Student_name;
    String dept;
    int age;
    String section;

    public student_const(int id, String name, String dept, int age, String section) {
        this.Student_id = id;
        this.Student_name = name;
        this.dept = dept;
        this.age = age;
        this.section = section;
    }

    public String tostringg() {
        return """
                ID: %d
                Name: %s
                Dept: %s
                Age: %d
                Section: %s
                """.formatted(Student_id, Student_name, dept, age, section);
    }


    public static void main(String[] args) {
        student_const s = new student_const(1, "Alice", "CS", 20, "A");
        System.out.println(s.tostringg());
    }
}
