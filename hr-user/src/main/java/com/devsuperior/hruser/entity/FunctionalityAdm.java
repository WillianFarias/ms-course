package com.devsuperior.hruser.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_FUNCTIONALITY_ADM")
public class FunctionalityAdm implements Serializable {

	private static final long serialVersionUID = 7160937476916301767L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String description;
	
	@ManyToOne
    @JoinColumn(name = "level_adm_id", nullable = false)
    private LevelAdm nivelAdministrador;
	
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LevelAdm getNivelAdministrador() {
		return nivelAdministrador;
	}

	public void setNivelAdministrador(LevelAdm nivelAdministrador) {
		this.nivelAdministrador = nivelAdministrador;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FunctionalityAdm other = (FunctionalityAdm) obj;
		return Objects.equals(id, other.id);
	}
}
