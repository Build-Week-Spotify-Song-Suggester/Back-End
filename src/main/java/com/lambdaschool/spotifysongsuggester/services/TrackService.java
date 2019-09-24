package com.lambdaschool.spotifysongsuggester.services;

import com.lambdaschool.spotifysongsuggester.models.Track;

import java.util.List;
import java.util.Optional;

public interface TrackService
{
	List<Track> findAll();

//	Track findTrackById(String id);

	Optional<Track> findByName(String name);

	Track save(Track track);

	void delete(long id);
}
