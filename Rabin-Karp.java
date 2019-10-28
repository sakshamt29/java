import java.util.*;

import java.lang.*;

import java.io.*;

class Main

{

  public static void main(String[] args) throws java.lang.Exception

  {

    Scanner sc = new Scanner(System.in);
    int i, j, k;
    int T;
    T = sc.nextInt();
    sc.nextLine();
    for (i = 0; i < T; i++) {
      String s, str;
      int n;
      s = sc.nextLine();
      n = sc.nextInt();

      int x = n % 11;
      int cnt = 0;
      int num;

      for (j = 0; j < s.length() - 1; j++) {
        str = s.substring(j, j + 2);
        num = Integer.parseInt(str);

        if ((num % 11) == x)
          cnt++;

      }

      System.out.println(cnt);

    }

  }
}