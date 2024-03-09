package TicTacToe.App;

import TicTacToe.Game.Game;
import TicTacToe.Player.Player;
import TicTacToe.board.Board;

public class App {
    public static void main(String[] args) throws Exception {
      System.out.println("First Project -> Tic Tac Toe");

      Board b = new Board(3, '-');
    

      Player p1 = new Player();
      p1.setPlayerNameAndSymbol("Ravi", 'X');
      p1.getPlayerNameAndSymbol();

      Player p2 = new Player();
      p2.setPlayerNameAndSymbol("Akash", 'O');
      p2.getPlayerNameAndSymbol();

      Game game  = new Game(new Player[] {p1, p2}, b);
      game.play();

   }

}
