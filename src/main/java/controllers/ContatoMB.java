package controllers;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import dominio.Contato;

@ManagedBean
@SessionScoped
public class ContatoMB {
	private Contato contato;
	private List<Contato> listaContatos;
	
	public ContatoMB() {
		contato = new Contato();
		listaContatos = new ArrayList<Contato>(); 
	}
	
	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public List<Contato> getListaContatos() {
		return listaContatos;
	}

	public void setListaContatos(List<Contato> listaContatos) {
		this.listaContatos = listaContatos;
	}

	public String cadastrar() {
		listaContatos.add(contato);
		FacesMessage msg = new FacesMessage("Contato adicionado com sucesso");
		msg.setSeverity(FacesMessage.SEVERITY_INFO);
		FacesContext.getCurrentInstance().addMessage("", msg);
		contato = new Contato();
		return "/interna/lista.jsf";
	}
	
	public String novo() {
		return "/interna/cadastra.jsf";
	}
}
