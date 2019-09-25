package com.lambdaschool.spotifysongsuggester.services;

import com.lambdaschool.spotifysongsuggester.models.Track;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TrackService
{
	List<Track> findAll(Pageable pageable);

	Track findByName(String name);

	Track save(Track track);

//	void delete(long id);
}
