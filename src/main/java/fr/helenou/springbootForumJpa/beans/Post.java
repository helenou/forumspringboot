package fr.helenou.springbootForumJpa.beans;


import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="posts")
@Getter @Setter @NoArgsConstructor @ToString(callSuper = true)
public class Post extends BaseEntity {
	
	private int userId;
	private String title;
	private String type;
	private String description;
	
	
}
