package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {

    @Test
    public void testATimeWorked() {

        //Given
        Student student = new Student();
        Educator educator = Educator.DOLIO;
        Double expected = 100.0;

        //When
        educator.teach(student, expected);
        Double actual = educator.getTimeWorked();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testATimeWorked2() {

        //Given
        Student student = new Student();
        Educator educator = Educator.DOLIO;
        Double expected = 100.0 * 2;

        //When
        educator.teach(student, expected / 2);
        Double actual = educator.getTimeWorked();

        //Then
        Assert.assertEquals(expected, actual);

    }




    @Test
    public void testTeach1() {

        //Given
        Student student = new Student();
        Educator educator = Educator.DOLIO;
        Double expected = 100.0;

        //When
        educator.teach(student, expected);
        Double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testTeach2() {

        //Given
        Student student = new Student();
        Educator educator = Educator.MELENIE;
        Double expected = 1000.0;

        //When
        educator.teach(student, expected);
        Double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testTeach3() {

        //Given
        Student student = new Student();
        Educator educator = Educator.KRIS;
        Double expected = 1.0;

        //When
        educator.teach(student, expected);
        Double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testTeach4() {

        //Given
        Student student = new Student();
        Educator educator = Educator.WILHELM;
        Double expected = 0.0;

        //When
        educator.teach(student, expected);
        Double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual);

    }


    @Test
    public void testLecture1() {

        //Given
        Student[] students = {new Student(), new Student()};
        Educator educator = Educator.WILHELM;
        Double numOfHours = 50.0;

        //When
        educator.lecture(students, numOfHours);
        Double actual = students[0].getTotalStudyTime();
        Double expected = numOfHours / students.length;

        //Then
        Assert.assertEquals(expected, actual);

    }


    @Test
    public void testLecture3() {

        //Given
        Student[] students = {new Student(), new Student(), new Student()};
        Educator educator = Educator.KRIS;
        Double numOfHours = 30.0;

        //When
        educator.lecture(students, numOfHours);
        Double actual = students[0].getTotalStudyTime();
        Double expected = numOfHours / students.length;

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testLecture4() {

        //Given
        Integer numOfStudents = 100;
        Student[] students = new Student[numOfStudents];
        for(int i = 0; i < numOfStudents; i++) {
            students[i] = new Student();
        }
        Educator educator = Educator.DOLIO;
        Double numOfHours = 50.0;

        //When
        educator.lecture(students, numOfHours);
        Double actual = students[0].getTotalStudyTime();
        Double expected = numOfHours / students.length;

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testLecture5() {

        //Given
        Integer numOfStudents = 60;
        Student[] students = new Student[numOfStudents];
        for(int i = 0; i < numOfStudents; i++) {
            students[i] = new Student();
        }
        Educator educator = Educator.MELENIE;
        Double numOfHours = 120.0;

        //When
        educator.lecture(students, numOfHours);
        Double actual = students[0].getTotalStudyTime();
        Double expected = numOfHours / students.length;

        //Then
        Assert.assertEquals(expected, actual);

    }
}
