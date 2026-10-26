package celestial;

import com.google.common.hash.Hashing;

public class rYA {
   private final rYn_1 class_;
   private final long break_;
   private final rYT byte_;

   public rYA(rYn_1 var1, long var2, rYT var4) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var4;
   }

   public rYG class_(rfH_2 var1) {
      return this.byte_.class_(this.break_, var1.b_(), var1.c_(), var1.d_(), this.class_);
   }

   public rYG class_(double var1, double var3, double var5) {
      int var7 = rfU_2.byte_(var1) >> 2;
      int var8 = rfU_2.byte_(var3) >> 2;
      int var9 = rfU_2.byte_(var5) >> 2;
      return this.class_(var7, var8, var9);
   }

   public rYG class_(int var1, int var2, int var3) {
      return this.class_.protected_(var1, var2, var3);
   }

   public rYA class_(rYY var1) {
      return new rYA(var1, this.break_, this.byte_);
   }

   public static long class_(long var0) {
      return Hashing.sha256().hashLong(var0).asLong();
   }

   public rYG break_(rfH_2 var1) {
      int var2 = var1.b_() >> 2;
      int var3 = var1.c_() >> 2;
      int var4 = var1.d_() >> 2;
      return this.class_(var2, var3, var4);
   }
}
