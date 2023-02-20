package br.com.fiap.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_cliente")
public class Cliente {
	
	@Id
	@SequenceGenerator(name="cliente",sequenceName="sq_tb_cliente",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="cliente")
	@Column(name="cd_cliente")
	private int id;
	
	@Column(name="nm_cliente")
	private String nome;
	


	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
