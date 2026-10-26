package celestial;

public class rrdV {
   private String id_class;
   private rrdD[] id_break;
   private int id_byte;

   public int id_byte() {
      return this.id_byte;
   }

   public rrdV(String var1, rrdD[] var2, int var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   public String id_class() {
      return this.id_class;
   }

   public rrdD[] id_break() {
      return this.id_break;
   }
}
