package task6;

public class Employee {
    String name;
    String address;
    int yearOfJoining;
    int salary;
    public static void main(String[] args) {
        Employee employees1 = new Employee("Robert", "64C- WallsStreet", 1994, 0);
        Employee employees2 = new Employee("Sam", "68D- WallsStreet", 2000, 0);
        Employee employees3 = new Employee("John", "26B- WallsStreet", 1999, 0);
    }
    public Employee(String name, String address, int yearOfJoining, int salary) {
        this.name = name;
        this.address = address;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public int getSalary() {
        return salary;
    }


}
