package com.airsoft.game;

import com.airsoft.game.battleroyale.BattleRoyaleDAO;
import com.airsoft.game.battleroyale.model.BattleRoyaleGame;
import com.airsoft.game.battleroyale.common.LatLongPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class BattleRoyaleApplication implements CommandLineRunner {

	@Autowired
	BattleRoyaleDAO battleRoyaleDao;

	public static void main(String[] args) {
		SpringApplication.run(BattleRoyaleApplication.class, args);
	}

	//for initial capability, we'll stand up one single game and have the server manage it all in memory
	@Override
	public void run(String... args) throws Exception {

		BattleRoyaleGame battleRoyaleGame = new BattleRoyaleGame();
		battleRoyaleGame.setGameId("test");
		battleRoyaleGame.setStartTime(Instant.now());
		//10 minutes
		battleRoyaleGame.setMillisDuration(30000);


		/*
		clockwise points wilson's, closed by repeating first point as last point
		 */
		List<LatLongPoint> gameBoundary = Arrays.asList(
				new LatLongPoint(38.896042, -77.619991),
				new LatLongPoint(38.896314, -77.622553),
				new LatLongPoint(38.897729, -77.622364),
				new LatLongPoint(38.897342, -77.621026),
				new LatLongPoint(38.896806, -77.619754),
				new LatLongPoint(38.896042, -77.619991)
		);
		battleRoyaleGame.setGameBoundary(gameBoundary);

		battleRoyaleDao.saveBattleRoyaleState(battleRoyaleGame);
	}
}
