package celestial;

class rtd_3 {
   private final byte[] id_class;

   public rtd_3() {
      this.id_class = new byte[2048];
   }

   public rtd_3(byte[] var1) {
      this.id_class = var1;
      if (var1.length != 2048) {
         throw new IllegalArgumentException("ChunkNibbleArrays should be 2048 bytes not: " + var1.length);
      }
   }

   private boolean id_class(int var1) {
      return (var1 & 1) == 0;
   }

   public int id_class(int var1, int var2, int var3) {
      int var4 = this.id_break(var2 << 8 | var3 << 4 | var1);
      return this.id_class(var2 << 8 | var3 << 4 | var1) ? this.id_class[var4] & 15 : this.id_class[var4] >> 4 & 15;
   }

   private int id_break(int var1) {
      return var1 >> 1;
   }
}
