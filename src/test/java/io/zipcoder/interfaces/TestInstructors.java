package io.zipcoder.interfaces;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestInstructors {

    @Test
    public void instructorsCountTest() {

        Integer expected = 4;
        Integer actual = Instructors.getInstance().count();

        assertEquals(expected, actual);

    }

    @Test
    public void instructorsTest() {

        Instructor[] instructors = Instructors.getInstance().toArray();

        for(Instructor instructor : instructors) {
            assertTrue(Instructors.getInstance().contains(instructor));
        }
    }
}
