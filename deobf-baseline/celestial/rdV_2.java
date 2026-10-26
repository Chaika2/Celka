package celestial;

public class rdV_2 extends rdb_3 {
   private static final UT id_class = new rdg_3();
   final rsd_3 id_break;

   public rdV_2(rsd_3 var1, rdO_2 var2) {
      super(var2);
      this.id_break = var1;
      dQ_2.id_class(this, id_class);
   }

   @Override
   public ryZ_2 id_class(rdH_2 var1) {
      rYB var2 = var1.id_int();
      rfH_2 var3 = var1.id_class();
      xc_3 var4 = var2.id_byte(var3);
      if (!var4.id_class(rls_3.id_float)) {
         return ryZ_2.FAIL;
      } else {
         rdn_3 var5 = var1.id_volatile();
         if (!var2.id_continue) {
            rCR var6 = var4.id_break() instanceof Jo_1 ? var4.id_byte(((Jo_1)var4.id_break()).id_implements()) : rCR.NORTH_SOUTH;
            double var7 = 0.0;
            if (var6.id_break()) {
               var7 = 0.5;
            }

            rsJ_2 var9 = rsJ_2.id_class(var2, (double)var3.b_() + 0.5, (double)var3.c_() + 0.0625 + var7, (double)var3.d_() + 0.5, this.id_break);
            if (var5.id_this()) {
               var9.id_break(var5.id_continue());
            }

            var2.a_(var9);
         }

         var5.id_catch(1);
         return ryZ_2.id_class(var2.id_continue);
      }
   }
}
