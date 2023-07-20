class Knight extends Piece {
    public Knight(String imagePath, int file, int rank, boolean isWhite) {
        super(imagePath, file, rank, isWhite);
    }

    @Override
    public boolean isMoveValid(int targetFile, int targetRank) {
        int fileDifference = Math.abs(targetFile - getFile());
        int rankDifference = Math.abs(targetRank - getRank());

        // Check if the move is an L-shape (2 squares in one direction and 1 square in another)
        return (fileDifference == 2 && rankDifference == 1) || (fileDifference == 1 && rankDifference == 2);
    }
}
