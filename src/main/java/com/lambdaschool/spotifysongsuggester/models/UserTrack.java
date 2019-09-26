package com.lambdaschool.spotifysongsuggester.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "usertracks")
public class UserTrack extends Auditable implements Serializable
{
	@Id
	@ManyToOne
	@JoinColumn(name = "userid")
	@JsonIgnoreProperties("usertracks")
	private User user;

	@Id
	@ManyToOne
	@JoinColumn(name = "trackid")
	@JsonIgnoreProperties("usertracks")
	private Track track_features;

	public UserTrack()
	{
	}

	public UserTrack(User user, Track track_features)
	{
		this.user = user;
		this.track_features = track_features;
	}

	public User getUser()
	{
		return user;
	}

	public void setUser(User user)
	{
		this.user = user;
	}

	public Track getTrack_features()
	{
		return track_features;
	}

	public void setTrack_features(Track track_features)
	{
		this.track_features = track_features;
	}
}
