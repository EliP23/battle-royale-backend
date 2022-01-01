package com.airsoft.game;

import com.airsoft.game.battleroyale.BattleRoyaleState;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BattleRoyaleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BattleRoyaleApplication.class, args);
	}

	//for initial capability, we'll stand up one single game and have the server manage it all in memory
	@Override
	public void run(String... args) throws Exception {

		BattleRoyaleState battleRoyaleState = new BattleRoyaleState();

	}
}
