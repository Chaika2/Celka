package celestial;

class vt_3 extends LV<vw_3> {
   public vt_3(vp_3 var1, QY var2) {
      super(var2, var1.id_package, var1.id_int, 32, var1.id_int - 64, 36);
      this.id_class = var1;

      for (aI_2 var4 : rVL.id_transient) {
         if (var1.id_finally.id_class(rlB_2.id_catch.id_break(var4)) > 0 || var1.id_finally.id_class(rlB_2.id_private.id_break(var4)) > 0) {
            this.id_break(new vw_3(this, var4));
         }
      }
   }

   @Override
   protected void id_class(Ml_1 var1) {
      this.id_class.id_class(var1);
   }
}
