package fr.helenou.springbootForumJpa.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.helenou.springbootForumJpa.beans.Forum;

@Repository
public interface ForumRepository extends CrudRepository<Forum, Long> {

}
