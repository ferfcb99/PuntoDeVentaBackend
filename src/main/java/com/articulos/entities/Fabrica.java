package com.articulos.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "fabrica")
public class Fabrica {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "fabrica_id", nullable = false, unique = true)
	private Long fabrica_id; 
	
	
	@Column(name = "telefono", nullable = false, unique = true)
	private String telefono;
	
	
	@Column(name = "total_articulo", nullable = false, unique = true, precision = 4, scale = 0) // 9999.0
	private Double total_articulo; 
}
