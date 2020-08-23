package racingcar.domain;

import java.util.Objects;

public class Position {
    private int position;

    public Position(int position) {
        if(position < 0) {
            throw new IllegalArgumentException("포지션은 0 이상이어야 합니다.");
        }
        this.position = position;
    }

    public Position move() {
        position = position + 1;
        return this;
    }

    public boolean isWinner(int maxPosition) {
        return this.position == maxPosition;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}