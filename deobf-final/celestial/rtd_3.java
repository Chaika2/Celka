package celestial;

class rtd_3 {
   private final byte[] class_;

   public rtd_3() {
      this.class_ = new byte[2048];
   }

   public rtd_3(byte[] var1) {
      this.class_ = var1;
      if (var1.length != 2048) {
         throw new IllegalArgumentException("ChunkNibbleArrays should be 2048 bytes not: " + var1.length);
      }
   }

   private boolean class_(int var1) {
      return (var1 & 1) == 0;
   }

   public int class_(int var1, int var2, int var3) {
      int var4 = this.break_(var2 << 8 | var3 << 4 | var1);
      return this.class_(var2 << 8 | var3 << 4 | var1) ? this.class_[var4] & 15 : this.class_[var4] >> 4 & 15;
   }

   private int break_(int var1) {
      return var1 >> 1;
   }
}
