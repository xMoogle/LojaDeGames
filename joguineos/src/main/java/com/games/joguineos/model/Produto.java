package com.games.joguineos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity

@Table(name="tb_produto")
public class Produto 
{
 @Id
 
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 public Long id;
 
 @NotNull
 private String nome;
 private String plataforma;
 private Long preco;
 private int qtd;
 private String tipo_midia;
 
 @ManyToOne
 @JsonIgnoreProperties("produto")
 private Genero genero;
 
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public Genero getGenero() {
	return genero;
}
public void setGenero(Genero genero) {
	this.genero = genero;
}
public String getPlataforma() {
	return plataforma;
}
public void setPlataforma(String plataforma) {
	this.plataforma = plataforma;
}
public Long getPreco() {
	return preco;
}
public void setPreco(Long preco) {
	this.preco = preco;
}
public int getQtd() {
	return qtd;
}
public void setQtd(int qtd) {
	this.qtd = qtd;
}
public String getTipo_midia() {
	return tipo_midia;
}
public void setTipo_midia(String tipo_midia) {
	this.tipo_midia = tipo_midia;
}
 
 
}
