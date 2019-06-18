package io.zipcoder.interfaces;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class People implements Iterable<Person> {

    private List<Person> personList;

    public People() {
        personList = new LinkedList<>();
    }

    public void add(Person person) {}

    public void add(Person[] persons) {}

    public Person findById(Long id) {
        return null;
    }

    public Boolean contains(Person person) {
        return null;
    }

    public void remove(Person person) {

    }

    public void remove(Long id) {

    }

    public void removeAll() {}

    public Boolean isEmpty() {
        return null;
    }

    public Integer count() {
        return personList.size();
    }

    public Person[] toArray() {
        return null;
    }

    public Iterator<Person> iterator() {
        return null;
    }


}
