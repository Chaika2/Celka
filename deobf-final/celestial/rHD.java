package celestial;

public abstract class rHD extends ryO_2 implements rJZ, rXu_1, rpA_2 {
   private rRK class_;
   private rgP_2 break_;

   protected rHD(ryW_2<?> var1) {
      super(var1);
      this.class_ = rRK.class_;
   }

   public void class_(rgP_2 var1) {
      this.break_ = var1;
   }

   protected abstract rJr_1 class_(int var1, rhz_3 var2);

   public static boolean class_(rhd_3 var0, rRK var1, rgP_2 var2) {
      if (!var0.native_() && !var1.class_(var0.ss())) {
         var0.class_(new rgn_3("container.isLocked", var2), true);
         var0.class_(rqn_3.rw, rqL_2.BLOCKS, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   @Override
   public rcd_3 class_(rcd_3 var1) {
      super.class_(var1);
      this.class_.class_(var1);
      if (this.break_ != null) {
         var1.class_("CustomName", rgB_2.class_(this.break_));
      }

      return var1;
   }

   @Override
   public void class_(xc_3 var1, rcd_3 var2) {
      super.class_(var1, var2);
      this.class_ = rRK.break_(var2);
      if (var2.byte_("CustomName", 8)) {
         this.break_ = rgB_2.class_(var2.native_("CustomName"));
      }
   }

   @Override
   public rgP_2 g() {
      return this.break_ != null ? this.break_ : this.X_();
   }

   public boolean throws_(rhd_3 var1) {
      return class_(var1, this.class_, this.L_());
   }

   @Override
   public rgP_2 rD() {
      return this.break_;
   }

   @Override
   public rgP_2 L_() {
      return this.g();
   }

   @Override
   public rJr_1 createMenu(int var1, rhz_3 var2, rhd_3 var3) {
      return this.throws_(var3) ? this.class_(var1, var2) : null;
   }

   protected abstract rgP_2 X_();
}
