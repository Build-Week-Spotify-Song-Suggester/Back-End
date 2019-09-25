package com.lambdaschool.spotifysongsuggester.repository;

import com.lambdaschool.spotifysongsuggester.models.Track;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TrackRepository extends PagingAndSortingRepository<Track, Long>
{
	Track findByTrackid(String name);
}
