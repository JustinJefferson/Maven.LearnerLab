package io.zipcoder.interfaces;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestStudents {

    @Test
    public void studentsCountTest() {

        Integer expected = 4;
        Integer actual = Students.getInstance().count();

        assertEquals(expected, actual);

    }

    @Test
    public void studentTest() {
        Student[] students = Students.getInstance().toArray();

        for(Student student : students) {
            assertTrue(Students.getInstance().contains(student));
        }
    }
}
