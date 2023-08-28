package com.example.day8.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="stuid")
	public int sid;
	public String name;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="foreignkey",referencedColumnName = "stuid")
	public List <address> address_no;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<address> getAddress() {
		return address_no;
	}
	public void setAddress(List<address> address) {
		this.address_no = address;
	}
}

