package Lab05;

import java.util.HashMap;
import java.util.Map;

public class SalaryEmployeeTest {
    public static void main(String[] args) {
        Map<Employee, Integer> employeeList = new HashMap<>();

        employeeList.put(new Employee(100), 1 );
        employeeList.put(new Employee(60), 1 );
        employeeList.put(new Employee(25), 3 );

        int sumSalary = 0;
        for (Employee rank : employeeList.keySet()){
            sumSalary += rank.getSalaryRange()*employeeList.get(rank);
        }

        System.out.println("Sum salary: " + sumSalary);

    }
}
