package com.badlogic.test.core.desk;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;
import java.util.List;

public class Screen {
    private final List<Cell> board;

    public Screen(SpriteBatch batch) {

        this.board = new ArrayList<>();
        for (int row = 0; row < 7; row++) {
            for (int column = 0; column < 4 + (row & 1); column++) {
                board.add(new Cell(batch, column, row));
            }
        }
    }

    public void draw() {
        board.forEach(Cell::draw);
    }
}
