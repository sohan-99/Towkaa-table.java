public class TowKaTable {
   public static void main(String[] args) {
      // int no=2;
      java.util.Scanner s = new java.util.Scanner(System.in);
      System.out.println("Enter Your number: ");
      int no = s.nextInt();
      for (int i = 0; i <= 10; i++) {
         // System.out.println(no*i);
         System.out.println(no + "*" + i + "=" + no * i);
      }
   }
}
