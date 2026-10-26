package celestial;

import org.apache.commons.lang3.Validate;

public class ryv_3 {
   private final long[] id_class;
   private final int id_break;
   private final long id_byte;
   private final int id_protected;

   public ryv_3(int var1, int var2) {
      this(var1, var2, new long[rfU_2.id_byte(var2 * var1, 64) / 64]);
   }

   public ryv_3(int var1, int var2, long[] var3) {
      Validate.inclusiveBetween(1L, 32L, (long)var1);
      this.id_protected = var2;
      this.id_break = var1;
      this.id_class = var3;
      this.id_byte = (1L << var1) - 1L;
      int var4 = rfU_2.id_byte(var2 * var1, 64) / 64;
      if (var3.length != var4) {
         throw new IllegalArgumentException("Invalid length given for storage, got: " + var3.length + " but expected: " + var4);
      }
   }

   public int id_class(int var1) {
      Validate.inclusiveBetween(0L, (long)(this.id_protected - 1), (long)var1);
      int var2 = var1 * this.id_break;
      int var3 = var2 >> 6;
      int var4 = (var1 + 1) * this.id_break - 1 >> 6;
      int var5 = var2 ^ var3 << 6;
      if (var3 == var4) {
         return (int)(this.id_class[var3] >>> var5 & this.id_byte);
      } else {
         int var6 = 64 - var5;
         return (int)((this.id_class[var3] >>> var5 | this.id_class[var4] << var6) & this.id_byte);
      }
   }

   public long[] id_class() {
      return this.id_class;
   }

   public void id_class(int var1, int var2) {
      Validate.inclusiveBetween(0L, (long)(this.id_protected - 1), (long)var1);
      Validate.inclusiveBetween(0L, this.id_byte, (long)var2);
      int var3 = var1 * this.id_break;
      int var4 = var3 >> 6;
      int var5 = (var1 + 1) * this.id_break - 1 >> 6;
      int var6 = var3 ^ var4 << 6;
      this.id_class[var4] = this.id_class[var4] & ~(this.id_byte << var6) | ((long)var2 & this.id_byte) << var6;
      if (var4 != var5) {
         int var7 = 64 - var6;
         int var8 = this.id_break - var7;
         this.id_class[var5] = this.id_class[var5] >>> var8 << var8 | ((long)var2 & this.id_byte) >> var7;
      }
   }

   public int id_break() {
      return this.id_break;
   }
}
