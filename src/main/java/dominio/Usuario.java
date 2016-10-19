package dominio;

import java.util.ArrayList;
import java.awt.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_usuario")
	private String id;
	
	@Column(name= "login",columnDefinition="varchar(20)", nullable=false)
	private String login;
	
	@Column(name= "senha",columnDefinition="varchar(64)", nullable=false)
	private String senha;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="contato",
		joinColumns={@JoinColumn(name="id_usuario")},
		inverseJoinColumns={@JoinColumn(name="id_contato")})
	private <Contato> contatos;
	
	
	
	public Usuario(){
		// Construtor default
	}
	
	public Usuario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
