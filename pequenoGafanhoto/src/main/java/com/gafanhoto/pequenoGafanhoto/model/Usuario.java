package com.gafanhoto.pequenoGafanhoto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name ="tb_usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = " O atributo nome não poderá permanecer vazio")
	@Size(min=2,  message= " A quantidade mínima será de 2 caracteres")
	private String nome;
	

	@NotNull(message = " O atributo nome não poderá permanecer vazio")
	@Email( message= " O atributo usuário deverá ser um email")
	private String email;
	
	@NotNull(message = " O atributo senha não poderá permanecer vazio")
	@Size(min=5, max=20,  message= " A quantidade mínima será de 5 e no máximo 20 caracteres")
	private String senha;
	
	private String foto;
	
	private String tipo; 

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
