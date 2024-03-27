package lesson4;


import java.util.List;

public class Employee implements Comparable<Employee>{


    private String firstName;
    private int id;
    private int phoneNumber;

    private int lengthOfWork;

    public Employee(int id, String firstName, int phoneNumber, int lengthOfWork) {
        this.id = id;
        this.firstName = firstName;
        this.lengthOfWork = lengthOfWork;
        this.phoneNumber = phoneNumber;
    }


    public String getFirstName() {
        return firstName;
    }


    public int getId() {
        return id;
    }

    public int getLengthOfWork() {
        return lengthOfWork;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "\n" + "Employee{ " + "firstName: "+ firstName + '\'' +
                ", id: " + id + '\'' +
                ", lengthOfWork: " + lengthOfWork +'\'' +
                ", phoneNumber: " + phoneNumber +
                '}';
    }
    @Override
    public int compareTo(Employee o) {
        return firstName.compareTo(o.getFirstName());
    }
}
