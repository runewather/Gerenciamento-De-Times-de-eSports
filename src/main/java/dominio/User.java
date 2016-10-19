package dominio;

public class User {
	private String m_name;
	private String m_nick;
	private int m_age;
	private String email;
	private String m_dotaBuffLink;
	private String password;	
	
	public User()
	{
		
	}
	
	public String getName() 
	{
		return m_name;
	}
	
	public void setName(String name) 
	{
		this.m_name = name;
	}
	
	public String getNick() 
	{
		return m_nick;
	}
	
	public void setNick(String nick) 
	{
		this.m_nick = nick;
	}
	
	public int getAge() 
	{
		return m_age;
	}
	
	public void setAge(int age) 
	{
		this.m_age = age;
	}
	
	public String getEmail() 
	{
		return this.email;
	}
	
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	public String getDotaBuffLink() 
	{
		return m_dotaBuffLink;
	}
	public void setDotaBuffLink(String dotaBuffLink) 
	{
		this.m_dotaBuffLink = dotaBuffLink;
	}
	
	public String getPassword() 
	{
		return password;
	}
	
	public void setPassword(String password) 
	{
		this.password = password;
	}
	
}
