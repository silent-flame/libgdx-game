package com.badlogic.test.core.desk;

import lombok.Getter;

/**
 * Позиция в системе координат смещения
 * https://habr.com/ru/post/319644/
 */

@Getter
public class OffsetPoint {
    private final int column;
    private final int row;
//    private final CubicPoint cubicPoint;

    public OffsetPoint(int column, int row) {
        this.column = column;
        this.row = row;
//        this.cubicPoint = CubicPoint.byOffset(column, row);

    }

    public static OffsetPoint byCubic(int x, int y, int z) {
        int column = x + (z + z & 1) / 2;
        int row = z;
        return new OffsetPoint(column, row);
    }
}
