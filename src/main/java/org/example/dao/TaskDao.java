package org.example.dao;

import org.example.entity.Task;

import java.util.List;

public interface TaskDao {

//---------------------------------------------
    void saveTask(Long id, Task task);

//---------------------------------------------
    Task update(Long id, Task task);

//---------------------------------------------
    List<Task> getAllTaskByLessonId(Long id);

//---------------------------------------------
    void deleteTaskById(Long id);

//---------------------------------------------
}
