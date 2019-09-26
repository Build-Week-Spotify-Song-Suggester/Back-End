package com.lambdaschool.spotifysongsuggester.models;

import javax.persistence.*;

@Entity
@Table(name = "recommendations")
public class Recommendations
{
	@Id
	private String searched_song;

	private String nearest_song1;
	private String nearest_song2;
	private String nearest_song3;
	private String nearest_song4;
	private String nearest_song5;
	private String nearest_song6;
	private String nearest_song7;
	private String nearest_song8;
	private String nearest_song9;
	private String nearest_song10;

	// default constructor
	public Recommendations()
	{
	}

	// constructor
	public Recommendations(String searched_song, String nearest_song1, String nearest_song2, String nearest_song3, String nearest_song4, String nearest_song5, String nearest_song6, String nearest_song7, String nearest_song8, String nearest_song9, String nearest_song10)
	{
		this.searched_song = searched_song;
		this.nearest_song1 = nearest_song1;
		this.nearest_song2 = nearest_song2;
		this.nearest_song3 = nearest_song3;
		this.nearest_song4 = nearest_song4;
		this.nearest_song5 = nearest_song5;
		this.nearest_song6 = nearest_song6;
		this.nearest_song7 = nearest_song7;
		this.nearest_song8 = nearest_song8;
		this.nearest_song9 = nearest_song9;
		this.nearest_song10 = nearest_song10;
	}

	// getters and setters
	public String getSearched_song()
	{
		return searched_song;
	}

	public void setSearched_song(String searched_song)
	{
		this.searched_song = searched_song;
	}

	public String getNearest_song1()
	{
		return nearest_song1;
	}

	public void setNearest_song1(String nearest_song1)
	{
		this.nearest_song1 = nearest_song1;
	}

	public String getNearest_song2()
	{
		return nearest_song2;
	}

	public void setNearest_song2(String nearest_song2)
	{
		this.nearest_song2 = nearest_song2;
	}

	public String getNearest_song3()
	{
		return nearest_song3;
	}

	public void setNearest_song3(String nearest_song3)
	{
		this.nearest_song3 = nearest_song3;
	}

	public String getNearest_song4()
	{
		return nearest_song4;
	}

	public void setNearest_song4(String nearest_song4)
	{
		this.nearest_song4 = nearest_song4;
	}

	public String getNearest_song5()
	{
		return nearest_song5;
	}

	public void setNearest_song5(String nearest_song5)
	{
		this.nearest_song5 = nearest_song5;
	}

	public String getNearest_song6()
	{
		return nearest_song6;
	}

	public void setNearest_song6(String nearest_song6)
	{
		this.nearest_song6 = nearest_song6;
	}

	public String getNearest_song7()
	{
		return nearest_song7;
	}

	public void setNearest_song7(String nearest_song7)
	{
		this.nearest_song7 = nearest_song7;
	}

	public String getNearest_song8()
	{
		return nearest_song8;
	}

	public void setNearest_song8(String nearest_song8)
	{
		this.nearest_song8 = nearest_song8;
	}

	public String getNearest_song9()
	{
		return nearest_song9;
	}

	public void setNearest_song9(String nearest_song9)
	{
		this.nearest_song9 = nearest_song9;
	}

	public String getNearest_song10()
	{
		return nearest_song10;
	}

	public void setNearest_song10(String nearest_song10)
	{
		this.nearest_song10 = nearest_song10;
	}
}
