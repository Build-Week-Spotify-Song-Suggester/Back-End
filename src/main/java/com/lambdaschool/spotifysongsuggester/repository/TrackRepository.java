package com.lambdaschool.spotifysongsuggester.repository;

import com.lambdaschool.spotifysongsuggester.models.Track;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

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
}
