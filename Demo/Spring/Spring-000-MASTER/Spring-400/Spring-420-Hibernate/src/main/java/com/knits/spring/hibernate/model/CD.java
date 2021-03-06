package com.knits.spring.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import lombok.Data;

@Data
@Entity //this means that hibernate knows its linked to database
//@NamedQueries({
//	@NamedQuery(
//		name = "CD_ByTitle",
//		query = "from CD where title = :title"
//	)
//})
public class CD {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
		
	private Long version;
	private String artist;
	private String company;
	private String country;
	private double price;
	private String title;
	private int year;
	private int quantity;
	
	
}
