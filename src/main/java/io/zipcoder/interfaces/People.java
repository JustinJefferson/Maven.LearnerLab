package io.zipcoder.interfaces;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<Person> {

    protected List<E> personList;

    public People() {
        personList = new LinkedList<>();
    }

    public void add(E person) {
        personList.add(person);
    }

    public void add(E[] persons) {
        for(E person : persons) {
            personList.add(person);
        }
    }

    public E findById(Long id) {
        for(E person : personList) {
            if(person.getId().equals(id)) return person;
        }
        return null;
    }

    public Boolean contains(E person) {
        return personList.contains(person);
    }

    public void remove(E person) {
        personList.remove(person);
    }

    public void remove(Long id) {
        for(E person : personList) {
            if(person.getId().equals(id)) {
                personList.remove(person);
                break;
            }
        }
    }

    public void removeAll() {
        personList.clear();
    }

    public Boolean isEmpty() {
        return personList.isEmpty();
    }

    public Integer count() {
        return personList.size();
    }

    abstract E[] toArray(); //{

//        E[] persons = (E[]) Array.newInstance(, count());
//
//        for(int i = 0; i < persons.length; i++) {
//            persons[i] = personList.get(i);
//        }
//
//
//        return persons;
   // }

    public Iterator<Person> iterator() {
        return null;
    }


}
