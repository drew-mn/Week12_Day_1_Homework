package Staff;

public class Employee {

    private String name;
    private String niNumber;
    public Double salary;

    public Employee(String name, String niNumber, Double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public Double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public void setNiNumber(String niNumber) {
        this.niNumber = niNumber;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void raiseSalary(Double raise) {
        if (raise > 0) {
            this.salary += raise;
        }
    }

    public Double payBonus() {
        return this.salary * 0.01;
    }
}
