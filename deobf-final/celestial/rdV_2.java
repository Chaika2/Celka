package celestial;

public class rdV_2 extends rdb_3 {
   private static final UT class_ = new rdg_3();
   final rsd_3 break_;

   public rdV_2(rsd_3 var1, rdO_2 var2) {
      super(var2);
      this.break_ = var1;
      dQ_2.class_(this, class_);
   }

   @Override
   public ryZ_2 class_(rdH_2 var1) {
      rYB var2 = var1.int_();
      rfH_2 var3 = var1.class_();
      xc_3 var4 = var2.byte_(var3);
      if (!var4.class_(rls_3.float_)) {
         return ryZ_2.FAIL;
      } else {
         rdn_3 var5 = var1.volatile_();
         if (!var2.continue_) {
            rCR var6 = var4.break_() instanceof Jo_1 ? var4.byte_(((Jo_1)var4.break_()).implements_()) : rCR.NORTH_SOUTH;
            double var7 = 0.0;
            if (var6.break_()) {
               var7 = 0.5;
            }

            rsJ_2 var9 = rsJ_2.class_(var2, (double)var3.b_() + 0.5, (double)var3.c_() + 0.0625 + var7, (double)var3.d_() + 0.5, this.break_);
            if (var5.this_()) {
               var9.break_(var5.continue_());
            }

            var2.a_(var9);
         }

         var5.catch_(1);
         return ryZ_2.class_(var2.continue_);
      }
   }
}
