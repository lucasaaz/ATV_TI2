package model;

public class Usuario {
	private int ID;   //ID
	private String login; //Professor
	private String senha; //Materia
	private char sexo;    //Disponibiliade 
	
	public Usuario() {
		this.ID = -1;
		this.login = "";
		this.senha = "";
		this.sexo = '*';
	}
	
	public Usuario(int codigo, String login, String senha, char sexo) {
		this.ID = codigo;
		this.login = login;
		this.senha = senha;
		this.sexo = sexo;
	}

	public int getID() {
		return ID;
	}

	public void setID(int codigo) {
		this.ID = codigo;
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

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return " Usuario " + login + "\t[ ID: " + ID + ", \tProfessor: " + login + ", \tMatéria: " + senha + ", \tDisponível: " + sexo + " ]";
	}	
}
