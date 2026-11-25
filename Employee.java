public class Employee {
    private String name;
    private int yearOfJoining;
    private double salary;
    private String address;

    // constructor
    public Employee(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public String getAddress() {
        return address;
    }

    // setters (we don't want anyone to change name of employee and year they joined)
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    // print method for the employee's information:
    public void printEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Year of joining: " + yearOfJoining);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("--------------");
    }


}
