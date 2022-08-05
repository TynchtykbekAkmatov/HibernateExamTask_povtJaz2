package org.example.dao;

import org.example.config.Config;
import org.example.entity.Course;
import org.example.entity.Lesson;

import javax.persistence.EntityManager;
import java.util.List;

public class LessonDaoImpl implements LessonDao{

    private final EntityManager entityManager = Config.getEntityManager();

    @Override
    public void saveLesson(Long id, Lesson lesson) {
            entityManager.getTransaction().begin();

        Course course = entityManager.find(Course.class, id);
        lesson.setCourse(course);
        entityManager.persist(lesson);

        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public Lesson update(Long id, Lesson lesson) {
        entityManager.getTransaction().begin();

        Lesson lesson1 = entityManager.find(Lesson.class, id);
        lesson1.setName(lesson.getName());
        lesson1.setVideoLink(lesson.getVideoLink());

        entityManager.getTransaction().commit();
        entityManager.close();
        return lesson1;
    }

    @Override
    public void getLessonById(Long id) {
        entityManager.getTransaction().begin();

        Lesson lesson = entityManager.find(Lesson.class, id);

        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println(lesson);
    }

    @Override
    public void getLessonByCourseId(Long id) {
        entityManager.getTransaction().begin();

        Course course = entityManager.find(Course.class, id);
        List<Lesson> lessonList = course.getLessons();
        System.out.println(lessonList);

        entityManager.getTransaction().commit();
        entityManager.close();

    }
}
