package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testNullConstructor() {

        //Given
        Person person = new Person();

        //When
        Long expectedId = Long.MIN_VALUE;
        String expectedName = "";

        //Then
        Assert.assertEquals(expectedId, person.getId());
        Assert.assertEquals(expectedName, person.getName());


    }

    @Test
    public void testConstructor1() {

        //Given
        Long expectedId = 1234567L;
        String expectedName = "Connor";
        Person person = new Person(expectedId, expectedName);

        //When
        Long actualId = person.getId();
        String actualName = person.getName();

        //Then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);

    }

    @Test
    public void testConstructor2() {

        //Given
        Long expectedId = 10101010101010L;
        String expectedName = "Definitely Human";
        Person person = new Person(expectedId, expectedName);

        //When
        Long actualId = person.getId();
        String actualName = person.getName();

        //Then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);

    }

    @Test
    public void testConstructor3() {

        //Given
        Long expectedId = 600000001L;
        String expectedName = "Grummpus";
        Person person = new Person(expectedId, expectedName);

        //When
        Long actualId = person.getId();
        String actualName = person.getName();

        //Then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);

    }

    @Test
    public void testConstructor4() {

        //Given
        Long expectedId = 876643322L;
        String expectedName = "Julian Caesar";
        Person person = new Person(expectedId, expectedName);

        //When
        Long actualId = person.getId();
        String actualName = person.getName();

        //Then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);

    }

    @Test
    public void testSetName1() {

        //Given
        Person person = new Person();
        String expected = "Haggrid";

        //When
        person.setName(expected);
        String actual = person.getName();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testSetName2() {

        //Given
        Person person = new Person();
        String expected = "Harry";

        //When
        person.setName(expected);
        String actual = person.getName();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testSetName3() {

        //Given
        Person person = new Person();
        String expected = "Nessa";

        //When
        person.setName(expected);
        String actual = person.getName();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testSetName4() {

        //Given
        Person person = new Person();
        String expected = "Lance";

        //When
        person.setName(expected);
        String actual = person.getName();

        //Then
        Assert.assertEquals(expected, actual);

    }

}
