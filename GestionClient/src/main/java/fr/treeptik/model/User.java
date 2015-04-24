package fr.treeptik.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User implements Serializable{

	private static final long SerialVersionUID = 1L;
	
	@Id
	private String login;
	private String password;
	private Boolean enabled;
	
	@ElementCollection
	private List<String> roles;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String login, String password, Boolean enabled) {
		super();
		this.login = login;
		this.password = password;
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "User [login=" + login + ", password=" + password + ", enabled="
				+ enabled + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		return true;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	
	

}
