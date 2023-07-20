class Rook extends Piece {
    public Rook(String imagePath, int file, int rank, boolean isWhite) {
        super(imagePath, file, rank, isWhite);
    }

    @Override
    public boolean isMoveValid(int targetFile, int targetRank) {
        int fileDifference = Math.abs(targetFile - getFile());
        int rankDifference = Math.abs(targetRank - getRank());

        // Check if the move is along a straight line (horizontal or vertical)
        return (getFile() == targetFile && getRank() != targetRank)
                || (getFile() != targetFile && getRank() == targetRank);
    }
}

