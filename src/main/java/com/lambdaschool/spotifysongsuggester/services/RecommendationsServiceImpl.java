package com.lambdaschool.spotifysongsuggester.services;

import com.lambdaschool.spotifysongsuggester.models.Recommendations;
import com.lambdaschool.spotifysongsuggester.repository.RecommendationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service(value = "recommendationsService")
public class RecommendationsServiceImpl implements RecommendationsService
{
	@Autowired
	RecommendationsRepository recommendationsRepository;

	@Override
	public Recommendations findBySuggestedsongid(String id)
	{
		return recommendationsRepository.findBySuggestedsongid(id);
	}
}
