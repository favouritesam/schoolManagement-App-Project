package service;

import data.models.Student;
import data.repositories.StudentRepository;
import data.repositories.StudentRepositoryImpl;
import dto.request.RegisterRequest;
import dto.request.UpdateRequest;
import dto.response.RegistrationResponse;
import dto.response.UpdateResponse;

public class StudentServiceImpl implements StudentServiceRepository{
    StudentRepository studentRepository = new StudentRepositoryImpl();
    @Override
    public RegistrationResponse Register(RegisterRequest registerRequest) {
        Student student = new Student();
        student.setName(registerRequest.getName());
        student.setAge(registerRequest.getAge());
        student.setGender(registerRequest.getGender());
        student.setParentPhoneNumber(registerRequest.getParentPhoneNumber());
        student.setClassRoom(registerRequest.getClassRoom());
        var savedStudent = studentRepository.save(student);
        RegistrationResponse registrationResponse = new RegistrationResponse();
        registrationResponse.setStudentId(savedStudent.getStudentId());
        registrationResponse.setClassRoom(savedStudent.getClassRoom());
        return registrationResponse;
    }

    @Override
    public UpdateResponse update(UpdateRequest updateRequest) {
        Student student = new Student();
        student.setName(updateRequest.getName());
        student.setAge(updateRequest.getAge());
        student.setClassRoom(updateRequest.getClassRoom());
        student.setParentPhoneNumber(updateRequest.getParentPhoneNumber());
        var updatedStudent = studentRepository.updatedStudent(student);
        UpdateResponse updateResponse = new UpdateResponse();
        updateResponse.setAge(updatedStudent.getAge());
        updateResponse.setName(updatedStudent.getName());
        updateResponse.setClassRoom(updatedStudent.getClassRoom());
        updateResponse.setParentPhoneNumber(updatedStudent.getParentPhoneNumber());
        return updateResponse;
    }
}
