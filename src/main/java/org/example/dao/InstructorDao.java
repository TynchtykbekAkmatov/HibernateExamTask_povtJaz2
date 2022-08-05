package org.example.dao;

import org.example.entity.Instructor;

public interface InstructorDao {
//------------------------------------------------------
    void saveInstructor(Instructor instructor);

//------------------------------------------------------
    Instructor update(Long id, Instructor instructor);

//------------------------------------------------------
    void  getInstructorById(Long id);

//------------------------------------------------------
    void getInstructorByCourseId(Long id);

//------------------------------------------------------
    void deleteInstructorById(Long id);

//------------------------------------------------------
    void assignInstructorToCourse(Long c_id, Long i_id);

//------------------------------------------------------
}
