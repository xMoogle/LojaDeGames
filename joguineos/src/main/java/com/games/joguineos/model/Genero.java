package com.games.joguineos.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity

@Table(name="tb_categoria")
public class Genero 
{
 @Id
 
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 public Long id;
 
 @NotNull
 private String name;
 private String descricao;
 
@OneToMany(mappedBy = "genero", cascade = CascadeType.ALL)
@JsonIgnoreProperties("genero")
	private List<Produto> produto;
 
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
}
