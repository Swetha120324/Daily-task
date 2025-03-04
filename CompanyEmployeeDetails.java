CODE:
class Company {
    
    static String companyName;
    String employeeName;
    public Company(String employeeName) {
        this.employeeName = employeeName;
    }
    
    public void displayDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee Name: " + employeeName);
    }
    public static void setCompanyName(String name) {
        companyName = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Company.setCompanyName("TechCorp");
              Company employee1 = new Company("Alice");
        Company employee2 = new Company("Bob");
        employee1.displayDetails();
        employee2.displayDetails();
        Company.setCompanyName("InnoTech");
        employee1.displayDetails();
        employee2.displayDetails();
    }
}

OUTPUT:
Company Name: TechCorp
Employee Name: Alice
Company Name: TechCorp
Employee Name: Bob
Company Name: InnoTech
Employee Name: Alice
Company Name: InnoTech
Employee Name: Bob
