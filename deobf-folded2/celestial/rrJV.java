package celestial;

public class rrJV {
   private rrJR[] id_class = new rrJR[0];
   private boolean id_break = false;

   public void id_class(rrJR var1) {
      this.id_class = (rrJR[])rrbb_3.id_class(this.id_class, var1);
   }

   public void id_class(boolean var1) {
      this.id_break = var1;
   }

   public boolean id_class() {
      return this.id_break;
   }

   public void id_class(tW_2 var1, cG_2 var2, Ml_1 var3, Hx_1 var4, int var5, int var6) {
      if (this.id_break) {
         for (int var7 = 0; var7 < this.id_class.length; var7++) {
            rrJR var8 = this.id_class[var7];
            var8.id_class(var1, var2, var3, var4, var5, var6);
         }
      }
   }

   public rrJR[] id_break() {
      return this.id_class;
   }
}
