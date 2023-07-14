package serviceTest;

import data.models.Student;
import data.repositories.StudentRepository;
import data.repositories.StudentRepositoryImpl;
import dto.request.RegisterRequest;
import dto.request.UpdateRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.StudentServiceImpl;
import service.StudentServiceRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentServiceTest {
    StudentServiceRepository studentServiceRepository ;
    @BeforeEach
    public void setUp(){
        studentServiceRepository = new StudentServiceImpl();
    }
    @Test
    public void testThatStudentRegisterationWasSuccessful(){
        RegisterRequest registerRequest = new RegisterRequest();
        registerRequest.setName("Favour");
        registerRequest.setAge(10);
        registerRequest.setGender("Female");
        registerRequest.setClassRoom("primary one");
        registerRequest.setParentPhoneNumber("084567834567");
       var registeredStudent = studentServiceRepository.Register(registerRequest);
        assertEquals(12,studentServiceRepository.Register(registerRequest).getStudentId());
    }
    @Test
    public void testThatStudentCanBeUpdate(){
        RegisterRequest registerRequest = new RegisterRequest();
        registerRequest.setName("Favour");
        registerRequest.setAge(10);
        registerRequest.setGender("Female");
        registerRequest.setClassRoom("primary one");
        registerRequest.setParentPhoneNumber("084567834567");
       var registeredStudent = studentServiceRepository.Register(registerRequest);
//        System.out.println(registeredStudent);
        UpdateRequest updateRequest = new UpdateRequest();
        updateRequest.setAge(12);
        updateRequest.setStudentId(11);
        updateRequest.setClassRoom("primary two");
//        updateRequest.setName(registeredStudent.getName());
//        System.out.println(studentServiceRepository.update(updateRequest));
        studentServiceRepository.update(updateRequest);
        assertEquals(12, updateRequest.getAge());
    }
    @Test
    public void testThatFindByStudentId(){
        StudentRepository studentRepository = new StudentRepositoryImpl();
        Student student = new Student();
        student.setStudentId(1);
        student.setClassRoom("primaryOne");
        studentRepository.save(student);

        assertEquals(1,studentRepository.getCountOfAllStudents(student));




    }
}
