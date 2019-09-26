package com.lambdaschool.spotifysongsuggester.services;

import com.lambdaschool.spotifysongsuggester.models.Recommendations;

public interface RecommendationsService
{
	Recommendations findBySuggestedsongid(String id);
}
