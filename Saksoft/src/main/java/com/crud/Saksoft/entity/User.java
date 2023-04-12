package com.crud.Saksoft.entity;

import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity

public class User {


	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "first_name", nullable = false)
	    private String firstName;

	    @Column(name = "last_name", nullable = false)
	    private String lastName;

	    @Column(name = "email", nullable = false)
	    private String email;

	    @Column(name = "age", nullable = false)
	    private int age;

		public User(Long id, String firstName, String lastName, String email, int age) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.age = age;
		}
		
		public User() {
			super();
		}


		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
	    

}
