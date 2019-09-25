package com.lambdaschool.spotifysongsuggester.services;

import com.lambdaschool.spotifysongsuggester.models.Track;

import java.util.List;

public interface TrackService
{
	List<Track> findAll();

	Track findByName(String name);

	Track save(Track track);

//	void delete(long id);
}
