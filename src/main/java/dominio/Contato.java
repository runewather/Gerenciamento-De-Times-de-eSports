package dominio;

/* Os imports da Persistencia DAO */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="contato")
public class Contato {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_ATIVIDADE")
	@SequenceGenerator(name="SEQ_ATIVIDADE", sequenceName="id_seq_atividade", allocationSize=1)
	@Column(name="id_contato")
	private String id;
	
	@Column(name= "nome_contato",columnDefinition="varchar(200)", nullable=false)
	private String nome;
	
	@Column(name= "email_contato",columnDefinition="varchar(200)", nullable=false)
	private String email;
	
	@Column(name= "telefone_contato",columnDefinition="varchar(50)", nullable=true)
	private String telefone;
	
	@Column(name= "dataCadastro_contato",columnDefinition="timestamp without time zone", nullable=false)
	private String dataCadastro;
	
	
	/* Construtores da class */
	
	public Contato() {
		// Construtor default
	}
	
	public Contato(String nome, String email, String telefone, String dataCadastro) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.dataCadastro = dataCadastro;
	}

	
	
	/* Metodos da class */
	
	
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
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
}
