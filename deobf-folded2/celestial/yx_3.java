package celestial;

public class yx_3 {
   public final yQ_2 id_class;
   rpr_3 id_break;
   int id_byte;
   int id_protected;

   public yx_3(yQ_2 var1, rpr_3 var2, int var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   void id_class(rpr_3 var1, int var2, int var3) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
   }

   public boolean id_class(rpr_3 var1) {
      return (this.id_byte & 1 << var1.ordinal()) > 0;
   }

   public void id_class(byte var1, rpr_3 var2) {
      this.id_byte = this.id_byte | var1 | 1 << this.id_break.ordinal();
   }
}
