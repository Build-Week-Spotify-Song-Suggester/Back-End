package com.lambdaschool.spotifysongsuggester.repository;

import com.lambdaschool.spotifysongsuggester.models.Recommendations;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface RecommendationsRepository extends CrudRepository<Recommendations, String>
{
	@Query(value = "SELECT * FROM recommendations WHERE searched_song = :id", nativeQuery = true)
	Recommendations findBySuggestedsongid(String id);
}