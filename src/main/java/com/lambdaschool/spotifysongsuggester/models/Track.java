package com.lambdaschool.spotifysongsuggester.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "track_features")
public class Track extends Auditable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "track_id")
	private String trackid;

	@Column(nullable = false,
			unique = true)
	private String artist_name;

	@Column(nullable = false,
			unique = true)
	private String track_name;

	// many tracks to many users
//	@ManyToMany
//	@JoinTable(name = "wrote",
//			   joinColumns = {@JoinColumn(name = "trackid")},
//			   inverseJoinColumns = {@JoinColumn(name = "userid")}
//	)
//	@JsonIgnoreProperties("tracks")
//	private List<User> users;


	private float acousticness;
	private float danceability;

	@Column(name = "duration_ms")
	private float duration;

	private float energy;
	private float instrumentalness;
	private float key;
	private float liveness;
	private float loudness;
	private float mode;
	private float speechiness;
	private float tempo;
	private float time_signature;
	private float valence;
	private float popularity;

	// default constructor
	public Track()
	{
	}

	// constructor
	public Track(String artist_name, String track_name, float acousticness,
				 float danceability, float duration, float energy,
				 float instrumentalness, float key, float liveness,
				 float loudness, float mode, float speechiness, float tempo,
				 float time_signature, float valence, float popularity)
	{
		this.artist_name = artist_name;
		this.track_name = track_name;
		this.acousticness = acousticness;
		this.danceability = danceability;
		this.duration = duration;
		this.energy = energy;
		this.instrumentalness = instrumentalness;
		this.key = key;
		this.liveness = liveness;
		this.loudness = loudness;
		this.mode = mode;
		this.speechiness = speechiness;
		this.tempo = tempo;
		this.time_signature = time_signature;
		this.valence = valence;
		this.popularity = popularity;
	}

	// getters and setters
	public String getTrackid()
	{
		return trackid;
	}

	public void setTrackid(String track_id)
	{
		this.trackid = track_id;
	}

	public String getArtist_name()
	{
		return artist_name;
	}

	public void setArtist_name(String artist_name)
	{
		this.artist_name = artist_name;
	}

	public String getTrack_name()
	{
		return track_name;
	}

	public void setTrack_name(String track_name)
	{
		this.track_name = track_name;
	}

	public float getAcousticness()
	{
		return acousticness;
	}

	public void setAcousticness(float acousticness)
	{
		this.acousticness = acousticness;
	}

	public float getDanceability()
	{
		return danceability;
	}

	public void setDanceability(float danceability)
	{
		this.danceability = danceability;
	}

	public float getDuration()
	{
		return duration;
	}

	public void setDuration(float duration)
	{
		this.duration = duration;
	}

	public float getEnergy()
	{
		return energy;
	}

	public void setEnergy(float energy)
	{
		this.energy = energy;
	}

	public float getInstrumentalness()
	{
		return instrumentalness;
	}

	public void setInstrumentalness(float instrumentalness)
	{
		this.instrumentalness = instrumentalness;
	}

	public float getKey()
	{
		return key;
	}

	public void setKey(float key)
	{
		this.key = key;
	}

	public float getLiveness()
	{
		return liveness;
	}

	public void setLiveness(float liveness)
	{
		this.liveness = liveness;
	}

	public float getLoudness()
	{
		return loudness;
	}

	public void setLoudness(float loudness)
	{
		this.loudness = loudness;
	}

	public float getMode()
	{
		return mode;
	}

	public void setMode(float mode)
	{
		this.mode = mode;
	}

	public float getSpeechiness()
	{
		return speechiness;
	}

	public void setSpeechiness(float speechiness)
	{
		this.speechiness = speechiness;
	}

	public float getTempo()
	{
		return tempo;
	}

	public void setTempo(float tempo)
	{
		this.tempo = tempo;
	}

	public float getTime_signature()
	{
		return time_signature;
	}

	public void setTime_signature(float time_signature)
	{
		this.time_signature = time_signature;
	}

	public float getValence()
	{
		return valence;
	}

	public void setValence(float valence)
	{
		this.valence = valence;
	}

	public float getPopularity()
	{
		return popularity;
	}

	public void setPopularity(float popularity)
	{
		this.popularity = popularity;
	}


	//	public List<User> getUsers()
//	{
//		return users;
//	}
//
//	public void setUsers(List<User> users)
//	{
//		this.users = users;
//	}
}
