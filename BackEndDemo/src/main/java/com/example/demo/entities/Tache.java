package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tache implements Serializable{
	@Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String  reference;		
	private String client ;
	private String  projet;	
	private String intervenant;
	private Date echeance;
	private int charge ;
	private Date demarrage;
	private String activite;
	private String tech;
	private Date drmodif;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getIntervenant() {
		return intervenant;
	}
	public void setIntervenant(String intervenant) {
		this.intervenant = intervenant;
	}
	public Date getEcheance() {
		return echeance;
	}
	public void setEcheance(Date echeance) {
		this.echeance = echeance;
	}
	public int getCharge() {
		return charge;
	}
	public void setCharge(int charge) {
		this.charge = charge;
	}
	public Date getDemarrage() {
		return demarrage;
	}
	public void setDemarrage(Date demarrage) {
		this.demarrage = demarrage;
	}
	public String getActivite() {
		return activite;
	}
	public void setActivite(String activite) {
		this.activite = activite;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public Date getDrmodif() {
		return drmodif;
	}
	public void setDrmodif(Date drmodif) {
		this.drmodif = drmodif;
	}
	
	public String getProjet() {
		return projet;
	}
	public void setProjet(String projet) {
		this.projet = projet;
	}
	@Override
	public String toString() {
		return "Tache [id=" + id + ", reference=" + reference + ", client=" + client + ", intervenant=" + intervenant
				+ ", echeance=" + echeance + ", charge=" + charge + ", demarrage=" + demarrage + ", activite="
				+ activite + ", tech=" + tech + ", drmodif=" + drmodif + "]";
	}
	public Tache(Long id, String reference,String client, String projet, String intervenant, Date echeance, int charge,
			Date demarrage, String activite, String tech, Date drmodif) {
		super();
		this.id = id;
		this.reference = reference;
		this.projet=projet;
		this.client = client;
		this.intervenant = intervenant;
		this.echeance = echeance;
		this.charge = charge;
		this.demarrage = demarrage;
		this.activite = activite;
		this.tech = tech;
		this.drmodif = drmodif;
	}
	public Tache() {
		super();
		// TODO Auto-generated constructor stub
	}


}
