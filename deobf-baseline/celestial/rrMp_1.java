package celestial;

public class rrMp_1 {
   private int id_class;
   private int id_break;

   public rrMp_1(int var1, int var2) {
      this.id_class = Math.min(var1, var2);
      this.id_break = Math.max(var1, var2);
   }

   @Override
   public String toString() {
      return "min: " + this.id_class + ", max: " + this.id_break;
   }

   public boolean id_class(int var1) {
      return var1 < this.id_class ? false : var1 <= this.id_break;
   }

   public int id_class() {
      return this.id_class;
   }

   public int id_break() {
      return this.id_break;
   }
}
