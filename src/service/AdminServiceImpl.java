package service;

import data.models.Admin;
import data.models.ClassRoom;
import data.repositories.AdminRepository;
import data.repositories.AdminRepositoryImpl;
import dto.request.RegisterRequest;
import dto.request.UpdateRequest;
import dto.response.RegistrationResponse;
import dto.response.UpdateResponse;
import jdk.internal.foreign.abi.Binding;

public class AdminServiceImpl implements AdminServiceRepository {

    AdminRepository adminRepository = new AdminRepositoryImpl();
    private UpdateResponse updatedAdmin;
    private Binding.Allocate adminList;
    private RegistrationResponse registrationResponse;

    @Override
    public RegistrationResponse register(RegisterRequest registerRequest) {
        Admin admin = new Admin();
        admin.setPhoneNumber(registerRequest.getPhoneNumber());
//        if (adminList.size() == 13) return registrationResponse;
        admin.setName(registerRequest.getName());
        var savedAdmin = adminRepository.save(admin);
        RegistrationResponse registrationResponse = new RegistrationResponse();
        registrationResponse.setAdminId(savedAdmin.getAdminId());
        registrationResponse.setName(savedAdmin.getName());
        return registrationResponse;
    }

    @Override
    public UpdateResponse update(UpdateRequest updateRequest) {
        Admin admin = new Admin();
        admin.setName(updateRequest.getName());
        admin.setPhoneNumber(updateRequest.getPhoneNumber());
        var saveAdmin = adminRepository.save(admin);
        UpdateResponse updateResponse = new UpdateResponse();
        updateResponse.setAdminPhoneNumber(saveAdmin.getPhoneNumber());
        updateResponse.setName(saveAdmin.getName());
        return updateResponse;
    }
}