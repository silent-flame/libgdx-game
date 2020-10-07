package com.badlogic.test.core.desk;


import com.badlogic.test.core.exception.ValidationException;
import lombok.Getter;

/**
 * Позиция в кубической системе координат
 * https://habr.com/ru/post/319644/
 */
@Getter
public class CubicPoint {
    private final int x;
    private final int y;
    private final int z;
//    private OffsetPoint offsetPoint;

    public CubicPoint(int x, int y, int z) {
        if (x + y + z != 0) {
            throw new ValidationException();
        }
        this.x = x;
        this.y = y;
        this.z = z;
//        this.offsetPoint = OffsetPoint.byCubic(x, y, z);

    }

    public static CubicPoint byOffset(int column, int row) {
        int x = column - (row + row & 1) / 2;
        int z = row;
        int y = -x - z;
        return new CubicPoint(x, y, z);
    }

    public OffsetPoint toOffset() {
        return OffsetPoint.byCubic(x, y, z);
    }
}