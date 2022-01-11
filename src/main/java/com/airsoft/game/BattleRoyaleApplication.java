package com.airsoft.game;

import com.airsoft.game.battleroyale.BattleRoyaleDAO;
import com.airsoft.game.battleroyale.model.BattleRoyaleGame;
import com.airsoft.game.battleroyale.common.LatLongPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EnableSwagger2
public class BattleRoyaleApplication implements CommandLineRunner {

	@Autowired
	BattleRoyaleDAO battleRoyaleDao;

	public static void main(String[] args) {
		SpringApplication.run(BattleRoyaleApplication.class, args);
	}

	//for initial capability, we'll stand up one single game and have the server manage it all in memory
	@Override
	public void run(String... args) {

		BattleRoyaleGame battleRoyaleGame = new BattleRoyaleGame();
		battleRoyaleGame.setGameId("1");
		battleRoyaleGame.setGameName("wilson field");
		battleRoyaleGame.setStartTime(Instant.now());
		//10 minutes
		battleRoyaleGame.setMillisDuration(30000);


		/*
		clockwise points wilson's
		 */
		List<LatLongPoint> gameBoundary = Arrays.asList(
				new LatLongPoint(38.896042, -77.619991),
				new LatLongPoint(38.896314, -77.622553),
				new LatLongPoint(38.897729, -77.622364),
				new LatLongPoint(38.897342, -77.621026),
				new LatLongPoint(38.896806, -77.619754)
		);

		battleRoyaleGame.setGameBoundary(gameBoundary);

		List<LatLongPoint> safeZone = Arrays.asList(
				new LatLongPoint(38.897045, -77.621532),
				new LatLongPoint(38.896600, -77.621453),
				new LatLongPoint(38.896579, -77.620817),
				new LatLongPoint(38.896919, -77.620555)
		);

		battleRoyaleGame.setSafeZone(safeZone);
		battleRoyaleGame.setRunning(false);
		battleRoyaleGame.setStartTime(null);

		battleRoyaleDao.saveBattleRoyaleState(battleRoyaleGame);
	}

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.airsoft.game")).build();
	}
}
