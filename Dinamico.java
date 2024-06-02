abstract class Piece {
    public abstract void move(byte X, byte Y);
}

class Bishop extends Piece {
    @Override
    public void move(byte X, byte Y) {
        System.out.println("Bishop moves to " + X + ", " + Y);
    }
}

class Knight extends Piece {
    @Override
    public void move(byte X, byte Y) {
        System.out.println("Knight moves to " + X + ", " + Y);
    }
}

public class Chess {
    public static void main(String[] args) {
        Piece bishop = new Bishop();
        Piece knight = new Knight();
        bishop.move((byte)3, (byte)5); // Outputs "Bishop moves to 3, 5"
        knight.move((byte)2, (byte)7); // Outputs "Knight moves to 2, 7"
    }
}
