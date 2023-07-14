package service;

import dto.request.RegisterRequest;
import dto.request.UpdateRequest;
import dto.response.RegistrationResponse;
import dto.response.UpdateResponse;

public interface TeacherServiceRepository {
    RegistrationResponse register(RegisterRequest registerRequest);
    UpdateResponse update(UpdateRequest updateRequest);
}
