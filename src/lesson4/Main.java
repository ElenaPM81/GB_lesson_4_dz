package lesson4;

//Создать справочник сотрудников
//Необходимо:
//Создать класс справочник сотрудников, который содержит внутри
//коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
//Табельный номер
//Номер телефона
//Имя
//Стаж
//Добавить метод, который ищет сотрудника по стажу (может быть список)
//Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
//Добавить метод, который ищет сотрудника по табельному номеру
//Добавить метод добавления нового сотрудника в справочник


import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Employee_directory.createListNames();
        System.out.println(employees);
        System.out.println(searchForOnEmployeeBasedOnExperience(employees, 13));
        System.out.println(findPhoneNumbersByName(employees, "Руслан"));
        System.out.println(findEmployeeByEmployeeId(employees, 5));
    }

    public static List<Employee>  searchForOnEmployeeBasedOnExperience(List<Employee> employees, int lengthOfWork){
        return employees.stream().filter(emp -> emp.getLengthOfWork() == lengthOfWork).toList();
    }

    public static List<Integer> findPhoneNumbersByName(List<Employee> employees, String name){
        return  employees.stream()
                .filter(employee -> employee.getFirstName().equals(name))
                .map(Employee::getPhoneNumber)
                .collect(Collectors.toList());
    }

    public static Employee findEmployeeByEmployeeId(List<Employee> employees, int employeeId){
        return employees.stream()
                .filter(employee -> employee.getId() == employeeId)
                .findFirst()
                .orElse(null);
    }




}
