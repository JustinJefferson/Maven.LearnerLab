/*
package io.zipcoder.interfaces;


import org.junit.Test;

import static org.junit.Assert.*;

public class TestPeople {

    @Test
    public void addTest1() {

        //Given
        People<Person> people = new People<>();
        Person expected = new Person();

        //When
        people.add(expected);

        //Then
        assertTrue(people.contains(expected));

    }

    @Test
    public void addTest2() {

        //Given
        People<Person> people = new People<>();
        Person expected = new Person();

        //Then
        assertFalse(people.contains(expected));

    }

    @Test
    public void addTest3() {

        //Given
        People<Person> people = new People<>();
        Person expected = new Student();

        //When
        people.add(expected);

        //Then
        assertTrue(people.contains(expected));

    }

    @Test
    public void findById1() {

        //Given
        People<Person> people = new People<>();
        Person expected = new Person();

        //When
        people.add(expected);
        Person actual = people.findById(expected.getId());

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void findById2() {

        //Given
        People people = new People();
        Person expected = new Instructor();

        //When
        people.add(expected);
        Person actual = people.findById(expected.getId());

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void findById3() {

        //Given
        People<Instructor> people = new People<>();
        Instructor expected = new Instructor(4568L, "Carol");
        Instructor other = new Instructor(123L, "Bob");
        Instructor other2 = new Instructor();

        //When
        people.add(expected);
        people.add(other);
        people.add(other2);
        Person actual = people.findById(expected.getId());

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void removeByPersonTest1() {

        //Given
        People<Person> people = new People<>();
        Person expected = new Person();
        people.add(expected);

        //When
        people.remove(expected);

        //Then
        assertFalse(people.contains(expected));

    }

    @Test
    public void removeByPersonTest2() {

        //Given
        People<Instructor> people = new People<>();
        Instructor expected = new Instructor();
        people.add(expected);

        //When
        people.remove(expected);

        //Then
        assertFalse(people.contains(expected));

    }

    @Test
    public void removeByIdTest1() {

        //Given
        People<Person> people = new People<>();
        Person expected = new Person();
        people.add(expected);

        //When
        people.remove(expected.getId());

        //Then
        assertFalse(people.contains(expected));
    }

    @Test
    public void removeByIdTest2() {

        //Given
        People<Person> people = new People<>();
        Person expected = new Student();
        people.add(expected);

        //When
        people.remove(expected.getId());

        //Then
        assertFalse(people.contains(expected));
    }

    @Test
    public void removeAll1() {

        //Given
        People<Person> people = new People<>();
        Person person1 = new Person();
        people.add(person1);

        //When
        people.removeAll();

        //Then
        assertTrue(people.isEmpty());

    }

    @Test
    public void removeAll2() {

        //Given
        People<Person> people = new People<>();
        Person[] persons = {new Person(), new Person() ,new Person()};
        people.add(persons);

        //When
        people.removeAll();

        //Then
        assertTrue(people.isEmpty());

    }

    @Test
    public void removeAll3() {

        //Given
        People<Person> people = new People<>();
        Integer numOfPeople = 100;
        Person[] persons = new Person[numOfPeople];
        for(int i = 0; i < numOfPeople; i++) {
            persons[i] = new Person();
        }
        people.add(persons);

        //When
        people.removeAll();

        //Then
        assertTrue(people.isEmpty());

    }

    @Test
    public void count1() {

        //Given
        People<Person> people = new People<>();
        Integer numOfPeople = 100;
        Person[] persons = new Person[numOfPeople];
        for(int i = 0; i < numOfPeople; i++) {
            persons[i] = new Person();
        }
        people.add(persons);

        //When
        Integer actual = people.count();

        //Then
        assertEquals(numOfPeople, actual);


    }

    @Test
    public void count2() {

        //Given
        People<Person> people = new People<>();
        Integer numOfPeople = 1234;
        Person[] persons = new Person[numOfPeople];
        for(int i = 0; i < numOfPeople; i++) {
            persons[i] = new Person();
        }
        people.add(persons);

        //When
        Integer actual = people.count();

        //Then
        assertEquals(numOfPeople, actual);


    }

    @Test
    public void count3() {

        //Given
        People<Person> people = new People<>();
        Integer numOfPeople = 60;
        Person[] persons = new Person[numOfPeople];
        for(int i = 0; i < numOfPeople; i++) {
            persons[i] = new Person();
        }
        people.add(persons);

        //When
        Integer actual = people.count();

        //Then
        assertEquals(numOfPeople, actual);

    }

    @Test
    public void toArray1() {

        //Given
        People<Person> people = new People<>();
        Integer numOfPeople = 60;
        Person[] persons = new Person[numOfPeople];
        for(int i = 0; i < numOfPeople; i++) {
            persons[i] = new Person();
        }
        people.add(persons);

        //When
        Person[] actual = people.toArray();

        //Then
        assertArrayEquals(persons, actual);


    }

    @Test
    public void toArray2() {

        //Given
        People<Person> people = new People<>();

        Person[] persons = { new Person(), new Student(), new Instructor() };

        people.add(persons);

        //When
        Person[] actual = people.toArray();

        //Then
        assertArrayEquals(persons, actual);


    }

    @Test
    public void iterator() {
        fail();
    }
}

 */