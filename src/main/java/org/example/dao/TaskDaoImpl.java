package org.example.dao;

import org.example.config.Config;
import org.example.entity.Course;
import org.example.entity.Lesson;
import org.example.entity.Task;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class TaskDaoImpl implements TaskDao{

    private final EntityManager entityManager = Config.getEntityManager();

    @Override
    public void saveTask(Long id, Task task) {
        entityManager.getTransaction().begin();

        Lesson lesson = entityManager.find(Lesson.class, id);
        List<Task> taskList = new ArrayList<>();
        taskList.add(task);
        lesson.setTasks(taskList);
        task.setLesson(lesson);
        entityManager.persist(task);


        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public Task update(Long id, Task task) {
        entityManager.getTransaction().begin();

        Task task1 = entityManager.find(Task.class, id);
        task1.setName(task.getName());
        task1.setDeadLine(task.getDeadLine());
        task1.setTask(task.getTask());

        entityManager.getTransaction().commit();
        entityManager.close();

        return task1;
    }

    @Override
    public List<Task> getAllTaskByLessonId(Long id) {
        entityManager.getTransaction().begin();

        Lesson lesson = entityManager.find(Lesson.class, id);
        List<Task> taskList = lesson.getTasks();


        entityManager.getTransaction().commit();
        entityManager.close();
        return taskList;
    }

    @Override
    public void deleteTaskById(Long id) {
        entityManager.getTransaction().begin();

        Task task = entityManager.find(Task.class, id);
        entityManager.remove(task);

        entityManager.getTransaction().commit();
        entityManager.close();

    }
}
