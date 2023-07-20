import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

public class Board extends JPanel {
    private Color lightCol; // Color for light squares
    private Color darkCol; // Color for dark squares
    private final int squareSize = 50; // Size of each square
    private List<Piece> pieces; // List to store the pieces
    private Piece selectedPiece; // Currently selected piece

    public Board() {
        lightCol = Color.WHITE;
        darkCol = new Color(173, 194, 230); // Set darkCol to light blue color
        pieces = new ArrayList<>(); // Initialize the list of pieces

        // Add mouse listener to handle piece movement
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int file = e.getX() / squareSize;
                int rank = e.getY() / squareSize;

                // Check if a piece is selected
                if (selectedPiece == null) {
                    selectedPiece = getPieceAtPosition(file, rank);
                } else {
                    // Try to move the selected piece
                    moveSelectedPiece(file, rank);
                    selectedPiece = null;
                }

                repaint();
            }
        });
    }

    private Piece getPieceAtPosition(int file, int rank) {
        for (Piece piece : pieces) {
            if (piece.getFile() == file && piece.getRank() == rank) {
                return piece;
            }
        }
        return null;
    }

    private void moveSelectedPiece(int file, int rank) {
        if (selectedPiece != null) {
            selectedPiece.setPosition(file, rank);
        }
    }

    public void addPiece(Piece piece) {
        pieces.add(piece);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        for (int file = 0; file < 8; file++) {
            for (int rank = 0; rank < 8; rank++) {
                boolean isLightSquare = (file + rank) % 2 != 0;
                Color squareColor = (isLightSquare) ? lightCol : darkCol;
                int x = file * squareSize;
                int y = rank * squareSize;

                Rectangle2D square = new Rectangle2D.Double(x, y, squareSize, squareSize);
                g2d.setPaint(squareColor);
                g2d.fill(square);
            }
        }

        for (Piece piece : pieces) {
            piece.draw(g2d, squareSize);
        }

        // Highlight the selected piece
        if (selectedPiece != null) {
            int x = selectedPiece.getFile() * squareSize;
            int y = selectedPiece.getRank() * squareSize;
            g2d.setColor(Color.GREEN);
            g2d.setStroke(new BasicStroke(3));
            g2d.drawRect(x, y, squareSize, squareSize);
        }
    }
}