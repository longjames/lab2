package lab2_book;

import java.io.Serializable;


public class author implements Serializable
{
	
	private static final long serialVersionUID = -2225053861113413685L;
	
	
	private Integer AuthorID;
	private String Name;
	private Integer Age;
	private String  Country;
	
	public Integer getAge()
	{
		return Age ;
	}
	public void setAge(Integer Age)
	{
		this.Age = Age;
	}
	public String getName()
	{
		return Name;
	}
	public void setName(String Name)
	{
		this.Name = Name;
	}
	public Integer getAuthorID()
	{
		return AuthorID;
	}
	public void setAuthorID(Integer AuthorID)
	{
		this.AuthorID = AuthorID;
	}
	public String getCountry()
	{
		return Country;
	}
	public void setCountry(String Country)
	{
		this.Country =Country;
	}
	
}