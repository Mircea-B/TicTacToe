public class Player {

  String nume;
  Board.Mark symbol;


  public Player(String nume, Board.Mark symbol) {
    this.nume = nume;
    this.symbol = symbol;
  }

  public Board.Mark getSymbol() {
    return symbol;
  }

  @Override
  public String toString(){

    return (nume+ " "+ symbol);

  }

}
