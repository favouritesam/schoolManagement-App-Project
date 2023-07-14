package data.repositories;

import data.models.Student;
import data.models.Teacher;

import java.util.ArrayList;

public class TeacherRepositoryImpl implements TeacherRepository {
    ArrayList<Teacher> teacherArrayList = new ArrayList<>();
    private  static int teacherId = 0;

    @Override
    public Teacher save(Teacher teacher) {
        teacher.setTeacherId(createTeacherId(save(teacher)));
        teacherArrayList.add(teacher);
        return teacher;
    }

    @Override
    public Teacher findStudentById(int teacherId) {
        return teacherArrayList.get(teacherId);
    }

    @Override
    public boolean deleteTeacherById(int teacherId) {
        teacherArrayList.remove(teacherId);
        return true;
    }

    @Override
    public Teacher updatedTeacherId(Teacher teacher) {
        teacherArrayList.remove(teacher.getTeacherId());
        teacherArrayList.add(teacher);
        return teacherArrayList.get(teacher.getTeacherId());
    }

    @Override
    public int TeacherListSize() {
        return teacherArrayList.size();
    }
    @Override
    public int createTeacherId(Teacher teacher) {
        return teacherId+=1;
    }
}
