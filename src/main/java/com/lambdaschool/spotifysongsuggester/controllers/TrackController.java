package com.lambdaschool.spotifysongsuggester.controllers;

import com.lambdaschool.spotifysongsuggester.models.Track;
import com.lambdaschool.spotifysongsuggester.services.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	// GET - localhost:2019/

	// POST - localhost:2019/tracks/track/:name
	@PostMapping(value = "/track/saved/{trackid}", produces = {"application/json"})
	public ResponseEntity<?> saveTrack(@RequestBody String trackid) {

		return new ResponseEntity<>(null, HttpStatus.CREATED);
	}

}
