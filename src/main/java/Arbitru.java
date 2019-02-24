public abstract class Arbitru implements Readable {

  boolean xTurn;
  Board table;
  Player p1;
  Player p2;


  public Arbitru(Player p1, Player p2) {
    table = new Board();
    this.p1 = p1;
    this.p2 = p2;
    this.xTurn = true;
  }

  @Override
  public String toString() {
    return "first player :" + p1 + "\n" + "player 2 : " + p2;
  }

  public void start() {
    if (table.getWinner() == Board.Mark.MARK_EMPTY) {
      while (true) {
        int coord[] = getCooord();
        if (xTurn == true) {
          table.move(coord[0], coord[1], xTurn ? Board.Mark.MARK_X : Board.Mark.MARK_0);
          xTurn = false;
        } else {
          table.move(coord[1], coord[0], xTurn ? Board.Mark.MARK_X : Board.Mark.MARK_0);
          xTurn = true;
        }
        System.out.println(table);
      }
    }
    table.getWinner();
  }

}


