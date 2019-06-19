package io.zipcoder.interfaces;

public enum Educator implements Teacher {

    DOLIO(Instructors.getInstance().findById(123L)),
    KRIS(Instructors.getInstance().findById(345L)),
    MELENIE(Instructors.getInstance().findById(678L)),
    WILHELM(Instructors.getInstance().findById(945L));

    private Instructor instructor;
    private Double timeWorked;

    Educator (Instructor instructor) {
        this.instructor = instructor;
        timeWorked = 0.0;
    }

    public void teach(Learner learner, double numOfHours) {
        instructor.teach(learner, numOfHours);
        timeWorked += numOfHours;
    }

    public void lecture(Learner[] learners, double numOfHours) {
        instructor.lecture(learners, numOfHours);
        timeWorked += numOfHours;
    }

    public Double getTimeWorked() {
        return timeWorked;
    }

}

