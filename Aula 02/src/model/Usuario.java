package model;

public class Usuario
{


private String login;
private String senha;
private String perfil;
private String nome;
private int cpf;
private String dataNascimento;
private String email;


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
public String getPerfil() {
	return perfil;
}
public void setPerfil(String perfil) {
	this.perfil = perfil;
}

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getCpf() {
	return cpf;
}
public void setCpf(int cpf) {
	this.cpf = cpf;
}
public String getDataNascimento() {
	return dataNascimento;
}
public void setDataNascimento(String dataNascimento) {
	this.dataNascimento = dataNascimento;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}


}