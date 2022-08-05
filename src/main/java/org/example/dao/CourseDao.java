package org.example.dao;

import org.example.entity.Course;

import java.util.List;

public interface CourseDao {
//-----------------------------------------------------
    void saveCourse(Course course);

//-----------------------------------------------------
    Course getCourseById(Long id);

//-----------------------------------------------------
    List<Course> getAllCourse();

//-----------------------------------------------------
    Course update(Long id, Course course);

//-----------------------------------------------------
    void deleteCourseById(Long id);

//-----------------------------------------------------
    List<Course> getCourseByCourseName(String name);

//-----------------------------------------------------
    void saveCourses(Course course);

//-----------------------------------------------------
}
