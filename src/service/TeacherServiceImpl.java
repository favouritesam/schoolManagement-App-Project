package service;
import data.models.Teacher;
import data.repositories.TeacherRepository;
import data.repositories.TeacherRepositoryImpl;
import dto.request.RegisterRequest;
import dto.request.UpdateRequest;
import dto.response.RegistrationResponse;
import dto.response.UpdateResponse;

public class TeacherServiceImpl implements TeacherServiceRepository{
    TeacherRepository teacherRepository = new TeacherRepositoryImpl();

    @Override
    public RegistrationResponse register(RegisterRequest registerRequest) {
        Teacher teacher = new Teacher();
        teacher.setName(registerRequest.getName());
        teacher.setClassRoom(registerRequest.getClassRoom());
        var savedTeacher = teacherRepository.save(teacher);
        RegistrationResponse registrationResponse = new RegistrationResponse();
        registrationResponse.setStudentId(savedTeacher.getTeacherId());
        registrationResponse.setClassRoom(savedTeacher.getClassRoom());

        return registrationResponse;
    }

    @Override
    public UpdateResponse update(UpdateRequest updateRequest) {
        Teacher teacher = new Teacher();
        teacher.setName(updateRequest.getName());
        teacher.setClassRoom(updateRequest.getClassRoom());
        var savedTeacher = teacherRepository.save(teacher);
        UpdateResponse updateResponse = new UpdateResponse();
        updateResponse.setName(savedTeacher.getName());
        updateResponse.setClassRoom(savedTeacher.getClassRoom());
        return updateResponse;
    }
}