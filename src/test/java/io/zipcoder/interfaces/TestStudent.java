package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testNullConstructor() {

        //Given
        Student student = new Student();

        //When
        Double expectedStudyTime = 0.0;
        Double acutalStudyTime = student.getTotalStudyTime();
        Long expectedId = 0L;
        Long actualId = student.getId();
        String expectedName = "";
        String actualName = student.getName();

        //Then
        Assert.assertEquals(expectedStudyTime, acutalStudyTime);
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);

    }

    @Test
    public void testConstructor1() {

        //Given
        Double expectedStudyTime = 80.0;
        Long expectedId = 4567L;
        String expectedName = "Lauren";
        Student student = new Student(expectedId, expectedName, expectedStudyTime);

        //When
        Double acutalStudyTime = student.getTotalStudyTime();
        Long actualId = student.getId();
        String actualName = student.getName();

        //Then
        Assert.assertEquals(expectedStudyTime, acutalStudyTime);
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);

    }

    @Test
    public void testConstructor2() {

        //Given
        Double expectedStudyTime = 2.0;
        Long expectedId = 101010101L;
        String expectedName = "Kujio";
        Student student = new Student(expectedId, expectedName, expectedStudyTime);

        //When
        Double acutalStudyTime = student.getTotalStudyTime();
        Long actualId = student.getId();
        String actualName = student.getName();

        //Then
        Assert.assertEquals(expectedStudyTime, acutalStudyTime);
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);

    }

    @Test
    public void testConstructor3() {

        //Given
        Double expectedStudyTime = 1000.0;
        Long expectedId = 5678321L;
        String expectedName = "Ann Takamaki";
        Student student = new Student(expectedId, expectedName, expectedStudyTime);

        //When
        Double acutalStudyTime = student.getTotalStudyTime();
        Long actualId = student.getId();
        String actualName = student.getName();

        //Then
        Assert.assertEquals(expectedStudyTime, acutalStudyTime);
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);

    }

    @Test
    public void testImplementation() {

        //Given
        Student student = new Student();

        //Then
        Assert.assertTrue(student instanceof Learner);

    }

    @Test
    public void testInheritance() {

        //Given
        Student student = new Student();

        //Then
        Assert.assertTrue(student instanceof Person);

    }

    @Test
    public void testLearn1() {

        //Given
        Student student = new Student();
        Double expected = 100.0;

        //When
        student.learn(expected);
        Double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testLearn2() {

        //Given
        Student student = new Student();
        Double expected = 145.67;

        //When
        student.learn(expected);
        Double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testLearn3() {

        //Given
        Student student = new Student();
        Double expected = 3.5;

        //When
        student.learn(expected);
        Double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testLearn4() {

        //Given
        Student student = new Student();
        Double expected = 0.70;

        //When
        student.learn(expected);
        Double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual);

    }
}
