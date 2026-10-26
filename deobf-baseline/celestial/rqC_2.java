package celestial;

import com.viaversion.viaversion.libs.fastutil.HashCommon;

public class rqC_2 {
   private static final long id_class = -7046029254386353131L;
   private long id_break;

   public void id_byte(long var1) {
      this.id_break = var1;
   }

   public double id_byte() {
      return (double)(id_protected(this.id_break += -7046029254386353131L) >>> 11) * 1.110223E-16F;
   }

   public rqC_2() {
      this(rTO.id_class());
   }

   public rqC_2(long var1) {
      this.id_break(var1);
   }

   public int id_class(int var1) {
      return (int)this.id_class((long)var1);
   }

   public long id_class(long var1) {
      if (var1 <= 0L) {
         throw new IllegalArgumentException("illegal bound " + var1 + " (must be positive)");
      } else {
         long var3 = id_protected(this.id_break += -7046029254386353131L);
         long var5 = var1 - 1L;
         if ((var1 & var5) == 0L) {
            return var3 & var5;
         } else {
            long var7 = var3 >>> 1;

            while (var7 + var5 - (var3 = var7 % var1) < 0L) {
               var7 = id_protected(this.id_break += -7046029254386353131L) >>> 1;
            }

            return var3;
         }
      }
   }

   public void id_class(byte[] var1) {
      int var2 = var1.length;

      while (var2 != 0) {
         int var3 = Math.min(var2, 8);

         for (long var4 = id_protected(this.id_break += -7046029254386353131L); var3-- != 0; var4 >>= 8) {
            var2--;
            var1[var2] = (byte)((int)var4);
         }
      }
   }

   public long id_class() {
      return id_protected(this.id_break += -7046029254386353131L);
   }

   public void id_break(long var1) {
      this.id_break = HashCommon.murmurHash3(var1);
   }

   public int id_break() {
      return id_throws(this.id_break += -7046029254386353131L);
   }

   private static int id_throws(long var0) {
      var0 = (var0 ^ var0 >>> 33) * 7109453100751455733L;
      return (int)((var0 ^ var0 >>> 28) * -3808689974395783757L >>> 32);
   }

   public boolean id_throws() {
      return id_throws(this.id_break += -7046029254386353131L) < 0;
   }

   public float id_protected() {
      return (float)(id_throws(this.id_break += -7046029254386353131L) >>> 8) * 5.9604645E-8F;
   }

   private static long id_protected(long var0) {
      var0 = (var0 ^ var0 >>> 30) * -4658895280553007687L;
      var0 = (var0 ^ var0 >>> 27) * -7723592293110705685L;
      return var0 ^ var0 >>> 31;
   }
}
