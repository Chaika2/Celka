package celestial;

public class yq_3 {
   private final rqE_2<yp_3> id_class = new rqE_2<>(32);

   public int id_class(rdn_3 var1, int var2) {
      yp_3 var3 = this.id_class.id_class(rVL.id_for.id_class(var1.id_break()));
      return var3 == null ? -1 : var3.getColor(var1, var2);
   }

   public void id_class(yp_3 var1, rpL_2... var2) {
      for (rpL_2 var6 : var2) {
         this.id_class.id_class(var1, rdb_3.id_class(var6.id_case()));
      }
   }

   public static yq_3 id_class(yC_2 var0) {
      yq_3 var1 = new yq_3();
      var1.id_class((var0x, var1x) -> var1x > 0 ? -1 : ((rds_3)var0x.id_break()).d_(var0x), rdy_3.hs, rdy_3.hE, rdy_3.hG, rdy_3.hb, rdy_3.dI);
      var1.id_class((var0x, var1x) -> rRH.id_class(0.5, 1.0), xu_3.Gs, xu_3.GE);
      var1.id_class((var0x, var1x) -> {
         if (var1x != 1) {
            return -1;
         } else {
            rcd_3 var2 = var0x.id_break("Explosion");
            int[] var3x = var2 != null && var2.id_byte("Colors", 11) ? var2.id_final("Colors") : null;
            if (var3x != null && var3x.length != 0) {
               if (var3x.length == 1) {
                  return var3x[0];
               } else {
                  int var4 = 0;
                  int var5 = 0;
                  int var6 = 0;

                  for (int var10 : var3x) {
                     var4 += (var10 & 0xFF0000) >> 16;
                     var5 += (var10 & 0xFF00) >> 8;
                     var6 += (var10 & 0xFF) >> 0;
                  }

                  var4 /= var3x.length;
                  var5 /= var3x.length;
                  var6 /= var3x.length;
                  return var4 << 16 | var5 << 8 | var6;
               }
            } else {
               return 9079434;
            }
         }
      }, rdy_3.du);
      var1.id_class((var0x, var1x) -> var1x > 0 ? -1 : rAB.id_byte(var0x), rdy_3.JA, rdy_3.kk, rdy_3.kQ);

      for (rkO_2 var3 : rkO_2.id_catch()) {
         var1.id_class((var1x, var2) -> var3.id_class(var2), var3);
      }

      var1.id_class((var1x, var2) -> {
         xc_3 var3x = ((rxJ_2)var1x.id_break()).id_catch().id_continue();
         return var0.id_class(var3x, (rRp_1)null, (rfH_2)null, var2);
      }, xu_3.id_implements, xu_3.e, xu_3.a, xu_3.BD, xu_3.x, xu_3.d, xu_3.k, xu_3.W, xu_3.z, xu_3.Q, xu_3.Sr);
      var1.id_class((var0x, var1x) -> var1x == 0 ? rAB.id_byte(var0x) : -1, rdy_3.kz);
      var1.id_class((var0x, var1x) -> var1x == 0 ? -1 : rxI_2.id_catch(var0x), rdy_3.JX);
      return var1;
   }
}
