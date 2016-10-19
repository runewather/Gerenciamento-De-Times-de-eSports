package controllers;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import dominio.User;

@ManagedBean
@RequestScoped
public class UserMB {
	private User user;
	
	public UserMB()
	{
		user = new User();
	}
		
	public User getUser() 
	{
		return user;
	}

	public void setUser(User user) 
	{
		this.user = user;
	}	
	
	public String login() {
		if (user.getEmail().equals("victo_10_@hotmail.com") && 
			user.getPassword().equals("123456")) {
			return "/interna/cadastra.jsf";
		} else {
			FacesMessage msg = new FacesMessage("Usuario e/ou senha incorretos");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			FacesContext.getCurrentInstance().addMessage("", msg);
			return null;
		}
	}
	
}
