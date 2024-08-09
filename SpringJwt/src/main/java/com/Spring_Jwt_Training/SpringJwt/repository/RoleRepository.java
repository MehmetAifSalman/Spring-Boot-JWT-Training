package com.Spring_Jwt_Training.SpringJwt.repository;

import com.Spring_Jwt_Training.SpringJwt.entity.Role;
import com.Spring_Jwt_Training.SpringJwt.enums.RoleEnum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role , Integer> {
    Optional<Role> findByName(RoleEnum roleName);
}