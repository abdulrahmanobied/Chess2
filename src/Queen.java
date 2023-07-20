class Queen extends Piece {
    public Queen(String imagePath, int file, int rank, boolean isWhite) {
        super(imagePath, file, rank, isWhite);
    }

    @Override
    public boolean isMoveValid(int targetFile, int targetRank) {
        int fileDifference = Math.abs(targetFile - getFile());
        int rankDifference = Math.abs(targetRank - getRank());

        // Check if the move is along a straight line or a diagonal
        return targetFile == getFile() || targetRank == getRank() || fileDifference == rankDifference;
    }
}
