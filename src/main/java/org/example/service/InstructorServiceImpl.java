package org.example.service;

import org.example.dao.InstructorDaoImpl;
import org.example.entity.Instructor;

public class InstructorServiceImpl implements InstructorService{

    InstructorDaoImpl instructorDao = new InstructorDaoImpl();

    @Override
    public void saveInstructor(Instructor instructor) {

        instructorDao.saveInstructor(instructor);
    }

    @Override
    public Instructor update(Long id, Instructor instructor) {
        return instructorDao.update(id, instructor);
    }

    @Override
    public void getInstructorById(Long id) {

        instructorDao.getInstructorById(id);
    }

    @Override
    public void getInstructorByCourseId(Long id) {
        instructorDao.getInstructorByCourseId(id);
    }

    @Override
    public void deleteInstructorById(Long id) {

        instructorDao.deleteInstructorById(id);
    }

    @Override
    public void assignInstructorToCourse(Long c_id, Long i_id) {

        instructorDao.assignInstructorToCourse(c_id, i_id);
    }
}
