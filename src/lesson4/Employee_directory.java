package lesson4;


import java.util.ArrayList;
import java.util.List;

public class Employee_directory {
    static List<Employee> createListNames(){
        List<Employee> employees = new ArrayList<>();

        Employee employee1 = new Employee(1, "Иван", 234, 13 );
        Employee employee2 = new Employee(2, "Евгений", 345, 5);
        Employee employee3 = new Employee(3, "Руслан", 876, 4);
        Employee employee4 = new Employee(4, "Надежда", 478, 5);
        Employee employee5 = new Employee(5, "Екатерина", 339, 1);
        Employee employee6 = new Employee(6, "Егор", 111, 20);

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);

        return employees ;
    }


}
