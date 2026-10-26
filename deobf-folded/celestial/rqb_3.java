package celestial;

import java.util.Random;

public class rqb_3 {
   private final int id_class;
   private final int id_break;

   public rqb_3(int var1, int var2) {
      if (var2 < var1) {
         throw new IllegalArgumentException("max must be >= minInclusive! Given minInclusive: " + var1 + ", Given max: " + var2);
      } else {
         this.id_class = var1;
         this.id_break = var2;
      }
   }

   @Override
   public String toString() {
      return "IntRange[" + this.id_class + "-" + this.id_break + "]";
   }

   public int id_class() {
      return this.id_class;
   }

   public static rqb_3 id_class(int var0, int var1) {
      return new rqb_3(var0, var1);
   }

   public int id_class(Random var1) {
      return this.id_class == this.id_break ? this.id_class : var1.nextInt(this.id_break - this.id_class + 1) + this.id_class;
   }

   public int id_break() {
      return this.id_break;
   }
}
