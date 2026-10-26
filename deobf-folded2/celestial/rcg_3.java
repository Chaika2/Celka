package celestial;

public class rcg_3 {
   public static final rcg_3 id_class = new rcR_2(0L);
   private final long id_break;
   private long id_byte;

   public rcg_3(long var1) {
      this.id_break = var1;
   }

   public void id_class(long var1) {
      this.id_byte += var1 / 8L;
      if (this.id_byte > this.id_break) {
         throw new RuntimeException("Tried to read NBT tag that was too big; tried to allocate: " + this.id_byte + "bytes where max allowed: " + this.id_break);
      }
   }
}
