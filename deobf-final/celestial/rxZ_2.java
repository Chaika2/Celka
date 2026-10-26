package celestial;

import java.util.Collection;

public class rxZ_2 extends rdb_3 {
   public rxZ_2(rdO_2 var1) {
      super(var1);
   }

   private static <T extends Comparable<T>> xc_3 class_(xc_3 var0, rCZ<T> var1, boolean var2) {
      return var0.class_(var1, class_(var1.class_(), var0.byte_(var1), var2));
   }

   private static <T> T class_(Iterable<T> var0, T var1, boolean var2) {
      return var2 ? rqR_2.break_(var0, (T)var1) : rqR_2.class_(var0, (T)var1);
   }

   private static void class_(rhd_3 var0, rgP_2 var1) {
      ((rhN_2)var0).class_(var1, rVU.GAME_INFO, rqR_2.break_);
   }

   private static <T extends Comparable<T>> String class_(xc_3 var0, rCZ<T> var1) {
      return var1.class_(var0.byte_(var1));
   }

   @Override
   public boolean class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4) {
      if (!var2.continue_) {
         this.class_(var4, var1, var2, var3, false, var4.protected_(rpm_3.MAIN_HAND));
      }

      return false;
   }

   @Override
   public ryZ_2 class_(rdH_2 var1) {
      rhd_3 var2 = var1.final_();
      rYB var3 = var1.int_();
      if (!var3.continue_ && var2 != null) {
         rfH_2 var4 = var1.class_();
         this.class_(var2, var3.byte_(var4), var3, var4, true, var1.volatile_());
      }

      return ryZ_2.class_(var3.continue_);
   }

   private void class_(rhd_3 var1, xc_3 var2, rRg_1 var3, rfH_2 var4, boolean var5, rdn_3 var6) {
      if (var1.sU()) {
         xd_3 var7 = var2.break_();
         rCF var8 = var7.new_();
         Collection var9 = var8.protected_();
         String var10 = rVL.strictfp_.break_(var7).toString();
         if (var9.isEmpty()) {
            class_(var1, new rgn_3(this.break_() + ".empty", var10));
         } else {
            rcd_3 var11 = var6.class_("DebugProperty");
            String var12 = var11.native_(var10);
            rCZ var13 = var8.class_(var12);
            if (var5) {
               if (var13 == null) {
                  var13 = (rCZ)var9.iterator().next();
               }

               xc_3 var14 = class_(var2, var13, var1.sN());
               var3.class_(var4, var14, 18);
               class_(var1, new rgn_3(this.break_() + ".update", var13.throws_(), class_(var14, var13)));
            } else {
               var13 = class_(var9, var13, var1.sN());
               String var16 = var13.throws_();
               var11.class_(var10, var16);
               class_(var1, new rgn_3(this.break_() + ".select", var16, class_(var2, var13)));
            }
         }
      }
   }

   @Override
   public boolean throws_(rdn_3 var1) {
      return true;
   }
}
