package com.mygdx.game.screens;

import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.Viewport;

public abstract class MyScreen implements Screen {

    protected ShapeRenderer _sr;
    protected SpriteBatch _batch;

    protected OrthographicCamera _camera;
    protected Viewport _viewport;

    protected InputMultiplexer _inputMultiplexer;

    public MyScreen() {
        _inputMultiplexer = new InputMultiplexer();
    }

    public void clearScreen() {
        ScreenUtils.clear(Color.MAGENTA);
    }

}
