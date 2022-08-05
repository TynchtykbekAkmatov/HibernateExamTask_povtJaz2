package org.example.dao;

import org.example.entity.Lesson;

public interface LessonDao {
//-----------------------------------------------
    void saveLesson(Long id, Lesson lesson);

//-----------------------------------------------
    Lesson update(Long id, Lesson lesson);

//-----------------------------------------------
    void getLessonById(Long id);

//-----------------------------------------------
    void getLessonByCourseId(Long id);

//-----------------------------------------------
}
