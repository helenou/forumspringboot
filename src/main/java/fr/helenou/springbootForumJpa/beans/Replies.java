package fr.helenou.springbootForumJpa.beans;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="replies")
@Getter @Setter @NoArgsConstructor @ToString(callSuper = true)
public class Replies extends BaseEntity {

	@ManyToOne
	private User replies_user;
	private String title;
	private String type;
	private String description;
	

	
	public Replies(User replies_user, String title, String type, String description) {
		super();
		this.replies_user = replies_user;
		this.title = title;
		this.type = type;
		this.description = description;
	}

	
}
