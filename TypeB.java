import java.util.Random;

public class TypeB extends Thing {
    public int timeSinceLast;

    public TypeB(int row, int col, char lab) {
        super(row, col, lab);
        timeSinceLast = 0;
    }

    @Override
    public void maybeTurn(Random rand) {
        int i = rand.nextInt(3);
        timeSinceLast++;
         if (timeSinceLast == 10) {
            timeSinceLast = 0;
            if (i == 1) {
               super.rightTurn();
            }

            if (i == 2) {
               super.leftTurn();
            }
         }
    }
}
