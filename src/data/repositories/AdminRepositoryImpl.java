package data.repositories;

import data.models.Admin;

import java.util.ArrayList;
import java.util.List;

public class AdminRepositoryImpl implements AdminRepository {
    private static int adminId = 0;
    ArrayList<Admin> adminList = new ArrayList<>();

    @Override
    public Admin save(Admin admin) {
        admin.setAdminId(createAdminId());
        adminList.add(admin);
        return admin;
    }

    @Override
    public Admin findAdminIdBy(int adminId) {
        for (Admin admin: adminList) {
            if (admin.getAdminId() == adminId) {
                return admin;
            }

        }
        return null;
    }




    @Override
    public void deleteAminById(int adminId) {
      Admin findAdmin = findAdminIdBy(adminId);
      delete(findAdmin);
    }

    @Override
    public Admin updatedAdminId(Admin admin) {
        adminList.remove(admin.getAdminId());
        adminList.add(admin);
        return adminList.get(admin.getAdminId());
    }
    private int createAdminId() {
       return adminId +=1;
    }
    @Override
    public int adminListSize() {
        return adminList.size();
    }

    @Override
    public void deleteAll() {
        adminList.clear();

    }

    public  void delete(Admin admin){
        adminList.remove(admin);
    }

    @Override
    public List<Admin> findAll() {
        return adminList;
    }
}
