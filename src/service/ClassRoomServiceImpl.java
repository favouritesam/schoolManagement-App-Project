package service;
import data.models.ClassRoom;
import data.repositories.ClassRoomRepository;
import data.repositories.ClassRoomRepositoryImpl;
import dto.request.RegisterRequest;
import dto.request.UpdateRequest;
import dto.response.RegistrationResponse;
import dto.response.UpdateResponse;

public class ClassRoomServiceImpl implements ClassRoomServiceRepository{
    ClassRoomRepository classRoomRepository = new ClassRoomRepositoryImpl();

    @Override
    public RegistrationResponse register(RegisterRequest registerRequest) {
        ClassRoom classRoom = new ClassRoom();
        classRoom.setName(registerRequest.getName());
        classRoom.setTeacherId(registerRequest.getTeacherId());
        var savedClassRoom = classRoomRepository.save(classRoom);
        RegistrationResponse registrationResponse =new  RegistrationResponse();
        registrationResponse.setClassRoomId(savedClassRoom.getClassId());
        registrationResponse.setTeacherId(savedClassRoom.getTeacherId());
        registrationResponse.setName(savedClassRoom.getName());
        return registrationResponse;
    }

    @Override
    public UpdateResponse updateTeacherId(UpdateRequest updateRequest) {
        ClassRoom classRoom = new ClassRoom();
        classRoom.setTeacherId(updateRequest.getTeacherId());
        var updatedClassRoom = classRoomRepository.updatedClassRoom(classRoom);
        UpdateResponse updateResponse = new UpdateResponse();
        updateResponse.setTeacherId(updateResponse.getTeacherId());
        return updateResponse;
    }
}
