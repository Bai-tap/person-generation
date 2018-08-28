package person;

public class Student extends Person {
    private double fee = 1;
    private String program = "hello";
    private int year = 1;

    public Student() {

    }

    public Student(double fee, String program, int year) {
        this.fee = fee;
        this.program = program;
        this.year = year;
    }

    public Student(String name, String address, double fee, String program, int year) {
        super(name, address);
        this.fee = fee;
        this.program = program;
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "thằng " + getName() + " đang trú tại: " + getAddress() + ", đang học chương trình: " + getProgram()
                + " trong " + getYear() + " năm, nợ " + getFee() + "vnđ tiền học phí";
    }
}
