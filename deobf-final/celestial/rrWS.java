package celestial;

public final class rrWS {
   private xc_3 class_;
   private xc_3 break_;
   private rpr_3 byte_;
   private int protected_;

   rrWS(xc_3 var1, xc_3 var2, rpr_3 var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rrWS var2) ? false : this.class_ == var2.class_ && this.break_ == var2.break_ && this.byte_ == var2.byte_;
      }
   }

   @Override
   public int hashCode() {
      if (this.protected_ == 0) {
         this.protected_ = 31 * this.protected_ + this.class_.hashCode();
         this.protected_ = 31 * this.protected_ + this.break_.hashCode();
         this.protected_ = 31 * this.protected_ + this.byte_.hashCode();
      }

      return this.protected_;
   }

   private void class_(xc_3 var1, xc_3 var2, rpr_3 var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = 0;
   }

   public rrWS class_() {
      return new rrWS(this.class_, this.break_, this.byte_);
   }
}
