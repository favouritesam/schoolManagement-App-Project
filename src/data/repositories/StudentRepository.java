package data.repositories;

import data.models.Student;

public interface StudentRepository {
     Student save(Student student);
     Student findStudentById(int studentId);
     boolean deleteStudentById(int studentId );
     Student updatedStudentId(Student student);
     int StudentListSize();

     Student updatedStudent(Student student);
     int createStudentId(Student student);

     int getCountOfAllStudents(Student student);
}
