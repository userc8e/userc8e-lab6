import java.util.Random;
public class TypeA extends Thing {
    public TypeA(int row, int col, char lab) {
        super(row, col, lab);
    }

    @Override
    public void maybeTurn(Random rand) {
        int i = rand.nextInt(3);
        if (i == 1) {
            super.rightTurn();
        }

        if (i == 2) {
            super.leftTurn();
        }
    }
}
