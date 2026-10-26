package celestial;

public class rrMm_1 {
   private int id_class;
   private int id_break;
   private int id_byte;
   private String id_protected;

   public int id_byte() {
      return this.id_byte;
   }

   public rrMm_1(int var1, int var2, int var3, String var4) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
   }

   public rrMm_1(int var1, int var2, int var3) {
      this(var1, var2, var3, (String)null);
   }

   public rrMm_1(int var1, int var2) {
      this(var1, var2, 0);
   }

   @Override
   public String toString() {
      return this.id_protected == null
         ? this.id_class + "." + this.id_break + "." + this.id_byte
         : this.id_class + "." + this.id_break + "." + this.id_byte + this.id_protected;
   }

   public int id_class() {
      return this.id_class;
   }

   public int id_break() {
      return this.id_break;
   }

   public int id_protected() {
      if (this.id_break > 9) {
         return this.id_class * 100 + this.id_break;
      } else {
         return this.id_byte > 9 ? this.id_class * 100 + this.id_break * 10 + 9 : this.id_class * 100 + this.id_break * 10 + this.id_byte;
      }
   }
}
