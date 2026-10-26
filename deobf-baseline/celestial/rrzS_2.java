package celestial;

public class rrzS_2 {
   private int id_class;
   private int id_break;
   private final int id_byte;

   public rrzS_2(int var1, int var2) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var1 + 37 * var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else {
         return !(var1 instanceof rrzS_2 var2) ? false : this.id_class == var2.id_class && this.id_break == var2.id_break;
      }
   }

   @Override
   public String toString() {
      return "(" + this.id_class + ", " + this.id_break + ")";
   }

   @Override
   public int hashCode() {
      return this.id_byte;
   }

   public static rrzS_2 id_class(int var0, int var1) {
      return new rrzS_2(var0, var1);
   }

   public int id_class() {
      return this.id_class;
   }

   public int id_break() {
      return this.id_break;
   }
}
