package id.ac.sttindonesia.belajarspringboot;

import id.ac.sttindonesia.belajarspringboot.UserEntity;
import id.ac.sttindonesia.belajarspringboot.UserRepository;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserService 
{
  @Autowired private UserRepository repo;

  public List<UserEntity> listAll()
  {
    return (List<UserEntity>) repo.findAll();
  }
  public void save(UserEntity user)
  {
    repo.save(user);
  }
}