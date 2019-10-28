import java.util.Scanner;

class Main {
 public static void main(String[] args) throws java.lang.Exception {
  Scanner s = new Scanner(System.in);
  int i, j, k, d;
  int T;
  String n = "";
  T = s.nextInt();
  for (i = 0; i < T; i++) {
   int a;
   a = s.nextInt();
   s.nextLine();

   for (j = 0; j < a; j++) {
    String str = s.nextLine();

    if (j == 0) {

     k = str.indexOf(" ");
     d = str.indexOf(" ", k + 1);
     n = str.substring(d + 1);

    } else {
     k = str.indexOf(" ");
     d = str.indexOf(" ", k + 1);
     if (Integer.parseInt(str.substring(k + 1, d)) >= Integer.parseInt(n)) {
      n = str.substring(d + 1);
      System.out.println(str);
     }
    }

   }

  }

 }
}