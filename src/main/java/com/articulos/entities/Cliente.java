package com.articulos.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cliente_id", nullable = false, unique = true)
	private Long cliente_id; 
	
	@Column(name = "nombre", nullable = false, unique = false, length = 200)
	private String nombre;

	@Column(name = "saldo",  nullable = false, unique = false)
	private Integer saldo;
	
	
	@Column(name = "limite_credito",  nullable = false, unique = false)
	private Integer limite_credito;
	
	@Column(name = "descuento",  nullable = false, unique = false)
	private Integer descuento;
	
}











