package com.qa.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tarantula")
public class Tarantula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "leg_span")
	private int legSpan;
	@Column(name = "habitat")
	private String habitat;
	@Column(name = "dimorphism")
	private boolean dimorphism;
	@Column(name = "temperament")
	private String temperament;
	@Column(name = "climate")
	private String climate;
	@Column(name = "genus")
	private String genus;
	@Column(name = "common_name")
	private String commonName;

	public Tarantula() {
		super();

	}

	public Tarantula(Long id, int legSpan, String habitat, boolean dimorphism, String temperament, String climate,
			String genus, String commonName) {
		super();
		this.id = id;
		this.legSpan = legSpan;
		this.habitat = habitat;
		this.dimorphism = dimorphism;
		this.temperament = temperament;
		this.climate = climate;
		this.genus = genus;
		this.commonName = commonName;
	}

	public Tarantula(int legSpan, String habitat, boolean dimorphism, String temperament, String climate, String genus,
			String commonName) {
		super();
		this.legSpan = legSpan;
		this.habitat = habitat;
		this.dimorphism = dimorphism;
		this.temperament = temperament;
		this.climate = climate;
		this.genus = genus;
		this.commonName = commonName;
	}

	@Override
	public String toString() {
		return "Tarantula [id=" + id + ", legSpan=" + legSpan + ", habitat=" + habitat + ", dimorphism=" + dimorphism
				+ ", temperament=" + temperament + ", climate=" + climate + ", genus=" + genus + ", commonName="
				+ commonName + "]";
	}

	public Long getId() {
		return id;
	}

	
	public int getLegSpan() {
		return legSpan;
	}

	public void setLegSpan(int legSpan) {
		this.legSpan = legSpan;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public boolean isDimorphism() {
		return dimorphism;
	}

	public void setDimorphism(boolean dimorphism) {
		this.dimorphism = dimorphism;
	}

	public String getTemperament() {
		return temperament;
	}

	public void setTemperament(String temperament) {
		this.temperament = temperament;
	}

	public String getClimate() {
		return climate;
	}

	public void setClimate(String climate) {
		this.climate = climate;
	}

	public String getGenus() {
		return genus;
	}

	public void setGenus(String genus) {
		this.genus = genus;
	}

	public String getCommonName() {
		return commonName;
	}

	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}

}
