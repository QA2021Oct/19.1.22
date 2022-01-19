public class Employee {
    private String name;
    private double monthlySalary;
    private int age;

    public Employee(){

    }

    public Employee(String name, double monthlySalary, int age) {
        this.name = name;
        this.monthlySalary = monthlySalary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
