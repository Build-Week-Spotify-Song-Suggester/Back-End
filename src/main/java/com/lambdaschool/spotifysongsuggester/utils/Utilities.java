package com.lambdaschool.spotifysongsuggester.utils;

import com.lambdaschool.spotifysongsuggester.models.Recommendations;

import java.util.ArrayList;
import java.util.List;

public class Utilities
{
	public static List<String> convertToList(Recommendations recommendations)
	{
		ArrayList<String> songs = new ArrayList<>();

		if (recommendations.getNearest_song1() != null)
		{
			songs.add(recommendations.getNearest_song1());
		}

		if (recommendations.getNearest_song2() != null)
		{
			songs.add(recommendations.getNearest_song2());
		}

		if (recommendations.getNearest_song3() != null)
		{
			songs.add(recommendations.getNearest_song3());
		}

		if (recommendations.getNearest_song4() != null)
		{
			songs.add(recommendations.getNearest_song4());
		}

		if (recommendations.getNearest_song5() != null)
		{
			songs.add(recommendations.getNearest_song5());
		}

		if (recommendations.getNearest_song6() != null)
		{
			songs.add(recommendations.getNearest_song6());
		}

		if (recommendations.getNearest_song7() != null)
		{
			songs.add(recommendations.getNearest_song7());
		}

		if (recommendations.getNearest_song8() != null)
		{
			songs.add(recommendations.getNearest_song8());
		}

		if (recommendations.getNearest_song9() != null)
		{
			songs.add(recommendations.getNearest_song9());
		}

		if (recommendations.getNearest_song10() != null)
		{
			songs.add(recommendations.getNearest_song10());
		}

		return songs;
	}
}
