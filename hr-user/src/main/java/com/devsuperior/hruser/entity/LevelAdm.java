package com.devsuperior.hruser.entity;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TB_LEVEL_ADM")
public class LevelAdm implements Serializable {

	private static final long serialVersionUID = 7142504326745261014L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@OneToMany(mappedBy = "levelAdm", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<User> users;
	
	@OneToMany(mappedBy = "nivelAdministrador", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<FunctionalityAdm> functionalityAdm;

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

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public Set<FunctionalityAdm> getFunctionalityAdm() {
		return functionalityAdm;
	}

	public void setFunctionalityAdm(Set<FunctionalityAdm> functionalityAdm) {
		this.functionalityAdm = functionalityAdm;
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
		LevelAdm other = (LevelAdm) obj;
		return Objects.equals(id, other.id);
	}
}
