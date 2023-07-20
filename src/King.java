class King extends Piece {
    public King(String imagePath, int file, int rank, boolean isWhite) {
        super(imagePath, file, rank, isWhite);
    }

    @Override
    public boolean isMoveValid(int targetFile, int targetRank) {
        int fileDifference = Math.abs(targetFile - getFile());
        int rankDifference = Math.abs(targetRank - getRank());

        // Check if the move is one square in any direction
        return fileDifference <= 1 && rankDifference <= 1;
    }
}
