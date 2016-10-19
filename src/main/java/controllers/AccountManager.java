package controllers;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class AccountManager 
{
	public String DoLogin(String email, String senha)
	{
		if(email.equals("victo_10_@hotmail.com") && senha.equals("123456"))
		{
			return "/interna/cadastra.xhtml";
		}
		else
		{
			FacesMessage msg = new FacesMessage("Usuario e/ou senha incorretos");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			FacesContext.getCurrentInstance().addMessage("", msg);
			return null;
		}
	}
}
