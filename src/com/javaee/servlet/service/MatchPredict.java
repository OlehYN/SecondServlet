package com.javaee.servlet.service;

import java.util.Random;

import com.javaee.servlet.dto.Prediction;

public class MatchPredict {

	private static final String[] phrases = { "Рівна гра", "Тотальне знищення", "Вот би пошвидше забути цю гру",
			"Що це було взагалі таке?", "У дворі і то цікавіші матчі" };

	public Prediction getPrediction(String homeTeam, String guestTeam) {
		Prediction prediction = new Prediction();
		prediction.setHomeTeam(homeTeam);
		prediction.setGuestTeam(guestTeam);

		Random r = new Random();

		int homeGoals = getGoals(r.nextInt(100));
		int guestGoals = getGoals(r.nextInt(100));

		prediction.setHomeGoals(homeGoals);
		prediction.setGuestGoals(guestGoals);

		prediction.setDescription(phrases[r.nextInt(phrases.length)]);

		return prediction;
	}

	private int getGoals(int score) {
		if (score >= 0 && score <= 35)
			return 0;
		else if (score > 35 && score <= 50)
			return 1;
		else if (score > 50 && score <= 75)
			return 2;
		else if (score > 75 && score <= 90)
			return 3;
		else if (score > 90 && score <= 95)
			return 4;
		return 5;
	}

}
