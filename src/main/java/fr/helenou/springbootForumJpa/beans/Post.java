package fr.helenou.springbootForumJpa.beans;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="posts")
@Getter @Setter @NoArgsConstructor @ToString(callSuper = true)
public class Post extends BaseEntity {
	
	@ManyToOne(fetch= FetchType.LAZY)
	private int userId; // the Post owner/starter
	
	private String title;
	private String type;
	private String description;
	
	@OneToMany(mappedBy="replies_user_id") // linked to a Post
	private List<Replies> replies;
	
}
