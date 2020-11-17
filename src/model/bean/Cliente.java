package model.bean;

public class Cliente {
	private int idCliente;
	private String nome;
	private String cpf;
	private boolean sexo;
	public int getIdCliente() {
		return idCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public boolean isSexo() {
		return sexo;
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	
} 