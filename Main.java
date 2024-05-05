import java.util.ArrayList;
import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Klaudia", 3500, 1, "2023-08-09", "Florist");
        Worker worker2 = new Worker("Magda", 6700, 2, "2022-09-30", "Junior Developer");
        Worker worker3 = new Worker("Pawel", 2300, 3, "2015-02-20", "Driver");
        Worker worker4 = new Worker("Patryk", 6540, 4, "2017-07-17", "Electritian");

        Manager manager = new Manager("Renata", 5500, 5, "2022-08-15", "Quality Manager");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee emp : employees) {
            System.out.println("- " + emp.getName() + " (ID: " + emp.getId() +
                    ", Position: " + emp.getPosition() +
                    ", Hire date: " + emp.getHireDate() +
                    ", Salary: " + emp.getSalary() + ")");
            emp.work();
        }
    }
}