package celestial;

public class rrxO_2 extends rfl_3 {
   private int id_catch = -1;
   private boolean id_private = false;

   public rrxO_2(double var1, double var3, double var5, double var7, double var9, double var11) {
      super(var1, var3, var5, var7, var9, var11);
   }

   public boolean id_class(rrxN_2 var1, int var2) {
      if (this.id_catch != var2) {
         this.id_private = var1.id_class(this.id_class, this.id_break, this.id_byte, this.id_protected, this.id_throws, this.id_case);
         this.id_catch = var2;
      }

      return this.id_private;
   }
}
