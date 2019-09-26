package com.lambdaschool.spotifysongsuggester.services;

import com.lambdaschool.spotifysongsuggester.exceptions.ResourceNotFoundException;
import com.lambdaschool.spotifysongsuggester.models.Track;
import com.lambdaschool.spotifysongsuggester.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service(value = "trackService")
public class TrackServiceImpl implements TrackService
{
	@Autowired
	TrackRepository trackrepos;

	@Override
	public List<Track> findAll(Pageable pageable)
	{
		List<Track> list = new ArrayList<>();
		trackrepos.findAll(pageable).iterator().forEachRemaining(list::add);
		return list;
	}

	@Override
	public Track findByName(String name)
	{
		Track tt = trackrepos.findByTrackid(name);

		if (tt != null)
		{
			return tt;
		} else
		{
			throw new ResourceNotFoundException(name);
		}
	}

	@Override
	public List<String> findByUserid(long id)
	{
		return trackrepos.findTracksByUserid(id);
	}

	@Transactional
	@Modifying
	@Override
	public void saveTrack(String trackid, long userid)
	{
		trackrepos.saveTrack(trackid, userid);
	}

	@Transactional
	@Modifying
	@Override
	public void deleteTrack(String trackid, long userid)
	{
		trackrepos.deleteTrack(trackid, userid);
	}
}
