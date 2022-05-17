package ai;

import InternationalChess.engine.classic.board.Board;
import InternationalChess.engine.classic.board.Move;

public interface MoveStrategy {

    long getNumBoardsEvaluated();

    Move execute(Board board);

}
