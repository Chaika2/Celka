package celestial;

public class HD {
   private final long[] id_class;
   private int id_break;
   private int id_byte;

   public HD(int var1) {
      this.id_class = new long[var1];
   }

   public long id_class(long var1) {
      if (this.id_break < this.id_class.length) {
         this.id_break++;
      }

      this.id_class[this.id_byte] = var1;
      this.id_byte = (this.id_byte + 1) % this.id_class.length;
      long var3 = Long.MAX_VALUE;
      long var5 = Long.MIN_VALUE;
      long var7 = 0L;

      for (int var9 = 0; var9 < this.id_break; var9++) {
         long var10 = this.id_class[var9];
         var7 += var10;
         var3 = Math.min(var3, var10);
         var5 = Math.max(var5, var10);
      }

      if (this.id_break > 2) {
         var7 -= var3 + var5;
         return var7 / (long)(this.id_break - 2);
      } else {
         return var7 > 0L ? (long)this.id_break / var7 : 0L;
      }
   }
}
