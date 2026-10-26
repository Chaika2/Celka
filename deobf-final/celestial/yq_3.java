package celestial;

public class yq_3 {
   private final rqE_2<yp_3> class_ = new rqE_2<>(32);

   public int class_(rdn_3 var1, int var2) {
      yp_3 var3 = this.class_.class_(rVL.for_.class_(var1.break_()));
      return var3 == null ? -1 : var3.getColor(var1, var2);
   }

   public void class_(yp_3 var1, rpL_2... var2) {
      for (rpL_2 var6 : var2) {
         this.class_.class_(var1, rdb_3.class_(var6.case_()));
      }
   }

   public static yq_3 class_(yC_2 var0) {
      yq_3 var1 = new yq_3();
      var1.class_((var0x, var1x) -> var1x > 0 ? -1 : ((rds_3)var0x.break_()).d_(var0x), rdy_3.hs, rdy_3.hE, rdy_3.hG, rdy_3.hb, rdy_3.dI);
      var1.class_((var0x, var1x) -> rRH.class_(0.5, 1.0), xu_3.Gs, xu_3.GE);
      var1.class_((var0x, var1x) -> {
         if (var1x != 1) {
            return -1;
         } else {
            rcd_3 var2 = var0x.break_("Explosion");
            int[] var3x = var2 != null && var2.byte_("Colors", 11) ? var2.final_("Colors") : null;
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
      var1.class_((var0x, var1x) -> var1x > 0 ? -1 : rAB.byte_(var0x), rdy_3.JA, rdy_3.kk, rdy_3.kQ);

      for (rkO_2 var3 : rkO_2.catch_()) {
         var1.class_((var1x, var2) -> var3.class_(var2), var3);
      }

      var1.class_((var1x, var2) -> {
         xc_3 var3x = ((rxJ_2)var1x.break_()).catch_().continue_();
         return var0.class_(var3x, (rRp_1)null, (rfH_2)null, var2);
      }, xu_3.implements_, xu_3.e, xu_3.a, xu_3.BD, xu_3.x, xu_3.d, xu_3.k, xu_3.W, xu_3.z, xu_3.Q, xu_3.Sr);
      var1.class_((var0x, var1x) -> var1x == 0 ? rAB.byte_(var0x) : -1, rdy_3.kz);
      var1.class_((var0x, var1x) -> var1x == 0 ? -1 : rxI_2.catch_(var0x), rdy_3.JX);
      return var1;
   }
}
