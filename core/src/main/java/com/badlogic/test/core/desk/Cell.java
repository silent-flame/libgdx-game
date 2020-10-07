package com.badlogic.test.core.desk;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Cell {
    private final SpriteBatch batch;
    private final Texture texture;
    private final int column;
    private final int row;


    public Cell(SpriteBatch batch, Texture texture, int column, int row) {
        this.batch = batch;
        this.texture = texture;
        this.column = column;
        this.row = row;
    }

    public void draw() {
        batch.draw(texture, 20, 20);
    }
}