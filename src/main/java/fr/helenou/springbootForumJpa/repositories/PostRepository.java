package fr.helenou.springbootForumJpa.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.helenou.springbootForumJpa.beans.Post;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

}
