// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package Recursion;

public class PracticeQuestion1 {
   public PracticeQuestion1() {
   }

   public static void printDec(int var0) {
      if (var0 == 5) {
         System.out.println(5);
      } else {
         System.out.println(var0);
         printDec(var0 - 1);
      }
   }

   public static void main() {
      printDec(1);
   }
}

