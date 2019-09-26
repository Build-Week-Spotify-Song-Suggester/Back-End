package com.lambdaschool.spotifysongsuggester.services;

import com.lambdaschool.spotifysongsuggester.models.Track;
import com.lambdaschool.spotifysongsuggester.models.UserTrack;
import com.lambdaschool.spotifysongsuggester.view.TrackRecs;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.List;

public interface TrackService
{
	List<Track> findAll(Pageable pageable);

	Track findByName(String name);

	Track save(Track track);

//	void delete(long id);

//	ArrayList<TrackRecs> getTrackRecs();

	List<String> findByUserid(long id);

	void saveTrack(String trackid, long userid);
}
