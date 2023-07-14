package data.repositories;

import data.models.Admin;
import data.models.ClassRoom;
import data.models.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {
    ArrayList<Student> listOfStudents = new ArrayList<>();
    private int studentId;


    @Override
    public Student save(Student student) {
        student.setStudentId(createStudentId(student));
        listOfStudents.add(student);
        return student;
    }

    @Override
    public Student findStudentById(int studentId) {
        return listOfStudents.get(studentId);
    }

    @Override
    public boolean deleteStudentById(int studentId) {
        listOfStudents.remove(studentId);
        return false;
    }

    @Override
    public Student updatedStudentId(Student student) {
        listOfStudents.remove(student.getStudentId());
        listOfStudents.add(student);
        return listOfStudents.get(student.getStudentId());
    }

    @Override
    public int StudentListSize() {
        return listOfStudents.size();
    }

    @Override
    public Student updatedStudent(Student student) {
        return null;
    }

    @Override
    public int createStudentId(Student student) {
        return studentId +=1;
    }

    @Override
    public int getCountOfAllStudents(Student student) {
        return listOfStudents.size();
    }

}