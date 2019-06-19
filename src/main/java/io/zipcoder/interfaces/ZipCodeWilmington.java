package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public final class ZipCodeWilmington {

    private static ZipCodeWilmington INSTANCE;
    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();

    private ZipCodeWilmington() {}

    public static ZipCodeWilmington getInstance() { //Lazy Initialization

        if(INSTANCE == null) {
            INSTANCE = new ZipCodeWilmington();
        }
        else {
            System.out.println("Err: ZipCodeWilmington already exists");
        }

        return INSTANCE;
    }

    public void hostLecture(Educator educator, double numOfHours) {
        Student[] zipCoders = students.toArray();
        educator.lecture(zipCoders, numOfHours);
    }

    public void hostLecture(Teacher teacher, double numOfHours) {
        Student[] zipCoders = students.toArray();
        teacher.lecture(zipCoders, numOfHours);
    }

    public void hostLecture(long id, double numOfHours) {
        Instructor instructor = instructors.findById(id);
        if(instructor != null) {
            hostLecture(instructor, numOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {

        Student[] zipCoders = students.toArray();
        Map<Student, Double> studyMap = new HashMap<>();

        for(Student zipCoder : zipCoders) {
            studyMap.put(zipCoder, zipCoder.getTotalStudyTime());
        }

        return studyMap;
    }
}
