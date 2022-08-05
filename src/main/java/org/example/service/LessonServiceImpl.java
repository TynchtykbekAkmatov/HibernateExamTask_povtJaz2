package org.example.service;

import org.example.dao.LessonDaoImpl;
import org.example.entity.Lesson;

public class LessonServiceImpl implements LessonService{

    LessonDaoImpl lessonDao = new LessonDaoImpl();

    @Override
    public void saveLesson(Long id, Lesson lesson) {
        lessonDao.saveLesson(id, lesson);
    }

    @Override
    public Lesson update(Long id, Lesson lesson) {
        return lessonDao.update(id, lesson);
    }

    @Override
    public void getLessonById(Long id) {
        lessonDao.getLessonById(id);
    }

    @Override
    public void getLessonByCourseId(Long id) {
        lessonDao.getLessonByCourseId(id);
    }
}
