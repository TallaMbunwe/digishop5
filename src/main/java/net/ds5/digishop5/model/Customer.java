package net.ds5.digishop5.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer implements Serializable {

	private static final long serialVersionUID = -7280187378770180724L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String email;
	private Long mobile;
	// Generate getters and setters...

	public Customer() {	}

	public Customer(String name, String email, Long mobile) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}

	public Customer(Integer id, String name, String email, Long mobile) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}
}