package person;

public class Person {
    private String name = "đạt";
    private String address = "gầm cầu";

    public Person() {

    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "thằng " + getName() + " đang trú tại: " + getAddress();
    }
}
