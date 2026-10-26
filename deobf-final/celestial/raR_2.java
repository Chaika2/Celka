package celestial;

abstract class raR_2 extends rrrn_1 {
   protected raU_2 class_;

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   protected xc_3 byte_() {
      switch (this.class_) {
         case NORMAL:
         default:
            return xu_3.PV.continue_();
         case MESA:
            return xu_3.bm.continue_();
      }
   }

   public raR_2(raF_2 var1, int var2, raU_2 var3) {
      super(var1, var2);
      this.class_ = var3;
   }

   public raR_2(raF_2 var1, rcd_3 var2) {
      super(var1, var2);
      this.class_ = raU_2.class_(var2.private_("MST"));
   }

   protected boolean class_(rRq_1 var1, rfi_3 var2, int var3, int var4, int var5, int var6) {
      for (int var7 = var3; var7 <= var4; var7++) {
         if (this.class_(var1, var7, var5 + 1, var6, var2).catch_()) {
            return false;
         }
      }

      return true;
   }

   @Override
   protected void class_(rcd_3 var1) {
      var1.break_("MST", this.class_.ordinal());
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   protected xc_3 break_() {
      switch (this.class_) {
         case NORMAL:
         default:
            return xu_3.final_.continue_();
         case MESA:
            return xu_3.super_.continue_();
      }
   }
}
