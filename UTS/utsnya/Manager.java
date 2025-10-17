package UTS.utsnya;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, int age, String employeeId, double salary, double bonus) {
        super(name, age, employeeId, salary);
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Bonus: " + this.bonus);
    }

}
