import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Chess");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);
            frame.setLocationRelativeTo(null);

            Board board = new Board();
            frame.add(board);

            // Add the pieces to the board
            board.addPiece(new Pawn("C:\\Users\\User\\Downloads\\chess2\\white_pawn.png", 0, 6, true));
            board.addPiece(new Pawn("C:\\Users\\User\\Downloads\\chess2\\white_pawn.png", 1, 6, true));
            board.addPiece(new Pawn("C:\\Users\\User\\Downloads\\chess2\\white_pawn.png", 2, 6, true));
            board.addPiece(new Pawn("C:\\Users\\User\\Downloads\\chess2\\white_pawn.png", 3, 6, true));
            board.addPiece(new Pawn("C:\\Users\\User\\Downloads\\chess2\\white_pawn.png", 4, 6, true));
            board.addPiece(new Pawn("C:\\Users\\User\\Downloads\\chess2\\white_pawn.png", 5, 6, true));
            board.addPiece(new Pawn("C:\\Users\\User\\Downloads\\chess2\\white_pawn.png", 6, 6, true));
            board.addPiece(new Pawn("C:\\Users\\User\\Downloads\\chess2\\white_pawn.png", 7, 6, true));

            board.addPiece(new King("C:/Users/User/Downloads/chess2/white_king.png", 4, 7, true));
            board.addPiece(new Queen("C:\\Users\\User\\Downloads\\chess2\\white_queen.png", 3, 7, true));
            board.addPiece(new Knight("C:\\Users\\User\\Downloads\\chess2\\white_knight.png", 1, 7, true));
            board.addPiece(new Knight("C:\\Users\\User\\Downloads\\chess2\\white_knight.png", 6, 7, true));
            board.addPiece(new Bishop("C:\\Users\\User\\Downloads\\chess2\\white_bishop.png", 2, 7, true));
            board.addPiece(new Bishop("C:\\Users\\User\\Downloads\\chess2\\white_bishop.png", 5, 7, true));
            board.addPiece(new Rook("C:\\Users\\User\\Downloads\\chess2\\white_rook.png", 0, 7, true));
            board.addPiece(new Rook("C:\\Users\\User\\Downloads\\chess2\\white_rook.png", 7, 7, true));

            board.addPiece(new Pawn("C:\\Users\\User\\Downloads\\chess2\\black_pawn.png", 0, 1, false));
            board.addPiece(new Pawn("C:\\Users\\User\\Downloads\\chess2\\black_pawn.png", 1, 1, false));
            board.addPiece(new Pawn("C:\\Users\\User\\Downloads\\chess2\\black_pawn.png", 2, 1, false));
            board.addPiece(new Pawn("C:\\Users\\User\\Downloads\\chess2\\black_pawn.png", 3, 1, false));
            board.addPiece(new Pawn("C:\\Users\\User\\Downloads\\chess2\\black_pawn.png", 4, 1, false));
            board.addPiece(new Pawn("C:\\Users\\User\\Downloads\\chess2\\black_pawn.png", 5, 1, false));
            board.addPiece(new Pawn("C:\\Users\\User\\Downloads\\chess2\\black_pawn.png", 6, 1, false));
            board.addPiece(new Pawn("C:\\Users\\User\\Downloads\\chess2\\black_pawn.png", 7, 1, false));

            board.addPiece(new King("C:\\Users\\User\\Downloads\\chess2\\black_king.png", 4, 0, false));
            board.addPiece(new Queen("C:\\Users\\User\\Downloads\\chess2\\black_queen.png", 3, 0, false));
            board.addPiece(new Knight("C:\\Users\\User\\Downloads\\chess2\\black_knight.png", 1, 0, false));
            board.addPiece(new Knight("C:\\Users\\User\\Downloads\\chess2\\black_knight.png", 6, 0, false));
            board.addPiece(new Bishop("C:\\Users\\User\\Downloads\\chess2\\black_bishop.png", 2, 0, false));
            board.addPiece(new Bishop("C:\\Users\\User\\Downloads\\chess2\\black_bishop.png", 5, 0, false));
            board.addPiece(new Rook("C:\\Users\\User\\Downloads\\chess2\\black_rook.png", 0, 0, false));
            board.addPiece(new Rook("C:\\Users\\User\\Downloads\\chess2\\black_rook.png", 7, 0, false));

            frame.setVisible(true);
        });
    }
}



