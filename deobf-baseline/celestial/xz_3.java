package celestial;

public final class xz_3 {
   private final xc_3 id_class;
   private final xc_3 id_break;
   private final rpr_3 id_byte;

   public xz_3(xc_3 var1, xc_3 var2, rpr_3 var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof xz_3 var2) ? false : this.id_class == var2.id_class && this.id_break == var2.id_break && this.id_byte == var2.id_byte;
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.id_class.hashCode();
      var1 = 31 * var1 + this.id_break.hashCode();
      return 31 * var1 + this.id_byte.hashCode();
   }
}
