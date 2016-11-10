package it.alfasoft.francesca.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Embeddable
@ManagedBean
public class Prodotto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nomeProdotto;
	private double prezzo;
	
	public Prodotto() {
	}

	public Prodotto(String nomeProdotto, double prezzo) {
		this.nomeProdotto = nomeProdotto;
		this.prezzo = prezzo;
	}

	public String getNomeProdotto() {
		return nomeProdotto;
	}

	public void setNomeProdotto(String nomeProdotto) {
		this.nomeProdotto = nomeProdotto;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
