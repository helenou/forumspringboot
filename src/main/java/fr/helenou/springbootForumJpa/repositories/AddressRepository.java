package fr.helenou.springbootForumJpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.helenou.springbootForumJpa.beans.Address;
import fr.helenou.springbootForumJpa.beans.User;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

	

	// Find users by country
	List<User> findByCodePostal(int codePostal);
	
	
	
	//Long countByPhone(int phone); 
}
