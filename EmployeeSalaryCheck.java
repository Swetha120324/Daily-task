CODE:
class Employee {

    private int id;
    private int salary;

    // Corrected method to set salary
    public void setSalary(int mySalary) {
        this.salary = mySalary;
    }

    // Corrected getter method for salary
    public int getSalary() {
        return salary;
    }

    // Main method to test the functionality
    public static void main(String args[]) {
        Employee e = new Employee();
        e.setSalary(20000);

        // Check the salary and print the result
        if (e.getSalary() > 10000) {
            System.out.println("Salary uploaded successfully");
        } else {
            System.out.println("Error");
        }
    }
}

OUTPUT:
Salary uploaded successfully

