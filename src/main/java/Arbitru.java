public abstract class Arbitru implements Readable {

  boolean xTurn;
  Board table;
  Player p1;
  Player p2;


  public Arbitru(Player p1, Player p2) {
    table = new Board();
    this.p1 = p1;
    this.p2 = p2;
    this.xTurn=true;
  }

  @Override
  public String toString(){
    return "first player :" + p1 + "\n" +"player 2 : " + p2;
  }

  public void start(){
    while (true){
      int coord[]=getCooord();
      table.move(coord[0],coord[1],xTurn? Board.Mark.MARK_X: Board.Mark.MARK_0);
      if(xTurn == true){
        xTurn=false;
      };
      System.out.println(table);

    }



  }




}
