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
   s = sc.nextLine();
   str = sc.nextLine();
   for (j = 0; j <= s.length() - str.length(); j++) {
    for (k = 0; k < str.length(); k++)
     if (s.charAt(k + j) != str.charAt(k))
      break;

    if (k == str.length())
     System.out.print(j + 1 + " ");

   }
   System.out.print("\n");
  }

 }
}