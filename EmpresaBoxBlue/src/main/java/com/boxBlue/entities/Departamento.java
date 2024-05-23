package com.boxBlue.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "departamento")

public class Departamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "cidade",nullable = false, length = 100)
	private String cidade;

	@Column(name = "email",nullable = false, length = 100)
	private String email;

	@Column(name = "nome",nullable = false, length = 100)
	private String nome;

	@Column(name = "qtdePessoas",nullable = false, length = 100)
	private int qtdePessoas;

	@Column(name = "telefone",nullable = false, length = 100)
	private String telefone;

}
