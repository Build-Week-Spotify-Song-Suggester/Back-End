package com.lambdaschool.spotifysongsuggester.services;

import com.lambdaschool.spotifysongsuggester.models.Track;

import java.util.List;

public interface TrackService
{
	List<Track> findAll();

//	Track findTrackById(long id);

//	Track findByName(long name);
	Track findByName(String name);

	Track save(Track track);

	void delete(long id);
}
