package Modelo.UmPraUm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Assentos")
public class Assento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
	private String nome;
	
	//@OneToOne(mappedBy = "assento")
	//private Cliente cliente;

	public Assento() {
		
	}

	public Assento(String nome) {
		super();
		this.nome = nome;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
