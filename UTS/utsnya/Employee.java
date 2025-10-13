package UTS.utsnya;

public class Employee extends Person {
    String employeeId;
    double salary;

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    
    public String getEmployeeId() {
        return employeeId;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void info() {
        setName("Basuki");
        setAge(30);
        System.out.println("Nama " + getName() + "\n" + "Umur : " + getAge());
    }
}
