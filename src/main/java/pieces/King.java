package pieces;

import game_logic.ChessGameBoard;
import services.ChessGamePiece;

import javax.swing.ImageIcon;
import java.util.ArrayList;
// -------------------------------------------------------------------------
/**
 * Represents a pieces.King game piece.
 *
 * @author Ben Katz (bakatz)
 * @author Myles David II (davidmm2)
 * @author Danielle Bushrow (dbushrow)
 * @version 2010.11.17
 */
public class King
    extends ChessGamePiece {
    // ----------------------------------------------------------
    /**
     * Create a new pieces.King object.
     *
     * @param board
     *            the board to create the king on
     * @param row
     *            the row to create the king on
     * @param col
     *            the column to create the king on
     * @param color
     *            either GamePiece.WHITE, BLACK, or UNASSIGNED
     */
    public King(ChessGameBoard board, int row, int col, int color ){
        super( board, row, col, color, false );
    }
    /**
     * Calculates the possible moves for this piece. These are ALL the possible
     * moves, including illegal (but at the same time valid) moves.
     *
     * @param board
     *            the game board to calculate moves on
     * @return ArrayList<String> the moves
     */
    @Override
    protected ArrayList<String> calculatePossibleMoves( ChessGameBoard board ){
        ArrayList<String> northEastMovesKing = calculateNorthEastMoves( board, 1 );
        ArrayList<String> northWestMovesKing = calculateNorthWestMoves( board, 1 );
        ArrayList<String> southEastMovesKing = calculateSouthEastMoves( board, 1 );
        ArrayList<String> southWestMovesKing = calculateSouthWestMoves( board, 1 );
        ArrayList<String> northMovesKing = calculateNorthMoves( board, 1 );
        ArrayList<String> southMovesKing = calculateSouthMoves( board, 1 );
        ArrayList<String> eastMovesKing = calculateEastMoves( board, 1 );
        ArrayList<String> westMovesKing = calculateWestMoves( board, 1 );
        ArrayList<String> allMovesKing = new ArrayList<>();
        allMovesKing.addAll( northEastMovesKing );
        allMovesKing.addAll( northWestMovesKing );
        allMovesKing.addAll( southEastMovesKing );
        allMovesKing.addAll( southWestMovesKing );
        allMovesKing.addAll( northMovesKing );
        allMovesKing.addAll( southMovesKing );
        allMovesKing.addAll( eastMovesKing );
        allMovesKing.addAll( westMovesKing );
        return allMovesKing;
    }
    /**
     * Determines if this pieces.King is checked.
     *
     * @param board
     *            the board to check on
     * @return true if checked, false if not checked
     */
    public boolean isChecked( ChessGameBoard board ){
        return !getCurrentAttackers( board ).isEmpty();
    }
    /**
     * Creates an icon for this piece depending on the piece's color.
     *
     * @return ImageIcon the ImageIcon representation of this piece.
     */
    @Override
    public ImageIcon createImageByPieceType(){
        if ( getColorOfPiece() == ChessGamePiece.WHITE ){
            return new ImageIcon(
                getClass().getResource("../chessImages/WhiteKing.gif")
            );            
        }
        else if ( getColorOfPiece() == ChessGamePiece.BLACK ){
            return new ImageIcon(
                getClass().getResource("../chessImages/BlackKing.gif" )
            );            
        }
        else
        {
            return new ImageIcon(
                getClass().getResource("../chessImages/default-Unassigned.gif" )
            );            
        }
    }
}
