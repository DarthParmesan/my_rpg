package com.mygdx.game;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.mygdx.game.Main;

import static com.mygdx.game.Constants.*;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration cfg = new Lwjgl3ApplicationConfiguration();
		cfg.setForegroundFPS(60);
		cfg.setTitle("my_rpg");

		cfg.setResizable(RESIZEABLE);
		cfg.setWindowedMode(SCREEN_WIDTH, SCREEN_HEIGHT);

		new Lwjgl3Application(new Main(), cfg);
	}
}
