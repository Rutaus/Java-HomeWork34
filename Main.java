public class Main {
    public static void main(String[] args){

        // 3: Write code that creates an instance of the class by using both constructors.
        // For each new instance of that class call the print method that you added.

        // empty constructor:
        NumberHolder num1 = new NumberHolder();
        num1.intNumber = 5;
        num1.floatNumber = 5.0f;

        // print our first obj:
        System.out.println("First object:");
        num1.printNumbers();


        // custom constructor:
        NumberHolder num2 = new NumberHolder(20);

        // print our second obj:
        System.out.println("\nSecond object:");
        num2.printNumbers();


        // 4: Assign and print the info of two students:
        Student student1 = new Student("Sam", 101, "0501234567", "Dekel 10, Tel Aviv" );
        System.out.println("\n===== Student 1 =====");
        student1.printStudent();

        Student student2 = new Student("John", 102, "0507654321", "Shaked 17, Nahariya");
        System.out.println("\n===== Student 2 =====");
        student2.printStudent();


        // 5: Write a program that prints the area of a rectangle
        // Run your program to check that it's working.
        Rectangle rectangle = new Rectangle(4,5);
        System.out.println("\n=============");
        System.out.println("Rectangle area: " + rectangle.getArea());


        // 6: Print the average of three numbers entered by the user:
        Average average = new Average();
        System.out.println("\n=============");
        average.calcAverage(2, 4, 6);


        // 7: Write a program that would print the information:
        Employee employee1 = new Employee("Robert", 1994, 8000, "64C- WallsStreat");
        Employee employee2 = new Employee("Sam", 2000, 6500, "68D- WallsStreat");
        Employee employee3 = new Employee("John", 1999, 7000, "26B- WallsStreat");

        System.out.println("\n=============");
        employee1.printEmployee();
        employee2.printEmployee();
        employee3.printEmployee();

        // additional:
        employee1.setSalary(8500);
        employee2.setAddress("68A- WallsStreat");
        System.out.println("employee 1 salary after raise: " + employee1.getSalary());
        System.out.println("employee 2 address after moving out: " + employee2.getAddress());
    }

}
