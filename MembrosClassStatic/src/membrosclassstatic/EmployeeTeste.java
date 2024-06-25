package membrosclassstatic;


public class EmployeeTeste {
    public static void main(String[] args) {
        System.out.printf("Employees before instantiation: %d%n", Employee.getCount());
        
        Employee e1 = new Employee("Maria", "Raiser");
        Employee e2 = new Employee("Jurema", "Margar");
        
        System.out.printf("%nEmployees after instantiation: %n");
        System.out.printf("via e1.getCount(): %d%n", e1.getCount());
        System.out.printf("via e2.getCount(): %d%n", e2.getCount());
        System.out.printf("via Employee.getCount(): %d%n", Employee.getCount());
        
        
        System.out.printf("%nEmployee 1: %s  %s%nEmployee 2: %s  %s%n", 
                e1.getFirstName(), e1.getLastName(),
                e2.getFirstName(), e2.getLastName());
    }
}
