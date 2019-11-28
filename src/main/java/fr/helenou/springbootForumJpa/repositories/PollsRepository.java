package fr.helenou.springbootForumJpa.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.helenou.springbootForumJpa.beans.Polls;

@Repository
public interface PollsRepository extends CrudRepository<Polls, Long> {

}
