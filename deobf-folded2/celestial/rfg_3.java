package celestial;

public class rfg_3 {
   public final int id_class;
   public final int id_break;

   public rfg_3(int var1, int var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public rfg_3(rfH_2 var1) {
      this.id_class = var1.b_();
      this.id_break = var1.d_();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rfg_3 var2) ? false : this.id_class == var2.id_class && this.id_break == var2.id_break;
      }
   }

   @Override
   public String toString() {
      return "[" + this.id_class + ", " + this.id_break + "]";
   }

   @Override
   public int hashCode() {
      int var1 = 1664525 * this.id_class + 1013904223;
      int var2 = 1664525 * (this.id_break ^ -559038737) + 1013904223;
      return var1 ^ var2;
   }
}
