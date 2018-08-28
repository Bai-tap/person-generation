package person;

public class Application {
    public static void main(String[] args) {
        Person person = new Person();
        Student dat = new Student("đạt", "bãi tha ma", 99999, "CGC-Java", 1);
        System.out.println(dat.toString());

        Staff thao = new Staff("thảo", "không biết", "Codegym", 1000);
        System.out.println(thao.toString());
    }
}
