package fr.helenou.springbootForumJpa.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.helenou.springbootForumJpa.beans.Registration;

@Repository
public interface RegistrationRepository extends CrudRepository<Registration, Long> {

}
