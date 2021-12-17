package com.sample.demo1.repository;

import com.sample.demo1.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User , Integer>
{

}