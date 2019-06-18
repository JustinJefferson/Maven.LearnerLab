package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {

    public Instructor() {
        super();
    }

    public Instructor(Long id, String name) {
        super(id, name);
    }

    public void teach(Learner learner, double numOfHours) {
        learner.learn(numOfHours);
    }

    public void lecture(Learner[] learners, double numOfHours) {
        double numOfHoursPerLearner = numOfHours / learners.length;
        for(Learner learner : learners) {
            learner.learn(numOfHoursPerLearner);
        }
    }

}
