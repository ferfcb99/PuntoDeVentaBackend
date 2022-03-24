package com.articulos.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "direccion")
public class Direccion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "direccion_id", nullable = false, unique = true)
	private Long direccion_id; 
	
	@Column(name = "numero",  nullable = false, unique = true)
	private Integer numero;
	
	@Column(name = "calle", nullable = false, unique = false, length = 100)
	private String calle;
	
	@Column(name = "comuna", nullable = false, unique = false, length = 100)
	private String comuna;

	@Column(name = "ciudad", nullable = false, unique = false, length = 100)
	private String ciudad;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST})
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
}
