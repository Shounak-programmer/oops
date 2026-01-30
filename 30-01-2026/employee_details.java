//java program to display employee details using class
class emp{
    protected String name;
    protected int id;
    protected String department;

    public emp(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

         // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    // Setter for department
    public void setDepartment(String department) {
        this.department = department;
    }

    public String toStringg() {
        return """
                EmployeeDetails: 
                name= %s
                Id= %d
                Department= %s
                \n""".formatted(name, id, department);
    }


}
public class employee_details {
    public static void main(String[] args) {
        emp employee1 = new emp("Alice", 101, "Engineering");
        System.out.println(employee1.toStringg());

        // Modifying employee details
        employee1.setDepartment("Research and Development");
        System.out.println("Updated " + employee1.toStringg());
    }
    
}
