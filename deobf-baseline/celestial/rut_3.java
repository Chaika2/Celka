package celestial;

public class rut_3<T> {
   private final int id_class;
   private final rmb_3<T> id_break;

   public rut_3(int var1, rmb_3<T> var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rut_3 var2 = (rut_3)var1;
         return this.id_class == var2.id_class;
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "<entity data: " + this.id_class + ">";
   }

   @Override
   public int hashCode() {
      return this.id_class;
   }

   public int id_class() {
      return this.id_class;
   }

   public rmb_3<T> id_break() {
      return this.id_break;
   }
}
