package org.example.service;

import org.example.dao.TaskDaoImpl;
import org.example.entity.Task;

import java.util.List;

public class TaskServiceImpl implements TaskService{

    TaskDaoImpl taskDao = new TaskDaoImpl();

    @Override
    public void saveTask(Long id, Task task) {
        taskDao.saveTask(id, task);
    }

    @Override
    public Task update(Long id, Task task) {
        return taskDao.update(id, task);
    }

    @Override
    public List<Task> getAllTaskByLessonId(Long id) {
        return taskDao.getAllTaskByLessonId(id);
    }

    @Override
    public void deleteTaskById(Long id) {
        taskDao.deleteTaskById(id);
    }
}
