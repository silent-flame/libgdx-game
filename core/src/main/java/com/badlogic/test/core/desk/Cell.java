package com.badlogic.test.core.desk;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import static com.badlogic.test.core.desk.Constants.SCALE;

public class Cell {
    private final SpriteBatch batch;
    private final Texture texture;
    private final CubicPoint position;


    public Cell(SpriteBatch batch, int column, int row) {
        this.batch = batch;
        this.texture = new Texture(Gdx.files.internal("hexCells/tileset-sliced/4.png"));
        this.position = CubicPoint.byOffset(column, row);
    }

    public void draw() {
        OffsetPoint offset = OffsetPoint.byCubic(position.getX(), position.getY(), position.getZ());
        int margin = texture.getWidth() * SCALE;
        int offsetForFirstRow = texture.getWidth() * SCALE / 2;
        int border = 20;
        float x = margin + (1 - offset.getRow() & 1) * (offsetForFirstRow + border / 2) + offset.getColumn() * (texture.getWidth() * SCALE + border);
        float y = margin + offset.getRow() * (texture.getHeight() * SCALE + border) / 1.4F;
        batch.draw(texture, x, y, texture.getWidth() * SCALE, texture.getHeight() * SCALE);
    }
}