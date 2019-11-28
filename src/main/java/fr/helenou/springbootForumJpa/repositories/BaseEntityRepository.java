package fr.helenou.springbootForumJpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.helenou.springbootForumJpa.beans.BaseEntity;


// SHOuLD be a REPO ?? how to retrieve ids in other classes
@Repository 
public interface BaseEntityRepository extends JpaRepository<BaseEntity, Long> {

	
}
