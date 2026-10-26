package celestial;

public abstract class rHD extends ryO_2 implements rJZ, rXu_1, rpA_2 {
   private rRK id_class;
   private rgP_2 id_break;

   protected rHD(ryW_2<?> var1) {
      super(var1);
      this.id_class = rRK.id_class;
   }

   public void id_class(rgP_2 var1) {
      this.id_break = var1;
   }

   protected abstract rJr_1 id_class(int var1, rhz_3 var2);

   public static boolean id_class(rhd_3 var0, rRK var1, rgP_2 var2) {
      if (!var0.id_native() && !var1.id_class(var0.ss())) {
         var0.id_class(new rgn_3("container.isLocked", var2), true);
         var0.id_class(rqn_3.rw, rqL_2.BLOCKS, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   @Override
   public rcd_3 id_class(rcd_3 var1) {
      super.id_class(var1);
      this.id_class.id_class(var1);
      if (this.id_break != null) {
         var1.id_class("CustomName", rgB_2.id_class(this.id_break));
      }

      return var1;
   }

   @Override
   public void id_class(xc_3 var1, rcd_3 var2) {
      super.id_class(var1, var2);
      this.id_class = rRK.id_break(var2);
      if (var2.id_byte("CustomName", 8)) {
         this.id_break = rgB_2.id_class(var2.id_native("CustomName"));
      }
   }

   @Override
   public rgP_2 g() {
      return this.id_break != null ? this.id_break : this.X_();
   }

   public boolean id_throws(rhd_3 var1) {
      return id_class(var1, this.id_class, this.L_());
   }

   @Override
   public rgP_2 rD() {
      return this.id_break;
   }

   @Override
   public rgP_2 L_() {
      return this.g();
   }

   @Override
   public rJr_1 createMenu(int var1, rhz_3 var2, rhd_3 var3) {
      return this.id_throws(var3) ? this.id_class(var1, var2) : null;
   }

   protected abstract rgP_2 X_();
}
