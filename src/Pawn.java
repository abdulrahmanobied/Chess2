class Pawn extends Piece {
    public Pawn(String imagePath, int file, int rank, boolean isWhite) {
        super(imagePath, file, rank, isWhite);
    }

    @Override
    public boolean isMoveValid(int targetFile, int targetRank) {
        int fileDifference = Math.abs(targetFile - getFile());
        int rankDifference = targetRank - getRank();

        // Check if the move is forward
        boolean isWhite = false;
        if (isWhite && rankDifference == -1) {
            // Move is valid if the target position is empty
            return fileDifference == 0;
        } else if (!isWhite && rankDifference == 1) {
            // Move is valid if the target position is empty
            return fileDifference == 0;
        }

        // Invalid move
        return false;
    }
}