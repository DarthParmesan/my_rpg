package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.game.screens.TestScreen;

public class Main extends Game {

	protected TestScreen _testScreen;

	@Override
	public void create () {
		_testScreen = new TestScreen();
		setScreen(_testScreen);
	}

	@Override
	public void dispose () {

	}
}
