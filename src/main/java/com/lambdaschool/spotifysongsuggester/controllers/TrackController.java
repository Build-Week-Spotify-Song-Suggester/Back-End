package com.lambdaschool.spotifysongsuggester.controllers;

import com.lambdaschool.spotifysongsuggester.models.Track;
import com.lambdaschool.spotifysongsuggester.models.User;
import com.lambdaschool.spotifysongsuggester.models.UserTrack;
import com.lambdaschool.spotifysongsuggester.services.TrackService;
import com.lambdaschool.spotifysongsuggester.services.UserService;
import com.lambdaschool.spotifysongsuggester.view.TrackRecs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tracks")
public class TrackController
{
	@Autowired
	private TrackService trackService;

	@Autowired
	private UserService userService;

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

	// GET - localhost:2019/tracks/track/rec/:name
//	@GetMapping(value = "/track/recs/:name", produces = {"application/json"})
//	public ResponseEntity<?> getTrackRecs(
//			@PageableDefault(page = 0,
//						    size = 10)
//					Pageable pageable)
//	{
//		Track tt = trackService.findByName(name);
//		return new ResponseEntity<>(tt, HttpStatus.OK);
//		ArrayList<TrackRecs> myList = trackService.getTrackRecs();
//		return new ResponseEntity<>(myList, HttpStatus.OK);
//	}

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
}