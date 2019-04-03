package com.example.pdamapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.pdamapi.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	@Query(value = "SELECT * FROM tbl_user", nativeQuery = true)
	public List<User> getAllUser();
	
	@Query(value = "SELECT * FROM tbl_user u WHERE u.USERNAME =:username and u.PASSWORD =:password", nativeQuery = true)
	public User authLogin(@Param("username") String username, @Param("password") String password);
}
