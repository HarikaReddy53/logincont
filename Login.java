package com.example.demo53;


import javax.persistence.*;

@Entity
@Table(name = "login")
public class Login {
     
	
	@Id
	@Column(name="email",unique=true)
    private String email;
	@Column(name="password")
    private String password;
	@Column(name="role")
    private String role;
//	 @OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
//	private Admin admin;
	public String getRole() {
		return role;
	}
  

	public Login( Admin admin) {
		super();
		this.email = admin.getEmail();
		this.password=admin.getPassword();
		this.role=admin.getRole();
	}

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public String getEmail() {
		return email;
	}

	

	public String getPassword() {
		return password;
	}

	

	

	

}