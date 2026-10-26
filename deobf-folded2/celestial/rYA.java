package celestial;

import com.google.common.hash.Hashing;

public class rYA {
   private final rYn_1 id_class;
   private final long id_break;
   private final rYT id_byte;

   public rYA(rYn_1 var1, long var2, rYT var4) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var4;
   }

   public rYG id_class(rfH_2 var1) {
      return this.id_byte.id_class(this.id_break, var1.b_(), var1.c_(), var1.d_(), this.id_class);
   }

   public rYG id_class(double var1, double var3, double var5) {
      int var7 = rfU_2.id_byte(var1) >> 2;
      int var8 = rfU_2.id_byte(var3) >> 2;
      int var9 = rfU_2.id_byte(var5) >> 2;
      return this.id_class(var7, var8, var9);
   }

   public rYG id_class(int var1, int var2, int var3) {
      return this.id_class.id_protected(var1, var2, var3);
   }

   public rYA id_class(rYY var1) {
      return new rYA(var1, this.id_break, this.id_byte);
   }

   public static long id_class(long var0) {
      return Hashing.sha256().hashLong(var0).asLong();
   }

   public rYG id_break(rfH_2 var1) {
      int var2 = var1.b_() >> 2;
      int var3 = var1.c_() >> 2;
      int var4 = var1.d_() >> 2;
      return this.id_class(var2, var3, var4);
   }
}
