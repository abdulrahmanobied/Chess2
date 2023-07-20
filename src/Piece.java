import java.awt.*;

abstract class Piece {
    private Image image;
    private int file;
    private int rank;
    private boolean isWhite;

    public Piece(String imagePath, int file, int rank, boolean isWhite) {
        this.image = Toolkit.getDefaultToolkit().getImage(imagePath);
        this.file = file;
        this.rank = rank;
        this.isWhite = isWhite;
    }

    public int getFile() {
        return file;
    }

    public int getRank() {
        return rank;
    }

    public void setPosition(int file, int rank) {
        this.file = file;
        this.rank = rank;
    }

    public abstract boolean isMoveValid(int targetFile, int targetRank);

    public void draw(Graphics2D g2d, int squareSize) {
        int x = file * squareSize;
        int y = rank * squareSize;
        g2d.drawImage(image, x, y, squareSize, squareSize, null);
    }
}