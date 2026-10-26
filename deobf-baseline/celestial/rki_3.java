package celestial;

final class rki_3 {
   boolean id_class;
   boolean id_break;

   public rki_3(boolean var1, boolean var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rki_3 var2) ? false : this.id_class == var2.id_class && this.id_break == var2.id_break;
      }
   }

   @Override
   public String toString() {
      return "[open=" + this.id_class + ", filtering=" + this.id_break + "]";
   }

   @Override
   public int hashCode() {
      int var1 = this.id_class ? 1 : 0;
      return 31 * var1 + (this.id_break ? 1 : 0);
   }

   public rki_3 id_class() {
      return new rki_3(this.id_class, this.id_break);
   }
}
