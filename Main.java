import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Klaudia", 3500, 1, "2023-08-09", "Florist");
        Worker worker2 = new Worker("Magda", 6700, 2, "2022-09-30", "Junior Developer");
        Worker worker3 = new Worker("Pawel", 2300, 3, "2015-02-20", "Driver");
        Worker worker4 = new Worker("Patryk", 6450, 4, "2017-07-17", "Electritian");
        Worker worker5 = new Worker("Przemek", 2700, 3, "2020-02-22", "Chauffer"); 
                                                                                      
        Manager manager1 = new Manager("Renata", 5500, 5, "2022-08-15", "Quality Manager");
        Manager manager2 = new Manager("Marlena", 6000, 1, "2023-12-19", "Florist Manager"); 
                                                                            

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(manager1);
        employees.add(manager2);

        double totalSalary = 0;
        double totalManagerSalary = 0;
        double totalWorkerSalary = 0;

        // Mapa do przechowywania pracowników o tym samym id
        Map<Integer, List<Employee>> idMap = new HashMap<>();
        for (Employee emp : employees) {
            totalSalary += emp.getSalary();
            if (emp instanceof Manager) {
                totalManagerSalary += emp.getSalary();
            } else if (emp instanceof Worker) {
                totalWorkerSalary += emp.getSalary();
            }
            // Sprawdź, czy pracownik o tym samym id już istnieje w mapie
            if (idMap.containsKey(emp.getId())) {
                idMap.get(emp.getId()).add(emp);
            } else {
                List<Employee> empList = new ArrayList<>();
                empList.add(emp);
                idMap.put(emp.getId(), empList);
            }
        }

        // Wyświetlanie informacji o sumach pensji
        System.out.println("Total salary: " + totalSalary);
        System.out.println("Total manager salary: " + totalManagerSalary);
        System.out.println("Total worker salary: " + totalWorkerSalary);

        // Wyświetlanie pracowników o tym samym id
        for (Map.Entry<Integer, List<Employee>> entry : idMap.entrySet()) {
            List<Employee> empList = entry.getValue();
            if (empList.size() > 1) {
                System.out.println("Employees with same ID: ");
                for (Employee emp : empList) {
                    System.out.println("- " + emp.getName());
                }
            }
        }
    }
}