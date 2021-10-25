package Lab09Interface.Sample;

public class Employee implements IEmployee, Comparable <Employee> {
    @Override
    public int getSalary() {
        return 0;
    }

    @Override
    public int geSupportSalary() {
        return 0;
    }

    @Override
    public int compareTo(Employee compareEmloyee) {
        int diffSalary = this.getSalary() - compareEmloyee.getSalary();
        return diffSalary;
    }
}
