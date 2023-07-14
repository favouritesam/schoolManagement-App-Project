package test.RepositoriesTest;

import data.models.Student;
import data.repositories.StudentRepository;
import data.repositories.StudentRepositoryImpl;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StudentRepositoryTest {

    StudentRepository studentRepo;
    Student student;


    @BeforeEach
    void setUp() {
        studentRepo = new StudentRepositoryImpl();
    }

    @Test
    @DisplayName("Save New Student Test")
    public void saveNewStudent_CountIsIncrementedTest(){
//        Given that I have a student
        student = new Student();
//        If I save the student
        Student savedStudent = studentRepo.save(student);
//        The count of students increases
        assertEquals(1, studentRepo.getCountOfAllStudents(savedStudent));
//        The student returned is not empty, meaning it actually returned a student with a non-empty id
        assertNotNull(savedStudent);
//        The student that I saved is the student that is returned
        assertEquals(student, savedStudent);
    }

    @Test
    public void saveNewStudentMultipleTimes_CountDoesNotIncrementTest(){
        student = new Student();
        student.setName("Mami Arike Porsche");
        studentRepo.save(student);
        assertEquals(2, studentRepo.getCountOfAllStudents(studentRepo.save(student)));

        student.setName("Iyawo Pablo");
        studentRepo.save(student);
        assertEquals(3 , studentRepo.getCountOfAllStudents(student));
    }
    @Test
    public void checkSavedNewStudentIsEmpty(){
         student = new Student();
         Student checkSavedNewStudent = studentRepo.save(student);
         assertEquals(1,studentRepo.getCountOfAllStudents(student));

    }
    @Test
    public void checkThatStudentIdCanBeFound(){
        StudentRepository studentRepo = new StudentRepositoryImpl();
        student.setAge(12);
        student.setStudentId(1);
        studentRepo.save(student);

        assertEquals(1,studentRepo.getCountOfAllStudents(student));

    }
}