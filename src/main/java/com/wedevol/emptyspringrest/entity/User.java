package com.wedevol.emptyspringrest.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Represents a user entity
 *
 * @author Charz++
 */

public class User implements Serializable {

	private static final long serialVersionUID = 3072475211055736282L;

	private Long id;
	private String name;
	private List<String> nicknames;
	private Integer age;
	private String email;

	public User() {
	}
	
	public User(Long id, String name, List<String> nicknames, Integer age, String email) {
		this.id = id;
		this.name = name;
		this.nicknames = nicknames;
		this.age = age;
		this.email = email;
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

	public List<String> getNicknames() {
		return nicknames;
	}

	public void setNicknames(List<String> nicknames) {
		this.nicknames = nicknames;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		int hashed = 1;
		if (id != null) {
			hashed = hashed * 31 + id.hashCode();
		}
		if (name != null) {
			hashed = hashed * 31 + name.hashCode();
		}
		if (nicknames != null) {
			hashed = hashed * 31 + nicknames.hashCode();
		}
		if (age != null) {
			hashed = hashed * 31 + age.hashCode();
		}
		if (email != null) {
			hashed = hashed * 31 + email.hashCode();
		}
		return hashed;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != this.getClass())
			return false;
		if (obj == this)
			return true;
		User other = (User) obj;
		return this.hashCode() == other.hashCode();
	}

}
