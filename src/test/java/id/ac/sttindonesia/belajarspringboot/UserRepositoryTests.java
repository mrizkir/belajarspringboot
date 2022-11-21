package id.ac.sttindonesia.belajarspringboot;

import id.ac.sttindonesia.belajarspringboot.UserEntity;
import id.ac.sttindonesia.belajarspringboot.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.annotation.Rollback;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTests
{
  /**
    * Autowired digunakan untuk mempermudah mengakses
    * fungsi-fungsi yang ada di dalam class tanpa
    * melakukan instantiasi
   */
  @Autowired private UserRepository repo;
  
  @Test
  public void testAddNew()
  {
    UserEntity user = new UserEntity();

    user.setUserName("admin");
    user.setPassword("12345678");
    user.setEmail("rizki@sttindonesia.ac.id");
    user.setFirstName("Mochammad");
    user.setLastName("Rizki Romdoni");
    user.setRole("superadmin");

    UserEntity savedUser = repo.save(user);
    //mulai test
    Assertions.assertNotNull(savedUser);
    Assertions.assertTrue(savedUser.getId() > 0, "userid mesti lebih besar dari 0");
  }
  
}