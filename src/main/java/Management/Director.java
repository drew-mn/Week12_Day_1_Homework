package Management;
import Management.Manager;

public class Director extends Manager {

    private double budget;

    public Director(String name, String niNumber, double salary, String deptName, Double budget) {
        super(name, niNumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }

    public Double payBonus() {
        return this.salary * 0.02;
    }

}