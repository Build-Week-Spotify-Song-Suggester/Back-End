package com.lambdaschool.spotifysongsuggester.services;

import com.lambdaschool.spotifysongsuggester.exceptions.ResourceNotFoundException;
import com.lambdaschool.spotifysongsuggester.models.Track;
import com.lambdaschool.spotifysongsuggester.models.UserTrack;
import com.lambdaschool.spotifysongsuggester.repository.TrackRepository;
import com.lambdaschool.spotifysongsuggester.view.TrackRecs;
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

	@Transactional
	@Override
	public Track save(Track track)
	{
		Track tt = new Track();

		if (track.getTrackid() != null)
		{
			tt.setTrackid(tt.getTrackid());
		}

		if (track.getTrack_name() != null)
		{
			tt.setTrack_name(tt.getTrack_name());
		}

		if (track.getArtist_name() != null)
		{
			tt.setArtist_name(tt.getArtist_name());
		}

		tt.setAcousticness(tt.getAcousticness());
		tt.setDanceability(tt.getDanceability());
		tt.setDuration(tt.getDuration());
		tt.setEnergy(tt.getEnergy());
		tt.setInstrumentalness(tt.getInstrumentalness());
		tt.setKey(tt.getKey());
		tt.setLiveness(tt.getLiveness());
		tt.setLoudness(tt.getLoudness());
		tt.setMode(tt.getMode());
		tt.setSpeechiness(tt.getSpeechiness());
		tt.setTempo(tt.getTempo());
		tt.setTime_signature(tt.getTime_signature());
		tt.setValence(tt.getValence());
		tt.setPopularity(tt.getPopularity());

//		edit later - if user faved songs list is empty
//		if(book.getAuthors().size()>0){
//			for (Author b : book.getAuthors()){
//				data.getAuthors().add(b);
//			}
//		}

		return trackrepos.save(tt);
	}

//	@Override
//	public ArrayList<TrackRecs> getTrackRecs()
//	{
//		return trackrepos.getTrackRecs();
//	}

//	@Transactional
//	@Override
//	public void delete(long id)
//	{
//		trackrepos.findById(id)
//				 .orElseThrow(() -> new ResourceNotFoundException("Track id " + id + " not found!"));
//		trackrepos.deleteById(id);
//	}


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
