package celestial;

public final class xz_3 {
   private final xc_3 class_;
   private final xc_3 break_;
   private final rpr_3 byte_;

   public xz_3(xc_3 var1, xc_3 var2, rpr_3 var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof xz_3 var2) ? false : this.class_ == var2.class_ && this.break_ == var2.break_ && this.byte_ == var2.byte_;
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.class_.hashCode();
      var1 = 31 * var1 + this.break_.hashCode();
      return 31 * var1 + this.byte_.hashCode();
   }
}
