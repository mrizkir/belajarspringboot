package id.ac.sttindonesia.belajarspringboot;

import id.ac.sttindonesia.belajarspringboot.UserEntity;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Integer>
{
  
}