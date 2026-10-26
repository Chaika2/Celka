package celestial;

public class hB_2<T extends hr_3> {
   private final T id_class;
   private final OT id_break;
   private final String id_byte;

   public hB_2(T var1, OT var2, String var3) {
      this.id_class = (T)var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         hB_2 var2 = (hB_2)var1;
         if (!this.id_class.equals(var2.id_class)) {
            return false;
         } else {
            return !this.id_break.equals(var2.id_break) ? false : this.id_byte.equals(var2.id_byte);
         }
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.id_class.hashCode();
      var1 = 31 * var1 + this.id_break.hashCode();
      return 31 * var1 + this.id_byte.hashCode();
   }

   public T id_class() {
      return this.id_class;
   }

   public void id_class(hs_3 var1) {
      var1.id_class(this.id_break, this.id_byte);
   }
}
