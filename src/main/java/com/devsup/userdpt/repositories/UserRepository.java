package com.devsup.userdpt.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.devsup.userdpt.entities.User;
public interface UserRepository extends JpaRepository<User, Long>{

}
