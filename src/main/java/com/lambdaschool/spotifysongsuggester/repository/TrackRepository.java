package com.lambdaschool.spotifysongsuggester.repository;

import com.lambdaschool.spotifysongsuggester.models.Track;
import org.springframework.data.repository.CrudRepository;

public interface TrackRepository extends CrudRepository<Track, Long>
{
	Track findByTrackid(String name);
}
