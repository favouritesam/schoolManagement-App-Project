package data.repositories;

import data.models.Admin;
import data.models.Student;
import data.models.Teacher;

public interface TeacherRepository {
    Teacher save(Teacher teacher);
    Teacher findStudentById(int teacherId);
    boolean deleteTeacherById(int teacherId );
    Teacher updatedTeacherId(Teacher teacher);
    int TeacherListSize();


   int createTeacherId(Teacher teacher);
    }
