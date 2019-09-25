package com.lambdaschool.spotifysongsuggester.services;

import com.lambdaschool.spotifysongsuggester.exceptions.ResourceNotFoundException;
import com.lambdaschool.spotifysongsuggester.models.Track;
import com.lambdaschool.spotifysongsuggester.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
	public List<Track> findAll()
	{
		List<Track> list = new ArrayList<>();
		trackrepos.findAll().iterator().forEachRemaining(list::add);
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

	@Transactional
	@Override
	public Track save(Track track)
	{
		Track tt = new Track();

		if (track.getTrackid() != null)
		{
			tt.setTrackid(tt.getTrackid());
		}

		if (track.getTrackname() != null)
		{
			tt.setTrackname(tt.getTrackname());
		}

		if (track.getArtistname() != null)
		{
			tt.setArtistname(tt.getArtistname());
		}

		tt.setAcousticness(tt.getAcousticness());
		tt.setDanceability(tt.getDanceability());
		tt.setDuration(tt.getDuration());
		tt.setEnergy(tt.getEnergy());
		tt.setKey(tt.getKey());
		tt.setLiveness(tt.getLiveness());
		tt.setLoudness(tt.getLoudness());
		tt.setTempo(tt.getTempo());
		tt.setValence(tt.getValence());

//		edit later - if user faved songs list is empty
//		if(book.getAuthors().size()>0){
//			for (Author b : book.getAuthors()){
//				data.getAuthors().add(b);
//			}
//		}

		return trackrepos.save(tt);
	}

//	@Transactional
//	@Override
//	public void delete(long id)
//	{
//		trackrepos.findById(id)
//				 .orElseThrow(() -> new ResourceNotFoundException("Track id " + id + " not found!"));
//		trackrepos.deleteById(id);
//	}
}
