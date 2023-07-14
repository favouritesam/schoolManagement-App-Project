package service;

import dto.request.RegisterRequest;
import dto.request.UpdateRequest;
import dto.response.RegistrationResponse;
import dto.response.UpdateResponse;

public interface ClassRoomServiceRepository {
    RegistrationResponse register(RegisterRequest registerRequest);
    UpdateResponse updateTeacherId(UpdateRequest updateRequest);
}
