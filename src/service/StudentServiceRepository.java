package service;


import dto.request.RegisterRequest;
import dto.request.UpdateRequest;
import dto.response.RegistrationResponse;
import dto.response.UpdateResponse;

public interface StudentServiceRepository  {

      RegistrationResponse Register(RegisterRequest registerRequest);
      UpdateResponse update(UpdateRequest updateRequest);
}
