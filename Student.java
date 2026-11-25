public class Student {
    String name;
    int roll_no;
    String phoneNumber;  // when I tried to print int - the first 0 in 050 did not count, so used String
    String address;

    // constructor
    public Student(String name, int roll_no, String phoneNumber, String address) {
        this.name = name;
        this.roll_no = roll_no;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    // method to print the students information:
    public void printStudent() {
        System.out.println("Student name: " + name);
        System.out.println("Student roll number: " + roll_no);
        System.out.println("Student phone number: " + phoneNumber);
        System.out.println("Student address: " + address);
    }
}
