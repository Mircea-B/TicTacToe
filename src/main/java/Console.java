import java.util.Scanner;

public class Console extends Arbitru {

  Scanner buffer=new Scanner(System.in);

  public Console(Player p1, Player p2) {
    super(p1, p2);
    this.buffer = buffer;
  }


  // varianta corecta va trebui sa fie cu o bucla repetitiva
  public int[] getCooord() {

      int i=buffer.nextInt();
      int j=buffer.nextInt();
    return new int[]{i,j};
    }

  }

