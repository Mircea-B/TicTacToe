public class fibonacci {



  private static int getFibo1(int i) {
    if (i==0)
      return 0;
    if(i==1)
      return 1;
    return (getFibo1(i-1)+getFibo1(i-2));
  }

  public static void main(String[] args) {
    System.out.println(getFibo1(47));


  }

}
