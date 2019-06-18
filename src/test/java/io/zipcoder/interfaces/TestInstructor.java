package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation() {
        Instructor instructor = new Instructor();
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor();
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach1() {

        //Given
        Student student = new Student();
        Instructor instructor = new Instructor();
        Double expected = 100.0;

        //When
        instructor.teach(student, expected);
        Double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testTeach2() {

        //Given
        Student student = new Student();
        Instructor instructor = new Instructor();
        Double expected = 1000.0;

        //When
        instructor.teach(student, expected);
        Double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testTeach3() {

        //Given
        Student student = new Student();
        Instructor instructor = new Instructor();
        Double expected = 1.0;

        //When
        instructor.teach(student, expected);
        Double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testTeach4() {

        //Given
        Student student = new Student();
        Instructor instructor = new Instructor();
        Double expected = 0.0;

        //When
        instructor.teach(student, expected);
        Double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testTeach5() {

        //Given
        Student student = new Student();
        Instructor instructor = new Instructor();
        Double expected = 45.0;

        //When
        instructor.teach(student, expected);
        Double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testLecture1() {

        //Given
        Student[] students = {new Student(), new Student()};
        Instructor instructor = new Instructor();
        Double numOfHours = 50.0;

        //When
        instructor.lecture(students, numOfHours);
        Double actual = students[0].getTotalStudyTime();
        Double expected = numOfHours / students.length;

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testLecture2() {

        //Given
        Student[] students = {new Student(), new Student()};
        Instructor instructor = new Instructor();
        Double numOfHours = 100.0;

        //When
        instructor.lecture(students, numOfHours);
        Double actual = students[0].getTotalStudyTime();
        Double expected = numOfHours / students.length;

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testLecture3() {

        //Given
        Student[] students = {new Student(), new Student(), new Student()};
        Instructor instructor = new Instructor();
        Double numOfHours = 30.0;

        //When
        instructor.lecture(students, numOfHours);
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
        Instructor instructor = new Instructor();
        Double numOfHours = 50.0;

        //When
        instructor.lecture(students, numOfHours);
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
        Instructor instructor = new Instructor();
        Double numOfHours = 120.0;

        //When
        instructor.lecture(students, numOfHours);
        Double actual = students[0].getTotalStudyTime();
        Double expected = numOfHours / students.length;

        //Then
        Assert.assertEquals(expected, actual);

    }
}
