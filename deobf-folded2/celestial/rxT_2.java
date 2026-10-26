package celestial;

public class rxT_2 extends rdb_3 {
   public rxT_2(rdO_2 var1) {
      super(var1);
   }

   @Override
   public ryZ_2 id_class(rdH_2 var1) {
      rYB var2 = var1.id_int();
      rfH_2 var3 = var1.id_class();
      xc_3 var4 = var2.id_byte(var3);
      if (!var4.id_class(xu_3.SO) || var4.id_byte(dA_2.id_final)) {
         return ryZ_2.PASS;
      } else if (var2.id_continue) {
         return ryZ_2.SUCCESS;
      } else {
         xc_3 var5 = var4.id_class(dA_2.id_final, Boolean.valueOf(true));
         xd_3.id_class(var4, var5, var2, var3);
         var2.id_class(var3, var5, 2);
         var2.id_byte(var3, xu_3.SO);
         var1.id_volatile().id_catch(1);
         var2.id_byte(1503, var3, 0);
         QJ var6 = dA_2.id_break().id_class(var2, var3);
         if (var6 != null) {
            rfH_2 var7 = var6.id_class().id_break(-3, 0, -3);

            for (int var8 = 0; var8 < 3; var8++) {
               for (int var9 = 0; var9 < 3; var9++) {
                  var2.id_class(var7.id_break(var8, 0, var9), xu_3.SM.id_continue(), 2);
               }
            }

            var2.id_break(1038, var7.id_break(1, 0, 1), 0);
         }

         return ryZ_2.CONSUME;
      }
   }

   @Override
   public rym_3<rdn_3> id_class(rYB var1, rhd_3 var2, rpm_3 var3) {
      rdn_3 var4 = var2.id_protected(var3);
      rff_3 var5 = id_class(var1, var2, rjs_3.NONE);
      if (var5.id_byte() == rjM_2.BLOCK && var1.id_byte(var5.id_class()).id_class(xu_3.SO)) {
         return rym_3.id_byte(var4);
      } else {
         var2.id_break(var3);
         if (var1 instanceof rrEm_1) {
            rfH_2 var6 = ((rrEm_1)var1).id_else().id_implements().id_class((rrEm_1)var1, rrrZ.id_extends, var2.Bs(), 100, false);
            if (var6 != null) {
               rhl_3 var7 = new rhl_3(var1, var2.rx(), var2.id_byte(0.5), var2.BO());
               var7.id_break(var4);
               var7.id_class(var6);
               var1.a_(var7);
               if (var2 instanceof rhN_2) {
                  Oo_1.id_volatile.id_class((rhN_2)var2, var6);
               }

               var1.id_class((rhd_3)null, var2.rx(), var2.re(), var2.BO(), rqn_3.BC, rqL_2.NEUTRAL, 0.5F, 0.4F / (id_private.nextFloat() * 0.4F + 0.8F));
               var1.id_class((rhd_3)null, 1003, var2.Bs(), 0);
               if (!((rhx_3)var2.id_implements[18]).id_protected) {
                  var4.id_catch(1);
               }

               var2.id_class(rlB_2.id_byte.id_break(this));
               var2.id_class(var3, true);
               return rym_3.id_class(var4);
            }
         }

         return rym_3.id_break(var4);
      }
   }
}
