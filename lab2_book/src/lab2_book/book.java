package lab2_book;

import java.io.Serializable;


public class book implements Serializable
{
	
	private static final long serialVersionUID = -2225053861113413685L;
	
	private Integer ISBN;
	private String Title;
	private Integer AuthorID;
	private String Publisher;
	private String PublishDate;
	private float  Price;
	
	public Integer getISBN()
	{
		return ISBN;
	}
	public void setISBN(Integer ISBN)
	{
		this.ISBN = ISBN;
	}
	public String getTitle()
	{
		return Title;
	}
	public void setTitle(String Title)
	{
		this.Title = Title;
	}
	public Integer getAuthorID()
	{
		return AuthorID;
	}
	public void setAuthorID(Integer AuthorID)
	{
		this.AuthorID = AuthorID;
	}
	public String getPublisher()
	{
		return Publisher;
	}
	public void setPublisher(String Publisher)
	{
		this.Publisher = Publisher;
	}
	public String getPublishDate()
	{
		return PublishDate;
	}
	public void setPublishDate(String PublishDate)
	{
		this.PublishDate = PublishDate;
	}
	
	public float getPrice()
	{
		return Price;
	}
	public void setPrice(float Price)
	{
		this.Price = Price;
	}
	
}