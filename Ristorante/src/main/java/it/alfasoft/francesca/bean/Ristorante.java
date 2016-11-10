package it.alfasoft.francesca.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.faces.bean.ManagedBean;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;

@Entity
@ManagedBean
public class Ristorante implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_Ristorante;
	
	private String nome;
	
	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name="Primi")
	private Set<Prodotto> listaPrimi=new HashSet<Prodotto>();
	
	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name="Secondi")
	private Set<Prodotto> listaSecondi=new HashSet<Prodotto>();
	
	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name="Secondi")
	private Set<Prodotto> listaContorni=new HashSet<Prodotto>();
	
	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name="Contorni")
	private Set<Prodotto> listaDolci=new HashSet<Prodotto>();
	
	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name="Contorni")
	private Set<Prodotto> listaBevande=new HashSet<Prodotto>();

	public Ristorante() {
	}

	public Ristorante(String nome) {
		this.nome = nome;
	}



	public long getId_Ristorante() {
		return id_Ristorante;
	}

	public void setId_Ristorante(long id_Ristorante) {
		this.id_Ristorante = id_Ristorante;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Prodotto> getListaPrimi() {
		return listaPrimi;
	}

	public void setListaPrimi(Set<Prodotto> listaPrimi) {
		this.listaPrimi = listaPrimi;
	}
	

	public Set<Prodotto> getListaSecondi() {
		return listaSecondi;
	}

	public void setListaSecondi(Set<Prodotto> listaSecondi) {
		this.listaSecondi = listaSecondi;
	}

	public Set<Prodotto> getListaContorni() {
		return listaContorni;
	}

	public void setListaContorni(Set<Prodotto> listaContorni) {
		this.listaContorni = listaContorni;
	}

	public Set<Prodotto> getListaDolci() {
		return listaDolci;
	}

	public void setListaDolci(Set<Prodotto> listaDolci) {
		this.listaDolci = listaDolci;
	}

	public Set<Prodotto> getListaBevande() {
		return listaBevande;
	}

	public void setListaBevande(Set<Prodotto> listaBevande) {
		this.listaBevande = listaBevande;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public void addPrimo(Prodotto p){
		this.listaPrimi.add(p);
	}
	
	public void addSecondo(Prodotto p){
		this.listaSecondi.add(p);
	}
	
	public void addContorno(Prodotto p){
		this.listaContorni.add(p);
	}
	
	public void addDolce(Prodotto p){
		this.listaDolci.add(p);
	}
	
	public void addBevande(Prodotto p){
		this.listaBevande.add(p);
	}
}
