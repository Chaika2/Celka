package celestial;

public class HD {
   private final long[] class_;
   private int break_;
   private int byte_;

   public HD(int var1) {
      this.class_ = new long[var1];
   }

   public long class_(long var1) {
      if (this.break_ < this.class_.length) {
         this.break_++;
      }

      this.class_[this.byte_] = var1;
      this.byte_ = (this.byte_ + 1) % this.class_.length;
      long var3 = Long.MAX_VALUE;
      long var5 = Long.MIN_VALUE;
      long var7 = 0L;

      for (int var9 = 0; var9 < this.break_; var9++) {
         long var10 = this.class_[var9];
         var7 += var10;
         var3 = Math.min(var3, var10);
         var5 = Math.max(var5, var10);
      }

      if (this.break_ > 2) {
         var7 -= var3 + var5;
         return var7 / (long)(this.break_ - 2);
      } else {
         return var7 > 0L ? (long)this.break_ / var7 : 0L;
      }
   }
}
