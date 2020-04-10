package com.okan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "FUTBOLCULAR")
public class Futbolcu {

	@Id
	@Column(name = "ID")
	@SequenceGenerator(name = "fut_seq", sequenceName = "FUTBOLCU_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fut_seq")
	private Integer id;

	@Column(name = "AD")
	private String ad;

	@JoinColumn(name = "TAKIM_ID")
	private Takim takim;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public Takim getTakim() {
		return takim;
	}

	public void setTakim(Takim takim) {
		this.takim = takim;
	}

	public Futbolcu() {
	}

	public Futbolcu(String ad, Takim takim) {
		this.ad = ad;
		this.takim = takim;
	}

	@Override
	public String toString() {
		return "Fulbolcu [id= " + id + ", ad= " + ad + ", takim= " + takim.getId() + "]";
	}

}
