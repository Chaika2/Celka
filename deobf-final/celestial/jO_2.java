package celestial;

import java.util.Random;

public class jO_2 extends jW_2<rHa_1> {
   private final lo_3 class_ = QY.instanceof_().synchronized_();

   public jO_2(jz_3 var1) {
      super(var1);
   }

   private void class_(rfH_2 var1, xc_3 var2, Ml_1 var3, Hx_1 var4, rYB var5, boolean var6, int var7) {
      HU var8 = yS_2.break_(var2);
      Ok_1 var9 = var4.getBuffer(var8);
      this.class_.byte_().class_(var5, this.class_.class_(var2), var2, var1, var3, var9, var6, new Random(), var2.break_(var1), var7);
   }

   public void class_(rHa_1 var1, float var2, Ml_1 var3, Hx_1 var4, int var5, int var6) {
      rYB var7 = var1.while_();
      if (var7 != null) {
         rfH_2 var8 = var1.char_().break_(var1.extends_().case_());
         xc_3 var9 = var1.native_();
         if (!var9.catch_()) {
            lT_2.class_();
            var3.class_();
            var3.class_((double)var1.break_(var2), (double)var1.byte_(var2), (double)var1.protected_(var2));
            if (var9.class_(xu_3.rS) && var1.class_(var2) <= 4.0F) {
               var9 = var9.class_(ka_3.package_, Boolean.valueOf(var1.class_(var2) <= 0.5F));
               this.class_(var8, var9, var3, var4, var7, false, var6);
            } else if (var1.finally_() && !var1.catch_()) {
               rCg_1 var10 = var9.class_(xu_3.D) ? rCg_1.STICKY : rCg_1.DEFAULT;
               xc_3 var11 = xu_3.rS.continue_().class_(ka_3.final_, var10).class_(ka_3.volatile_, var9.byte_(kD_2.volatile_));
               var11 = var11.class_(ka_3.package_, Boolean.valueOf(var1.class_(var2) >= 0.5F));
               this.class_(var8, var11, var3, var4, var7, false, var6);
               rfH_2 var12 = var8.break_(var1.extends_());
               var3.break_();
               var3.class_();
               var9 = var9.class_(kD_2.final_, Boolean.valueOf(true));
               this.class_(var12, var9, var3, var4, var7, true, var6);
            } else {
               this.class_(var8, var9, var3, var4, var7, false, var6);
            }

            var3.break_();
            lT_2.break_();
         }
      }
   }
}
