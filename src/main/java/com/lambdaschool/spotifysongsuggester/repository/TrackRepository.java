package com.lambdaschool.spotifysongsuggester.repository;

import com.lambdaschool.spotifysongsuggester.models.Track;
import com.lambdaschool.spotifysongsuggester.models.UserTrack;
import com.lambdaschool.spotifysongsuggester.view.TrackRecs;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.ArrayList;
import java.util.List;

public interface TrackRepository extends PagingAndSortingRepository<Track, Long>
{
	Track findByTrackid(String name);

	@Query(value = "SELECT trackid FROM usertracks WHERE userid = :id", nativeQuery = true)
	List<String> findTracksByUserid(long id);

	@Modifying
	@Query(value = "INSERT INTO usertracks (userid, trackid) VALUES (:userid, :trackid)", nativeQuery = true)
	void saveTrack(String trackid, long userid);

	@Modifying
	@Query(value = "DELETE FROM usertracks WHERE trackid = :trackid AND userid = :userid", nativeQuery = true)
	void deleteTrack(String trackid, long userid);

//	@Query(value = "SELECT s.Track_Id, r.Searched_Song, r.Nearest_Song1, r.Nearest_Song2, r.Nearest_Song3, r.Nearest_Song4, r.Nearest_Song5, r.Nearest_Song6, r.Nearest_Song7, r.Nearest_Song8, r.Nearest_Song9, r.Nearest_Song10 FROM track_features s LEFT JOIN recommendations r ON s.Track_ID = r.Searched_Song ORDER BY s.Track_Id",
//		   nativeQuery = true)
//	ArrayList<TrackRecs> getTrackRecs();
}
