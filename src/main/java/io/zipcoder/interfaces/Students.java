package io.zipcoder.interfaces;

public final class Students extends People<Student> {

    private final static Students INSTANCE = new Students();

    private Students() {
        Student[] students = {
                new Student(11111L, "Rob", 0.0),
                new Student( 22222L, "Angelica", 0.0),
                new Student( 33333L, "Sputnika", 0.0),
                new Student( 44444L, "Connor", 0.0)
        };

        add(students);
    }

    public static Students getInstance() {
        return INSTANCE;
    }

    public Student[] toArray() {
        Student[] students = new Student[count()];

        for(int i = 0; i < students.length; i++) {
            students[i] = personList.get(i);
        }

        return students;
    }


}
