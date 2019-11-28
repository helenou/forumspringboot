package fr.helenou.springbootForumJpa.repositories;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.helenou.springbootForumJpa.beans.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	// Find users by name attribute
	List<User> findByName(String name);
	// by username
	List<User> findByUsername(String username);
	Page<User> findByUsername(String username, Pageable pageable);
	
	List<User> findByNameLike(String name);
	List<User> findByNameContains(String name);
	
	
	List<User> findByMobile(String mobileNum, Pageable pageable);
	User findByMobile(String mobileNum);
	
	List<User> findByEmail(String email, Pageable pageable);
	User findByEmail(String email);

	
	Long countByEmail(String email); // case: if email is user, prevent from creating account using it
		
	
}
