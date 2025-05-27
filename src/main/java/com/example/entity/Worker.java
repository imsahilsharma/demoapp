package com.example.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Worker {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private Long role_id;

	@Column
	private String name; 
	
	@Column
	private Long age;
	
	@Column
	private String gender;
	
	@Column
	private String email; 
	
	@Column
	private Long phone;
	
	@Column
	private String marital_status;
	
	@Column
	private String education;
	
	@Column
	private String occupation;
	
	@Column
	private String created_by;
	
	@Column
	private LocalDateTime created_timestamp;
	
}
