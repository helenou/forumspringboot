package fr.helenou.springbootForumJpa.beans;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;  

@Embeddable
@Table(name="adresse")
@Getter @Setter @NoArgsConstructor @ToString(callSuper = true)
public class Address extends BaseEntity {

	@Column(length= 150)
	private String adressePostale;
	
	@Column(length=5)
	@Pattern(regexp= "^[0-9]{5}$", message="saisir un code postal à 5 chiffres")
	private int codePostal;
	
	@Column(length= 20)
	private String ville;
	

	public Address(String adressePostale, int codePostal, String ville) {
		super();
		this.adressePostale = adressePostale;
		this.codePostal = codePostal;
		this.ville = ville;
	}

}
