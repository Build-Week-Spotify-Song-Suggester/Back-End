package com.lambdaschool.spotifysongsuggester.models;

import javax.persistence.*;

@Entity
@Table(name = "tracks")
public class Track extends Auditable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String trackid;

	@Column(nullable = false,
			unique = true)
	private String artistname;

	@Column(nullable = false,
			unique = true)
	private String trackname;

	private int acousticness;
	private int danceability;
	private int duration;
	private int energy;
	private int key;
	private int liveness;
	private int loudness;
	private int tempo;
	private int valence;

	// default constructor
	public Track()
	{
	}

	// constructor
	public Track(String artistname, String trackname, int acousticness, int danceability, int duration, int energy, int key, int liveness, int loudness, int tempo, int valence)
	{
		this.artistname = artistname;
		this.trackname = trackname;
		this.acousticness = acousticness;
		this.danceability = danceability;
		this.duration = duration;
		this.energy = energy;
		this.key = key;
		this.liveness = liveness;
		this.loudness = loudness;
		this.tempo = tempo;
		this.valence = valence;
	}

	// getters and setters
	public String getTrackid()
	{
		return trackid;
	}

	public void setTrackid(String trackid)
	{
		this.trackid = trackid;
	}

	public String getArtistname()
	{
		return artistname;
	}

	public void setArtistname(String artistname)
	{
		this.artistname = artistname;
	}

	public String getTrackname()
	{
		return trackname;
	}

	public void setTrackname(String trackname)
	{
		this.trackname = trackname;
	}

	public int getAcousticness()
	{
		return acousticness;
	}

	public void setAcousticness(int acousticness)
	{
		this.acousticness = acousticness;
	}

	public int getDanceability()
	{
		return danceability;
	}

	public void setDanceability(int danceability)
	{
		this.danceability = danceability;
	}

	public int getDuration()
	{
		return duration;
	}

	public void setDuration(int duration)
	{
		this.duration = duration;
	}

	public int getEnergy()
	{
		return energy;
	}

	public void setEnergy(int energy)
	{
		this.energy = energy;
	}

	public int getKey()
	{
		return key;
	}

	public void setKey(int key)
	{
		this.key = key;
	}

	public int getLiveness()
	{
		return liveness;
	}

	public void setLiveness(int liveness)
	{
		this.liveness = liveness;
	}

	public int getLoudness()
	{
		return loudness;
	}

	public void setLoudness(int loudness)
	{
		this.loudness = loudness;
	}

	public int getTempo()
	{
		return tempo;
	}

	public void setTempo(int tempo)
	{
		this.tempo = tempo;
	}

	public int getValence()
	{
		return valence;
	}

	public void setValence(int valence)
	{
		this.valence = valence;
	}
}
