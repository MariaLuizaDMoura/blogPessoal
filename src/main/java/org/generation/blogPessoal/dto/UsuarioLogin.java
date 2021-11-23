package org.generation.blogPessoal.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 
 * @author aldairsoares
 * @version 1.0
 *
 */

public class UsuarioLogin {
	
	
	private long id;
	
	
	@NotBlank
	@Size(min =3, max =100, message = "Write at least 8 characters")
	private String nome;
	
	@NotBlank(message = "Insert a valid username")
	private String usuario;
	
	private String foto;
	
	@NotBlank
	@Size(min =8, max =100, message = "Write at least 8 characters")
	private String senha;
	
	@NotNull
	private String token;
	
	
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

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
	
}
	