import java.util.Random;

public class TypeC extends Thing {
    public TypeC(int row, int col, char lab) {
        super(row, col, lab);
    }

    @Override
    public void maybeTurn(Random rand) {
        int i = rand.nextInt(3);
        if (i == 1) {
            super.rightTurn();
        } else {
            super.leftTurn();
        }
    }
}
