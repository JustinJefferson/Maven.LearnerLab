package io.zipcoder.interfaces;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TestZipCodeWilmington {

    @Test
    public void isSingletonTest() {

        //Given
        ZipCodeWilmington expected = ZipCodeWilmington.getInstance();

        //When
        ZipCodeWilmington actual = ZipCodeWilmington.getInstance();

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void hostLectureTest1() {
        //Given
        ZipCodeWilmington zipCode = ZipCodeWilmington.getInstance();
        Student[] students = Students.getInstance().toArray();
        Double previousStudyTime = students[0].getTotalStudyTime();
        Double numOfHours = 200.0;
        zipCode.hostLecture(new Instructor(), numOfHours);

        //When
        Double expected = numOfHours / Students.getInstance().count() + previousStudyTime;
        Map<Student, Double> studyMap = zipCode.getStudyMap();
        List<Student> studentKeys = new LinkedList<>(studyMap.keySet());


        //Then
        for(Student student : studentKeys) {
            assertEquals(expected, studyMap.get(student));
        }

    }

    @Test
    public void hostLectureTest2() {
        //Given
        ZipCodeWilmington zipCode = ZipCodeWilmington.getInstance();
        Student[] students = Students.getInstance().toArray();
        Double previousStudyTime = students[0].getTotalStudyTime();
        Double numOfHours = 1000.0;
        zipCode.hostLecture(new Instructor(), numOfHours);

        //When
        Double expected = numOfHours / Students.getInstance().count() + previousStudyTime;
        Map<Student, Double> studyMap = zipCode.getStudyMap();
        List<Student> studentKeys = new LinkedList<>(studyMap.keySet());


        //Then
        for(Student student : studentKeys) {
            assertEquals(expected, studyMap.get(student));
        }

    }

    @Test
    public void hostLectureByIdTest1() {

        //Given
        ZipCodeWilmington zipCode = ZipCodeWilmington.getInstance();
        Student[] students = Students.getInstance().toArray();
        Double previousStudyTime = students[0].getTotalStudyTime();
        Double numOfHours = 1000.0;
        Long lectureId = 123L;
        zipCode.hostLecture(lectureId, numOfHours);

        //When
        Double expected = numOfHours / Students.getInstance().count() + previousStudyTime;
        Map<Student, Double> studyMap = zipCode.getStudyMap();
        List<Student> studentKeys = new LinkedList<>(studyMap.keySet());


        //Then
        for(Student student : studentKeys) {
            assertEquals(expected, studyMap.get(student));
        }

    }

    @Test
    public void hostLectureByIdTest2() {

        //Given
        ZipCodeWilmington zipCode = ZipCodeWilmington.getInstance();
        Student[] students = Students.getInstance().toArray();
        Double previousStudyTime = students[0].getTotalStudyTime();
        Double numOfHours = 1000.0;
        Long lectureId = 345L;
        zipCode.hostLecture(lectureId, numOfHours);

        //When
        Double expected = numOfHours / Students.getInstance().count() + previousStudyTime;
        Map<Student, Double> studyMap = zipCode.getStudyMap();
        List<Student> studentKeys = new LinkedList<>(studyMap.keySet());


        //Then
        for(Student student : studentKeys) {
            assertEquals(expected, studyMap.get(student));
        }

    }


    @Test
    public void hostLectureByIdTest3() {

        //Given
        ZipCodeWilmington zipCode = ZipCodeWilmington.getInstance();
        Student[] students = Students.getInstance().toArray();
        Double previousStudyTime = students[0].getTotalStudyTime();
        Double numOfHours = 1000.0;
        Long lectureId = 0L;
        zipCode.hostLecture(lectureId, numOfHours);

        //When
        Double expected = previousStudyTime;
        Map<Student, Double> studyMap = zipCode.getStudyMap();
        List<Student> studentKeys = new LinkedList<>(studyMap.keySet());


        //Then
        for(Student student : studentKeys) {
            assertEquals(expected, studyMap.get(student));
        }

    }

    @Test
    public void hostLectureWithEducator1() {

        //Given
        ZipCodeWilmington zipCode = ZipCodeWilmington.getInstance();
        Student[] students = Students.getInstance().toArray();
        Double previousStudyTime = students[0].getTotalStudyTime();
        Double numOfHours = 1000.0;
        zipCode.hostLecture(Educator.DOLIO, numOfHours);

        //When
        Double expected = numOfHours / Students.getInstance().count() + previousStudyTime;
        Map<Student, Double> studyMap = zipCode.getStudyMap();
        List<Student> studentKeys = new LinkedList<>(studyMap.keySet());


        //Then
        for(Student student : studentKeys) {
            assertEquals(expected, studyMap.get(student));
        }

    }


    @Test
    public void hostLectureWithEducator2() {

        //Given
        ZipCodeWilmington zipCode = ZipCodeWilmington.getInstance();
        Student[] students = Students.getInstance().toArray();
        Double previousStudyTime = students[0].getTotalStudyTime();
        Double numOfHours = 1000.0;
        zipCode.hostLecture(Educator.KRIS, numOfHours);

        //When
        Double expected = numOfHours / Students.getInstance().count() + previousStudyTime;
        Map<Student, Double> studyMap = zipCode.getStudyMap();
        List<Student> studentKeys = new LinkedList<>(studyMap.keySet());


        //Then
        for(Student student : studentKeys) {
            assertEquals(expected, studyMap.get(student));
        }

    }


}
