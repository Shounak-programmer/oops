//create a class student with properties Student_id, Student_name, dept, age, section and use method Insert_studnet for inserting student details

public class student {
    int Student_id;
    String Student_name;
    String dept;
    int age;
    String section;

    public void Insert_studnet(int id, String name, String dept, int age, String section) {
        this.Student_id = id;
        this.Student_name = name;
        this.dept = dept;
        this.age = age;
        this.section = section;
    }

    public void display() {
        System.out.println("ID: " + Student_id);
        System.out.println("Name: " + Student_name);
        System.out.println("Dept: " + dept);
        System.out.println("Age: " + age);
        System.out.println("Section: " + section);
    }

    public static void main(String[] args) {
        student s = new student();
        s.Insert_studnet(1, "Alice", "CS", 20, "A");
        s.display();
    }
}
