package com.jt.UserAuthentication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "gcEmployees")
@Entity
public class UserEntity {
	
	




	public UserEntity() {
		// TODO Auto-generated constructor stub
	}



	@Column(name = "id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String fullName;
	@Column(name="Email")
	private String email;
	@Column
	private String userName;
	@Column
	private String password;
	
		
		public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
		public String getUserName() {
		 return userName;
		 }
		 public void setUserName(String userName) {
		 this.userName = userName;
		 }
		 public String getPassword() {
		 return password;
		 }
		 public void setPassword(String password) {
		 this.password = password;
		 }
		 public void setFullName(String fullName) {
		 this.fullName = fullName;
		 }
		 public String getFullName() {
		 return fullName;
		 }
		 public void setEmail(String email) {
		 this.email = email;
		 }
		 public String getEmail() {
		 return email;
		 }
		 


		@Override
		public String toString() {
			return "RegRequirements [id=" + id + ", fullName=" + fullName + ", email=" + email + ", userName=" + userName
					+ ", password=" + password + "]";
		}
		

}
