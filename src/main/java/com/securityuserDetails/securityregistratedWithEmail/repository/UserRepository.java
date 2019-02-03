package com.securityuserDetails.securityregistratedWithEmail.repository;

import com.securityuserDetails.securityregistratedWithEmail.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
	
	User findByEmail(String email);
}
