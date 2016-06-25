package Cavalo;

import java.util.ArrayList;
import java.util.List;

public class Paciente {

	private Long id;
	private String nome;
	private String raca;
	private List<Paciente> paciente;

	/**
	 * @param nome
	 * @param raca
	 * @param pacientes
	 */
	public Paciente(String nome, String raca, ArrayList<Paciente> paciente) {
		this.nome = nome;
		this.raca = raca;
		this.paciente = paciente;
	}

	public Paciente(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return this.raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public List<Paciente> getProprietario() {
		return this.paciente;
	}

	public void setProprietario(List<Paciente> cliente) {
		this.paciente = cliente;
	}
}
