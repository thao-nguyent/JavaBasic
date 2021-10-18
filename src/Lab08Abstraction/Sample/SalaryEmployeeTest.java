package Lab08Abstraction.Sample;

import java.util.ArrayList;
import java.util.List;

public class SalaryEmployeeTest {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

//        CEO ceo = new CEO();
//        Manager manager = new Manager();
//        StandardEmp standardEmp = new StandardEmp();

        Employee ceo = new CEO();
        Employee manager = new Manager();
        Employee standardEmp = new StandardEmp();
        standardEmp = new Manager();


        employeeList.add(ceo);
        employeeList.add(manager);
        employeeList.add(standardEmp);

        System.out.println(getTotalSalaries(employeeList));
    }
    
    static int getTotalSalaries(List<Employee> employees){
        int totalSalaries = 0;

        for (Employee employee : employees) {
            totalSalaries = totalSalaries + employee.getSalary() + employee.getSupportMoney();
            
        }
        return totalSalaries;
    }
}
