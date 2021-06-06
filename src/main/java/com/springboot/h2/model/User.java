package com.springboot.h2.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class User {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String emailAddress;
	private String password;
	private String gender;
	private String address;
	private String mobileNumber;
	@JsonFormat(pattern = "yyyy-mm-dd")
	private Date dob;
	private boolean isActive;

}
