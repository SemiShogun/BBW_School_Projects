import java.util.Arrays;

public class EmployeeApplication {

    public static void main(String[] HEEENSHIN) {
        System.out.println("App starts");

        EmployeeRepository empRepo = new EmployeeRepository();

        empRepo.setup();

        // Create a new employee "Jon Arbuckle"
        Employee newEmp = new Employee();
        newEmp.setFirstName("Jon");
        newEmp.setLastName("Arbuckle");
        newEmp.setDepartementId(15);
        empRepo.createEmployee(newEmp);

        // Update "Jon Arbuckle" to "Garfield the Cat"
        Employee updEmp = new Employee();
        updEmp.setId(11);
        updEmp.setFirstName("Garfield");
        updEmp.setLastName("The Cat");
        updEmp.setDepartementId(100);
        empRepo.updateEmployee(updEmp);

        // Create another "Jon Arbuckle"
        empRepo.createEmployee(newEmp);

        // Delete the new "Jon Arbuckle"
        // Note: I had to find the id myself, that's bad practice
        empRepo.deleteEmployee(12);

        // Retrieve all values from the employees table
        System.out.println(Arrays.toString(empRepo.getAllEmployees().toArray()));

        empRepo.closeup();
    }
}
