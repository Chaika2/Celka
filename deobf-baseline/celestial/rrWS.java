package celestial;

public final class rrWS {
   private xc_3 id_class;
   private xc_3 id_break;
   private rpr_3 id_byte;
   private int id_protected;

   rrWS(xc_3 var1, xc_3 var2, rpr_3 var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rrWS var2) ? false : this.id_class == var2.id_class && this.id_break == var2.id_break && this.id_byte == var2.id_byte;
      }
   }

   @Override
   public int hashCode() {
      if (this.id_protected == 0) {
         this.id_protected = 31 * this.id_protected + this.id_class.hashCode();
         this.id_protected = 31 * this.id_protected + this.id_break.hashCode();
         this.id_protected = 31 * this.id_protected + this.id_byte.hashCode();
      }

      return this.id_protected;
   }

   private void id_class(xc_3 var1, xc_3 var2, rpr_3 var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = 0;
   }

   public rrWS id_class() {
      return new rrWS(this.id_class, this.id_break, this.id_byte);
   }
}
