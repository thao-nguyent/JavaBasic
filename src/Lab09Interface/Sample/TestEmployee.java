package Lab09Interface.Sample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestEmployee {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new StandardEmployee());
        employeeList.add(new Manager());

        Collections.sort(employeeList);

        for (int empIndx = 0; empIndx < employeeList.size(); empIndx++){
            System.out.println(employeeList);
        }
    }
}
