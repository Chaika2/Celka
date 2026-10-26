package celestial;

final class rki_3 {
   boolean class_;
   boolean break_;

   public rki_3(boolean var1, boolean var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rki_3 var2) ? false : this.class_ == var2.class_ && this.break_ == var2.break_;
      }
   }

   @Override
   public String toString() {
      return "[open=" + this.class_ + ", filtering=" + this.break_ + "]";
   }

   @Override
   public int hashCode() {
      int var1 = this.class_ ? 1 : 0;
      return 31 * var1 + (this.break_ ? 1 : 0);
   }

   public rki_3 class_() {
      return new rki_3(this.class_, this.break_);
   }
}
