package homework01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Задание 2.а)
        Set<Employee> employees = new HashSet<>();
        employees.add(new Developer("Bob", 35));
        employees.add(new ProjectManager("Boss", 40));
        employees.add(new Junior("John",28));

        //Задание 2.b)
        List<Employee> employeeList = new ArrayList<>(employees);
    }
}
