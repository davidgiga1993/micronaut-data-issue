package com.example;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ScanHistory
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;


	/**
	 * The start date of this history
	 */
	private Date date;

	public int getId()
	{
		return id;
	}

	public Date getDate()
	{
		return date;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}
}