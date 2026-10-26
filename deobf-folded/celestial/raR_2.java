package celestial;

abstract class raR_2 extends rrrn_1 {
   protected raU_2 id_class;

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   protected xc_3 id_byte() {
      switch (this.id_class) {
         case NORMAL:
         default:
            return xu_3.PV.id_continue();
         case MESA:
            return xu_3.bm.id_continue();
      }
   }

   public raR_2(raF_2 var1, int var2, raU_2 var3) {
      super(var1, var2);
      this.id_class = var3;
   }

   public raR_2(raF_2 var1, rcd_3 var2) {
      super(var1, var2);
      this.id_class = raU_2.id_class(var2.id_private("MST"));
   }

   protected boolean id_class(rRq_1 var1, rfi_3 var2, int var3, int var4, int var5, int var6) {
      for (int var7 = var3; var7 <= var4; var7++) {
         if (this.id_class(var1, var7, var5 + 1, var6, var2).id_catch()) {
            return false;
         }
      }

      return true;
   }

   @Override
   protected void id_class(rcd_3 var1) {
      var1.id_break("MST", this.id_class.ordinal());
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   protected xc_3 id_break() {
      switch (this.id_class) {
         case NORMAL:
         default:
            return xu_3.id_final.id_continue();
         case MESA:
            return xu_3.id_super.id_continue();
      }
   }
}
