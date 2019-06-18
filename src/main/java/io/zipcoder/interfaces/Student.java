package io.zipcoder.interfaces;

public class Student extends Person implements Learner{

    private double totalStudyTime;

    public Student() {
        totalStudyTime = 0.0;
    }

    public Student(Long id, String name, Double totalStudyTime) {
        super(id, name);
        this.totalStudyTime = totalStudyTime;
    }

    public void learn(double numOfHours) {
        totalStudyTime += numOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }

}
