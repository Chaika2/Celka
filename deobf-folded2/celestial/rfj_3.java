package celestial;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class rfj_3 {
   public static final long id_class = id_class(1875016, 1875016);
   public final int id_break;
   public final int id_byte;
   private int id_protected = 0;

   public int id_byte() {
      return this.id_byte << 4;
   }

   public rfj_3(int var1, int var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }

   public rfj_3(long var1) {
      this.id_break = (int)var1;
      this.id_byte = (int)(var1 >> 32);
   }

   public rfj_3(rfH_2 var1) {
      this.id_break = var1.b_() >> 4;
      this.id_byte = var1.d_() >> 4;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rfj_3 var2) ? false : this.id_break == var2.id_break && this.id_byte == var2.id_byte;
      }
   }

   @Override
   public String toString() {
      return "[" + this.id_break + ", " + this.id_byte + "]";
   }

   @Override
   public int hashCode() {
      if (this.id_protected != 0) {
         return this.id_protected;
      } else {
         int var1 = 1664525 * this.id_break + 1013904223;
         int var2 = 1664525 * (this.id_byte ^ -559038737) + 1013904223;
         this.id_protected = var1 ^ var2;
         return this.id_protected;
      }
   }

   public static Stream<rfj_3> id_class(rfj_3 var0, rfj_3 var1) {
      int var2 = Math.abs(var0.id_break - var1.id_break) + 1;
      int var3 = Math.abs(var0.id_byte - var1.id_byte) + 1;
      int var4 = var0.id_break < var1.id_break ? 1 : -1;
      int var5 = var0.id_byte < var1.id_byte ? 1 : -1;
      return StreamSupport.stream(new rfV_2((long)(var2 * var3), 64, var0, var1, var5, var4), false);
   }

   public static Stream<rfj_3> id_class(rfj_3 var0, int var1) {
      return id_class(new rfj_3(var0.id_break - var1, var0.id_byte - var1), new rfj_3(var0.id_break + var1, var0.id_byte + var1));
   }

   public int id_class(rfj_3 var1) {
      return Math.max(Math.abs(this.id_break - var1.id_break), Math.abs(this.id_byte - var1.id_byte));
   }

   public static int id_class(long var0) {
      return (int)(var0 & 4294967295L);
   }

   public long id_class() {
      return id_class(this.id_break, this.id_byte);
   }

   public static long id_class(int var0, int var1) {
      return (long)var0 & 4294967295L | ((long)var1 & 4294967295L) << 32;
   }

   public static int id_break(long var0) {
      return (int)(var0 >>> 32 & 4294967295L);
   }

   public int id_break() {
      return this.id_break << 4;
   }

   public int id_throws() {
      return (this.id_byte << 4) + 15;
   }

   public rfH_2 id_finally() {
      return new rfH_2(this.id_break(), 0, this.id_byte());
   }

   public int id_catch() {
      return this.id_byte >> 5;
   }

   public int id_case() {
      return this.id_break >> 5;
   }

   public int id_implements() {
      return this.id_byte & 31;
   }

   public int id_protected() {
      return (this.id_break << 4) + 15;
   }

   public int id_private() {
      return this.id_break & 31;
   }
}
