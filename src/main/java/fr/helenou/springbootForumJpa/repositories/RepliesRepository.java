package fr.helenou.springbootForumJpa.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.helenou.springbootForumJpa.beans.Replies;

@Repository
public interface RepliesRepository extends CrudRepository<Replies, Long> {

}
