package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor> {

    private final static Instructors INSTANCE = new Instructors();

    private Instructors() {

        Instructor[] instructors = {
                new Instructor(123L, "Dolio"),
                new Instructor(345L, "Kris"),
                new Instructor(678L, "Melanie"),
                new Instructor(945L, "Wilhelm")
        };

        add(instructors);
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }


    public Instructor[] toArray() {
        Instructor[] instructors = new Instructor[count()];

        for(int i = 0; i < instructors.length; i++) {
            instructors[i] = personList.get(i);
        }

        return instructors;
    }
}
