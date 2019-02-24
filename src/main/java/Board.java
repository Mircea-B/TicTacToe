
public class Board {

  public enum Mark {

    MARK_X {
      @Override
      public String toString() {
        return "X";
      }
    },
    MARK_0 {
      @Override
      public String toString() {
        return "0";
      }
    },
    MARK_EMPTY {
      public String toString() {
        return "_";
      }
    };
  }

  private Mark table[][];

  public Board() {
    int i = 0;
    int z = 0;
    table = new Mark[3][3];
    for (i = 0; i < 3; i++) {
      for (z = 0; z < 3; z++) {
        table[i][z] = Mark.MARK_EMPTY;
      }
    }
  }

  @Override
  public String toString() {
    StringBuilder adunare = new StringBuilder("");
    StringBuilder test = new StringBuilder("");
    for (int i = 0; i < 3; ++i) {
      for (int z = 0; z < 3; z++) {
        adunare = adunare.append(table[i][z] + " ");
      }
      adunare = adunare.append("\n");
    }
    return adunare.toString();
  }


  public void move(int coord, int coord1, Mark simbol) {

    if (table[coord][coord1] == Mark.MARK_EMPTY) {
      table[coord][coord1] = simbol;

    }
  }

  public Mark getWinner() {

    Mark result=Mark.MARK_EMPTY;
    for (int i = 0; i < 3; ++i) {
      for (int j = 0; j < 3; ++j) {
        if (table[0][j] == Mark.MARK_0 && table[1][j] == Mark.MARK_0 && table[2][j] == Mark.MARK_0) {
          result=Mark.MARK_0;
        }
        if (table[i][0] == Mark.MARK_0 && table[i][1] == Mark.MARK_0 && table[i][2] == Mark.MARK_0) {
          result=Mark.MARK_0;
        }
        if (table[0][j] == Mark.MARK_0 && table[1][j] == Mark.MARK_0 && table[2][j] == Mark.MARK_0) {
          result=Mark.MARK_0;
        }

        if (table[0][j] == Mark.MARK_X && table[1][j] == Mark.MARK_X && table[2][j] == Mark.MARK_X) {
          result=Mark.MARK_X;
        }
        if (table[0][j] == Mark.MARK_X && table[1][j] == Mark.MARK_X && table[2][j] == Mark.MARK_X) {
          result=Mark.MARK_X;
        }
        if (table[0][j] == Mark.MARK_X && table[1][j] == Mark.MARK_X && table[2][j] == Mark.MARK_X) {
          result=Mark.MARK_X;
        }

      }

    }
    System.out.println(result);
    return result;
  }


  public boolean isGameover() {
    if (true) {

    }
    return false;
  }
}


