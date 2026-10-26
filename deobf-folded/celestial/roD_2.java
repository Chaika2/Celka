package celestial;

public class roD_2 {
   public final byte[] id_class;
   private final int id_break;
   private final int id_byte;

   public roD_2(byte[] var1, int var2) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var2 + 4;
   }

   public int id_class(int var1, int var2, int var3) {
      int var4 = var1 << this.id_byte | var3 << this.id_break | var2;
      int var5 = var4 >> 1;
      int var6 = var4 & 1;
      return var6 == 0 ? this.id_class[var5] & 15 : this.id_class[var5] >> 4 & 15;
   }
}
