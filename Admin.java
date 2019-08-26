package com.example.demo53;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name="admin")
public class Admin {
	
	@Column(name="adminId")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long adminId;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	@Column(name="contact")
	private String contact;
	@Column(name="status")
	private String status;
	@Column(name="role")
	private String role;
	public Admin() {
		super();
		
	}
	public Admin( String name, String email, String password, String contact, String status, String role) {
		super();
			
			this.name = name;
			this.email = email;
			this.password = password;
			this.contact = contact;
			this.status = status;
			this.role = role;
		}

	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public long getAdminId() {
		return adminId;
	}
	public void setAdminId(long adminId) {
		this.adminId = adminId;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", contact=" + contact + ", status=" + status + ", role=" + role + "]";
}
	
}
