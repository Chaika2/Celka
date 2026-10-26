package celestial;

public class rrJV {
   private rrJR[] class_ = new rrJR[0];
   private boolean break_ = false;

   public void class_(rrJR var1) {
      this.class_ = (rrJR[])rrbb_3.class_(this.class_, var1);
   }

   public void class_(boolean var1) {
      this.break_ = var1;
   }

   public boolean class_() {
      return this.break_;
   }

   public void class_(tW_2 var1, cG_2 var2, Ml_1 var3, Hx_1 var4, int var5, int var6) {
      if (this.break_) {
         for (int var7 = 0; var7 < this.class_.length; var7++) {
            rrJR var8 = this.class_[var7];
            var8.class_(var1, var2, var3, var4, var5, var6);
         }
      }
   }

   public rrJR[] break_() {
      return this.class_;
   }
}
