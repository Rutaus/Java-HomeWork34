public class NumberHolder {
    public int intNumber;
    public float floatNumber;

    // add 2 types of constructors to this class:
    // 1. empty construction
    // 2. custom constructor with 1 of the field at your choice has always a default value
    public NumberHolder() {
    }

    public NumberHolder(int intNumber) {
        this.intNumber = intNumber;
        this.floatNumber = 10.0f;
    }

    // add a print method that will allow you to print each object field
    public void printNumbers() {
        System.out.println("int number: " + intNumber);
        System.out.println("float number: " + floatNumber);
    }

}
