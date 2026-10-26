package celestial;

import com.viaversion.viaversion.libs.fastutil.HashCommon;

public class rqC_2 {
   private static final long class_ = -7046029254386353131L;
   private long break_;

   public void byte_(long var1) {
      this.break_ = var1;
   }

   public double byte_() {
      return (double)(protected_(this.break_ += -7046029254386353131L) >>> 11) * 1.110223E-16F;
   }

   public rqC_2() {
      this(rTO.class_());
   }

   public rqC_2(long var1) {
      this.break_(var1);
   }

   public int class_(int var1) {
      return (int)this.class_((long)var1);
   }

   public long class_(long var1) {
      if (var1 <= 0L) {
         throw new IllegalArgumentException("illegal bound " + var1 + " (must be positive)");
      } else {
         long var3 = protected_(this.break_ += -7046029254386353131L);
         long var5 = var1 - 1L;
         if ((var1 & var5) == 0L) {
            return var3 & var5;
         } else {
            long var7 = var3 >>> 1;

            while (var7 + var5 - (var3 = var7 % var1) < 0L) {
               var7 = protected_(this.break_ += -7046029254386353131L) >>> 1;
            }

            return var3;
         }
      }
   }

   public void class_(byte[] var1) {
      int var2 = var1.length;

      while (var2 != 0) {
         int var3 = Math.min(var2, 8);

         for (long var4 = protected_(this.break_ += -7046029254386353131L); var3-- != 0; var4 >>= 8) {
            var2--;
            var1[var2] = (byte)((int)var4);
         }
      }
   }

   public long class_() {
      return protected_(this.break_ += -7046029254386353131L);
   }

   public void break_(long var1) {
      this.break_ = HashCommon.murmurHash3(var1);
   }

   public int break_() {
      return throws_(this.break_ += -7046029254386353131L);
   }

   private static int throws_(long var0) {
      var0 = (var0 ^ var0 >>> 33) * 7109453100751455733L;
      return (int)((var0 ^ var0 >>> 28) * -3808689974395783757L >>> 32);
   }

   public boolean throws_() {
      return throws_(this.break_ += -7046029254386353131L) < 0;
   }

   public float protected_() {
      return (float)(throws_(this.break_ += -7046029254386353131L) >>> 8) * 5.9604645E-8F;
   }

   private static long protected_(long var0) {
      var0 = (var0 ^ var0 >>> 30) * -4658895280553007687L;
      var0 = (var0 ^ var0 >>> 27) * -7723592293110705685L;
      return var0 ^ var0 >>> 31;
   }
}
