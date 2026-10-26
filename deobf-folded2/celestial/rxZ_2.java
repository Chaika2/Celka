package celestial;

import java.util.Collection;

public class rxZ_2 extends rdb_3 {
   public rxZ_2(rdO_2 var1) {
      super(var1);
   }

   private static <T extends Comparable<T>> xc_3 id_class(xc_3 var0, rCZ<T> var1, boolean var2) {
      return var0.id_class(var1, id_class(var1.id_class(), var0.id_byte(var1), var2));
   }

   private static <T> T id_class(Iterable<T> var0, T var1, boolean var2) {
      return var2 ? rqR_2.id_break(var0, (T)var1) : rqR_2.id_class(var0, (T)var1);
   }

   private static void id_class(rhd_3 var0, rgP_2 var1) {
      ((rhN_2)var0).id_class(var1, rVU.GAME_INFO, rqR_2.id_break);
   }

   private static <T extends Comparable<T>> String id_class(xc_3 var0, rCZ<T> var1) {
      return var1.id_class(var0.id_byte(var1));
   }

   @Override
   public boolean id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4) {
      if (!var2.id_continue) {
         this.id_class(var4, var1, var2, var3, false, var4.id_protected(rpm_3.MAIN_HAND));
      }

      return false;
   }

   @Override
   public ryZ_2 id_class(rdH_2 var1) {
      rhd_3 var2 = var1.id_final();
      rYB var3 = var1.id_int();
      if (!var3.id_continue && var2 != null) {
         rfH_2 var4 = var1.id_class();
         this.id_class(var2, var3.id_byte(var4), var3, var4, true, var1.id_volatile());
      }

      return ryZ_2.id_class(var3.id_continue);
   }

   private void id_class(rhd_3 var1, xc_3 var2, rRg_1 var3, rfH_2 var4, boolean var5, rdn_3 var6) {
      if (var1.sU()) {
         xd_3 var7 = var2.id_break();
         rCF var8 = var7.id_new();
         Collection var9 = var8.id_protected();
         String var10 = rVL.id_strictfp.id_break(var7).toString();
         if (var9.isEmpty()) {
            id_class(var1, new rgn_3(this.id_break() + ".empty", var10));
         } else {
            rcd_3 var11 = var6.id_class("DebugProperty");
            String var12 = var11.id_native(var10);
            rCZ var13 = var8.id_class(var12);
            if (var5) {
               if (var13 == null) {
                  var13 = (rCZ)var9.iterator().next();
               }

               xc_3 var14 = id_class(var2, var13, var1.sN());
               var3.id_class(var4, var14, 18);
               id_class(var1, new rgn_3(this.id_break() + ".update", var13.id_throws(), id_class(var14, var13)));
            } else {
               var13 = id_class(var9, var13, var1.sN());
               String var16 = var13.id_throws();
               var11.id_class(var10, var16);
               id_class(var1, new rgn_3(this.id_break() + ".select", var16, id_class(var2, var13)));
            }
         }
      }
   }

   @Override
   public boolean id_throws(rdn_3 var1) {
      return true;
   }
}
