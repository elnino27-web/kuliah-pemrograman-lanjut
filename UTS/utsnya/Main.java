package UTS.utsnya;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Manager manager = new Manager();


        employee.info();
        employee.setEmployeeId("E123");
        employee.setSalary(5000000.0);
        System.out.println("Employee ID : " + employee.getEmployeeId());
        System.out.println("Gaji : " + employee.getSalary());

        manager.setBonus(2000000.0);
        System.out.println("Bonus : " + manager.getBonus());
    }
}
