import Java.util.Scanner;

public class Solution {

  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int numLines = sc.nextInt();
    for ( int i = 0; i < numLines * 2; i++) {
      String cell = sc.nextLine();
      String cellContent = sc.nextLine();
      System.out.println(cell);
      System.out.println(cellContent);
    }
    sc.close();
  }
}