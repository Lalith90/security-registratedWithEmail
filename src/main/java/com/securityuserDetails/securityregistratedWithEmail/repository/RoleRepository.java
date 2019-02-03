package com.securityuserDetails.securityregistratedWithEmail.repository;

import com.securityuserDetails.securityregistratedWithEmail.domain.security.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByname(String name);
}
