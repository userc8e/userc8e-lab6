import java.util.Random;
public abstract class Thing {
    protected int row;
    protected int col;
    protected int dir;
    protected char lab;

    protected Thing(int row, int col, char lab) {
        this.row = row;
        this.col = col;
        this.lab = lab;
    }

    public void rightTurn() {
        dir = (dir + 1) % 4;
    }

    public void leftTurn() {
        dir = (dir + 3) % 4;
    }

    public abstract void maybeTurn(Random rand);

    public void step() {
        final int[] dc = {
            0, 1, 0, -1
        }, dr = {
            1, 0, -1, 0
        };
        row += dr[dir];
        col += dc[dir];
    }


    // GETTERS
    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public char getLab() {
        return lab;
    }


    // TOSTRING() METHOD
    @Override
    public String toString() {
        return row + " " + col + " " + lab;
    }
}
