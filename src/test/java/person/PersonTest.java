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
}