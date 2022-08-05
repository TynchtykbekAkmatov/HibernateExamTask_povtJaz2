package org.example.service;

import org.example.dao.CourseDaoImpl;
import org.example.entity.Course;

import java.util.List;

public class CourseServiceImpl implements CourseService{
    CourseDaoImpl courseDao = new CourseDaoImpl();

    @Override
    public void saveCourse(Course course) {
        courseDao.saveCourse(course);
    }

    @Override
    public Course getCourseById(Long id) {
        return courseDao.getCourseById(id);
    }

    @Override
    public List<Course> getAllCourse() {
        return courseDao.getAllCourse();
    }

    @Override
    public Course update(Long id, Course course) {
        return courseDao.update(id, course);
    }

    @Override
    public void deleteCourseById(Long id) {
        courseDao.deleteCourseById(id);
    }

    @Override
    public List<Course> getCourseByCourseName(String name) {
        return courseDao.getCourseByCourseName(name);
    }

    @Override
    public void saveCourses(Course course) {
        courseDao.saveCourses(course);
    }
}
