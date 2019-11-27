package fr.helenou.springbootForumJpa.beans;


import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="registration")
@Getter @Setter @NoArgsConstructor @ToString(callSuper = true)
public class Registration extends BaseEntity {
	private String name;
	private String number;
	private String description;
	private String type;
	private int user_id;
	
	public Registration(String name, String number, String description, String type, int user_id) {
		super();
		this.name = name;
		this.number = number;
		this.description = description;
		this.type = type;
		this.user_id = user_id;
	}
	
	
}
