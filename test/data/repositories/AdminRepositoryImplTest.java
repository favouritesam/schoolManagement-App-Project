package data.repositories;

import data.models.Admin;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AdminRepositoryImplTest {
   AdminRepositoryImpl adminRepository;
    Admin admin;
    @BeforeEach
    void setUp() {
         adminRepository = new AdminRepositoryImpl();
        admin = new Admin();
    }
    @Test
    public void testThatAdminCanBeSaved(){
        admin.setName("favour");
        admin.setPhoneNumber("+234 8134111135");
        adminRepository.save(admin);
        assertEquals(1,adminRepository.adminListSize());
    }
    @Test
    public void testToDeleteAnAdminById(){
        admin.setName("favour");
      Admin savedAdmin1 =  adminRepository.save(admin);

      Admin admin2 = new Admin();
       admin2.setName("favour");
       admin2.setPhoneNumber("+234 8134111135");
      Admin foundAdmin2 =    adminRepository.save(admin2);

      List<Admin> adminList = adminRepository.findAll();

      adminRepository.deleteAminById(foundAdmin2.getAdminId());

        assertEquals(1,adminList.size());
    }
    @Test
    public void testToDeleteAllAdmin(){
        admin.setName("Oluchi");
        admin.setPhoneNumber("+234 5757896985");
        adminRepository.save(admin);

        Admin admin1 = adminRepository.save(admin);
        admin1.setName("David");
        admin1.setPhoneNumber("12555667777");
        adminRepository.save(admin1);

        Admin admin2 = adminRepository.save(admin);
        admin2.setName("Goodness");
        admin2.setPhoneNumber("231425616");
        adminRepository.save(admin2);
        List<Admin> adminList = adminRepository.findAll();

        adminRepository.deleteAll();

      assertEquals(0,adminList.size());
    }
    @Test
    public void testThatAllAdminCanBeFound(){
        adminRepository.save(admin);
        Admin admin1 = new Admin();
        adminRepository.save(admin1);
        List<Admin> adminList = adminRepository.findAll();

        assertEquals(2,adminList.size());

    }
}

