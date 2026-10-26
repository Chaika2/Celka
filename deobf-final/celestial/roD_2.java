package celestial;

public class roD_2 {
   public final byte[] class_;
   private final int break_;
   private final int byte_;

   public roD_2(byte[] var1, int var2) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var2 + 4;
   }

   public int class_(int var1, int var2, int var3) {
      int var4 = var1 << this.byte_ | var3 << this.break_ | var2;
      int var5 = var4 >> 1;
      int var6 = var4 & 1;
      return var6 == 0 ? this.class_[var5] & 15 : this.class_[var5] >> 4 & 15;
   }
}
