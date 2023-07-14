package data.repositories;

import data.models.Admin;

import java.util.List;


public interface AdminRepository {
    Admin save(Admin admin);
    Admin findAdminIdBy(int adminId);
    void deleteAminById(int adminId );
    Admin updatedAdminId(Admin admin);
    List<Admin>findAll();
    int adminListSize();
    void deleteAll();


}
