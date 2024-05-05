import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Klaudia", 3500, 1, "2023-08-09", "Florist");
        Worker worker2 = new Worker("Magda", 6700, 2, "2022-09-30", "Junior Developer");
        Worker worker3 = new Worker("Pawel", 2300, 1, "2015-02-20", "Driver");
        Manager manager = new Manager("Renata", 5500, 3, "2022-08-15", "Quality Manager");


        System.out.println(worker1.getName() + " has code: " + worker1.hashCode());
        System.out.println(worker2.getName() + " has code: " + worker2.hashCode());
        System.out.println(worker3.getName() + " has code: " + worker3.hashCode());
        System.out.println(manager.getName() + " has code: " + manager.hashCode());


        System.out.println(worker3.getName() + " equals worker1: " + worker3.equals(worker1));
        System.out.println(worker3.getName() + " equals worker2: " + worker3.equals(worker2));
        System.out.println(worker3.getName() + " equals manager: " + worker3.equals(manager));
    }
}