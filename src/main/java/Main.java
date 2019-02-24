public class Main {


  public static void main(String[] args) {
  //  Board x= new Board();
    Player p1=new Player("Cristi", Board.Mark.MARK_X);
    Player p2=new Player("Mircea", Board.Mark.MARK_0);
    Arbitru arbitru = new Console(p1,p2);

    System.out.println(p1.toString());
    System.out.println(p2.toString());
    System.out.println(arbitru.toString());
   arbitru.start();







  }




}
