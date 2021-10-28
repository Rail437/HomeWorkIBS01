package homeWork02;

import homeWork01.Developer;
import homeWork01.Employee;
import homeWork01.Junior;
import homeWork01.ProjectManager;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main02 {
    public static void main(String[] args) {
        //Задание 2.а)
        List<Employee> employees = new ArrayList<>();
        employees.add(new ProjectManager("Boss", 40));
        employees.add(new ProjectManager("Donni",42));
        employees.add(new ProjectManager("Connor",38));
        employees.add(new Developer("Bob", 35));
        employees.add(new Developer("Scott",46));
        employees.add(new Developer("Arnold",37));
        employees.add(new Developer("Bobbi", 39));
        employees.add(new Developer("Summit",32));
        employees.add(new Junior("John",28));
        employees.add(new Junior("Sam",29));
        employees.add(new Junior("Alex",22));

        //Задание 2.b)
        List<Employee> oldEmployee = employees.stream().filter(employee -> employee.getAge() > 30).collect(Collectors.toList());

        //Задание 2.c)
        employees.stream().map(Employee::getName).forEach(System.out::println);

    }
}
