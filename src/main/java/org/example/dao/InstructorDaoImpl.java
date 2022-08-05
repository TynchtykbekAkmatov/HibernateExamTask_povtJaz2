package org.example.dao;

import org.example.config.Config;
import org.example.entity.Course;
import org.example.entity.Instructor;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class InstructorDaoImpl implements InstructorDao{

    private final EntityManager entityManager = Config.getEntityManager();

    @Override
    public void saveInstructor(Instructor instructor) {
        entityManager.getTransaction().begin();

        entityManager.persist(instructor);

        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public Instructor update(Long id, Instructor instructor) {
        entityManager.getTransaction().begin();

        Instructor instructor1 = entityManager.find(Instructor.class, id);
        instructor1.setFirstName(instructor.getFirstName());
        instructor1.setLastName(instructor.getLastName());
        instructor1.setEmail(instructor.getEmail());
        instructor1.setPhoneNumber(instructor.getPhoneNumber());

        entityManager.getTransaction().commit();
        entityManager.close();
        return instructor1;
    }

    @Override
    public void getInstructorById(Long id) {
        entityManager.getTransaction().begin();

        Instructor instructor = entityManager.find(Instructor.class, id);
        System.out.println(instructor);

        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public void getInstructorByCourseId(Long id) {

        entityManager.getTransaction().begin();

        Course course = entityManager.find(Course.class, id);
        List<Instructor> instructorList = course.getInstructors();
        System.out.println(instructorList);

        entityManager.getTransaction().commit();
        entityManager.close();

    }

    @Override
    public void deleteInstructorById(Long id) {
        entityManager.getTransaction().begin();

        Instructor instructor = entityManager.find(Instructor.class, id);

        List<Course> course1 = instructor.getCourses();
        for (Course cor: course1) {
            cor.setInstructors(null);
        }

        entityManager.remove(instructor);

        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public void assignInstructorToCourse(Long c_id, Long i_id) {
        entityManager.getTransaction().begin();

        Course course = entityManager.find(Course.class, c_id);
        Instructor instructor = entityManager.find(Instructor.class, i_id);
//-------------------------------------------------------------------
        List<Instructor> instructorList = new ArrayList<>();
        instructorList.add(instructor);
        course.setInstructors(instructorList);

        List<Course> courseList = new ArrayList<>();
        courseList.add(course);
        instructor.setCourses(courseList);
//-------------------------------------------------------------------


        entityManager.merge(course);
        entityManager.merge(instructor);

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
