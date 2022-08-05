package org.example.dao;

import org.example.config.Config;
import org.example.entity.Course;
import org.hibernate.Session;

import javax.persistence.EntityManager;
import java.util.List;

public class CourseDaoImpl implements CourseDao{

    private final EntityManager entityManager = Config.getEntityManager();

    @Override
    public void saveCourse(Course course) {
//        Session session = Config.getSessionFactory().openSession();
//        session.beginTransaction();
//
//        session.save(course);
//
//        session.getTransaction().commit();
//        session.close();
        entityManager.getTransaction().begin();

        entityManager.persist(course);

        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public Course getCourseById(Long id) {
        entityManager.getTransaction().begin();

        Course course = entityManager.find(Course.class, id);

        entityManager.getTransaction().commit();
        entityManager.close();
        return course;
    }

    @Override
    public List<Course> getAllCourse() {
        entityManager.getTransaction().begin();

        List<Course> courseList = entityManager.createQuery("select c from Course c order by c.createAt", Course.class).getResultList();

        entityManager.getTransaction().commit();
        entityManager.close();
        return courseList;
    }

    @Override
    public Course update(Long id, Course course) {

        entityManager.getTransaction().begin();

        Course course1 = entityManager.find(Course.class, id);
        course1.setCourseName(course.getCourseName());
        course1.setDuration(course.getDuration());
        course1.setCreateAt(course.getCreateAt());
        course1.setImageLink(course.getImageLink());
        course1.setDescription(course.getDescription());

        entityManager.getTransaction().commit();
        entityManager.close();
        return course1;
    }

    @Override
    public void deleteCourseById(Long id) {
        entityManager.getTransaction().begin();

        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);

        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public List<Course> getCourseByCourseName(String name) {
        entityManager.getTransaction().begin();

        List<Course> course = entityManager.createQuery("select c from Course c where c.courseName = :courseName", Course.class).setParameter("courseName", name).getResultList();

        entityManager.getTransaction().commit();
        entityManager.close();
        return course;
    }

    @Override
    public void saveCourses(Course course) {

        Session session = Config.getSessionFactory().openSession();
        session.beginTransaction();

        session.save(course);

        session.getTransaction().commit();
        session.close();

    }
}
