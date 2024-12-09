package com.devsuperior.hruser.dto;

import com.devsuperior.hruser.entity.User;

public class UserDTO {

	private Long id;
	private String name;
	private String email;
	private String levelAdmName;

	public UserDTO(User user) {
		this.id = user.getId();
		this.name = user.getName();
		this.email = user.getEmail();
		this.levelAdmName = user.getLevelAdm() != null ? user.getLevelAdm().getName() : null;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLevelAdmName() {
		return levelAdmName;
	}

	public void setLevelAdmName(String levelAdmName) {
		this.levelAdmName = levelAdmName;
	}
}
