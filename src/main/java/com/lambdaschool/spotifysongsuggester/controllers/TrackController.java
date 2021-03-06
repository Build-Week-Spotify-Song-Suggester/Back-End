package com.lambdaschool.spotifysongsuggester.controllers;

import com.lambdaschool.spotifysongsuggester.models.Recommendations;
import com.lambdaschool.spotifysongsuggester.models.Track;
import com.lambdaschool.spotifysongsuggester.models.User;
import com.lambdaschool.spotifysongsuggester.services.RecommendationsService;
import com.lambdaschool.spotifysongsuggester.services.TrackService;
import com.lambdaschool.spotifysongsuggester.services.UserService;
import com.lambdaschool.spotifysongsuggester.utils.Utilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tracks")
public class TrackController
{
	@Autowired
	private TrackService trackService;

	@Autowired
	private UserService userService;

	@Autowired
	private RecommendationsService recommendationsService;

	// GET - localhost:2019/tracks/tracks
	// get all tracks (testing)
	@GetMapping(value = "/tracks", produces = {"application/json"})
	public ResponseEntity<?> allTracks(
			@PageableDefault(page = 0,
							 size = 10)
					Pageable pageable)
	{
		List<Track> list = trackService.findAll(pageable);
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	// GET - localhost:2019/tracks/track/:name
	// get track by trackid
	@GetMapping(value = "/track/{name}", produces = {"application/json"})
	public ResponseEntity<?> getTrackByName(HttpServletRequest request,
											@PathVariable String name)
	{
		Track tt = trackService.findByName(name);
		return new ResponseEntity<>(tt, HttpStatus.OK);
	}

	// POST - localhost:2019/tracks/save/{trackid}
	// saves track by trackid
	@PostMapping(value = "/save/{trackid}")
	public ResponseEntity<?> saveTrack(@PathVariable String trackid,
									   Authentication authentication)
	{
		// authenticates current user
		String username = ((UserDetails)(authentication.getPrincipal())).getUsername();
		User user = userService.findByName(username);

		trackService.saveTrack(trackid, user.getUserid());
		return new ResponseEntity<>(null, HttpStatus.CREATED);
	}

	// GET - localhost:2019/tracks/savedtracks
	// get all user's saved tracks
	@GetMapping(value = "/savedtracks", produces = {"application/json"})
	public ResponseEntity<?> getSavedTracks(Authentication authentication)
	{
		// authenticates current user
		String username = ((UserDetails)(authentication.getPrincipal())).getUsername();
		User user = userService.findByName(username);

		List<String> usertracks = trackService.findByUserid(user.getUserid());
		List<Track> tracks = new ArrayList<>();

		for (String usertrack : usertracks)
		{
			tracks.add(trackService.findByName(usertrack));
		}

		return new ResponseEntity<>(tracks, HttpStatus.OK);
	}

	// GET - localhost:2019/tracks/recs/{trackid}
	// gets suggested songs from trackid
	@GetMapping(value = "/recs/{trackid}", produces = {"application/json"})
	public ResponseEntity<?> recTrack(@PathVariable String trackid)
	{
		Recommendations recs = recommendationsService.findBySuggestedsongid(trackid);

		List<String> list = Utilities.convertToList(recs);
		List<Track> tracks = new ArrayList<>();

		for (String song : list)
		{
			tracks.add(trackService.findByName(song));
		}

		return new ResponseEntity<>(tracks, HttpStatus.OK);
	}

	// DELETE - localhost:2019/tracks/remove/{trackid}
	// removes track from saved
	@DeleteMapping(value = "/remove/{trackid}")
	public ResponseEntity<?> deleteTrack(@PathVariable String trackid,
										 Authentication authentication)
	{
		// authenticates current user
		String username = ((UserDetails)(authentication.getPrincipal())).getUsername();
		User user = userService.findByName(username);

		trackService.deleteTrack(trackid, user.getUserid());
		return new ResponseEntity<>(null, HttpStatus.OK);
	}
}