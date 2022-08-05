package org.example.service;

import org.example.entity.Lesson;

public interface LessonService {

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
