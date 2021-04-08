package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import sun.security.util.AuthResources_fr;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	FireBaseInterface _FBIC;
	DataHolderClass dataHolder;


	public MyGdxGame(FireBaseInterface FBIC)
	{
		_FBIC = FBIC;
	}

	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		dataHolder = new DataHolderClass();
		System.out.println("sup");
		_FBIC.SomeFunction();
		_FBIC.FirstFireBaseTest();
		_FBIC.SetOnValueChangedListener(dataHolder);
		_FBIC.SetValueInDb("message", "this is new text");
		_FBIC.SetValueInDb("message2", "this is new text");

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();

	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
