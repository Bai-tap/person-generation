package person;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testGetName() {
        Person person = new Person("tiến", "bãi rác");
        String expected = "tiến";

        String actual = person.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetAddress() {
        Person person = new Person("tiến", "bãi rác");
        String expected = "bãi rác";

        String actual = person.getAddress();
        assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        Person person = new Person("sơn", "vỏ ốc");
        String expected = "thằng sơn đang trú tại: vỏ ốc";

        String actual = person.toString();
        assertEquals(actual, expected);
    }
}