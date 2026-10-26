package celestial;

import org.apache.commons.lang3.Validate;

public class ryv_3 {
   private final long[] class_;
   private final int break_;
   private final long byte_;
   private final int protected_;

   public ryv_3(int var1, int var2) {
      this(var1, var2, new long[rfU_2.byte_(var2 * var1, 64) / 64]);
   }

   public ryv_3(int var1, int var2, long[] var3) {
      Validate.inclusiveBetween(1L, 32L, (long)var1);
      this.protected_ = var2;
      this.break_ = var1;
      this.class_ = var3;
      this.byte_ = (1L << var1) - 1L;
      int var4 = rfU_2.byte_(var2 * var1, 64) / 64;
      if (var3.length != var4) {
         throw new IllegalArgumentException("Invalid length given for storage, got: " + var3.length + " but expected: " + var4);
      }
   }

   public int class_(int var1) {
      Validate.inclusiveBetween(0L, (long)(this.protected_ - 1), (long)var1);
      int var2 = var1 * this.break_;
      int var3 = var2 >> 6;
      int var4 = (var1 + 1) * this.break_ - 1 >> 6;
      int var5 = var2 ^ var3 << 6;
      if (var3 == var4) {
         return (int)(this.class_[var3] >>> var5 & this.byte_);
      } else {
         int var6 = 64 - var5;
         return (int)((this.class_[var3] >>> var5 | this.class_[var4] << var6) & this.byte_);
      }
   }

   public long[] class_() {
      return this.class_;
   }

   public void class_(int var1, int var2) {
      Validate.inclusiveBetween(0L, (long)(this.protected_ - 1), (long)var1);
      Validate.inclusiveBetween(0L, this.byte_, (long)var2);
      int var3 = var1 * this.break_;
      int var4 = var3 >> 6;
      int var5 = (var1 + 1) * this.break_ - 1 >> 6;
      int var6 = var3 ^ var4 << 6;
      this.class_[var4] = this.class_[var4] & ~(this.byte_ << var6) | ((long)var2 & this.byte_) << var6;
      if (var4 != var5) {
         int var7 = 64 - var6;
         int var8 = this.break_ - var7;
         this.class_[var5] = this.class_[var5] >>> var8 << var8 | ((long)var2 & this.byte_) >> var7;
      }
   }

   public int break_() {
      return this.break_;
   }
}
