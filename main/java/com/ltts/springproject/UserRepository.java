package com.ltts.springproject;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
public interface UserRepository extends JpaRepository<User, Long> {
	@Query("SELECT u FROM User u WHERE u.email = ?1")
	public User findByEmail(String email);
	/*
	 * @Query("SELECT u FROM User u WHERE CONCAT(u.id, ' ', u.email) LIKE %?1%")
	 * public Page<User> findAll(String keyword, Pageable pageable);
	 */
}
