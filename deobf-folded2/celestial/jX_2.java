package celestial;

import java.util.List;

public class jX_2 extends jW_2<ryS_2> {
   private final jJ_2 id_class = new jJ_2();
   private static double id_break = 4096.0;

   public jX_2(jz_3 var1) {
      super(var1);
   }

   public static void id_class() {
      QY var0 = QY.id_instanceof();
      double var1 = rrbb_3.id_class(((Qw_1)var0.id_class[20]).U, 1.0, 120.0);
      double var3 = Math.max(1.5 * (double)var0.id_else().id_continue() / var1, 16.0);
      id_break = var3 * var3;
   }

   public void id_class(ryS_2 var1, float var2, Ml_1 var3, Hx_1 var4, int var5, int var6) {
      xc_3 var7 = var1.id_abstract();
      var3.id_class();
      float var8 = 0.6666667F;
      if (var7.id_break() instanceof zM_2) {
         var3.id_class(0.5, 0.5, 0.5);
         float var9 = -((float)(var7.id_byte(zM_2.id_package) * 360) / 16.0F);
         var3.id_class(rje_3.id_protected.id_byte(var9));
         this.id_class.id_break.id_finally = true;
      } else {
         var3.id_class(0.5, 0.5, 0.5);
         float var24 = -var7.id_byte(zj_3.id_package).id_package();
         var3.id_class(rje_3.id_protected.id_byte(var24));
         var3.id_class(0.0, -0.3125, -0.4375);
         this.id_class.id_break.id_finally = false;
      }

      var3.id_class();
      var3.id_class(0.6666667F, -0.6666667F, -0.6666667F);
      Ig_1 var25 = id_class(var7.id_break());
      Ok_1 var10 = var25.id_class(var4, this.id_class::id_class);
      this.id_class.id_class.id_class(var3, var10, var5, var6);
      this.id_class.id_break.id_class(var3, var10, var5, var6);
      var3.id_break();
      if (id_class(var1)) {
         cm_3 var11 = this.id_catch.id_class();
         float var12 = 0.010416667F;
         var3.id_class(0.0, 0.33333334F, 0.046666667F);
         var3.id_class(0.010416667F, -0.010416667F, 0.010416667F);
         int var13 = var1.id_private().id_catch();
         if (rrbb_3.K()) {
            var13 = rrbN_2.id_byte(var13);
         }

         double var14 = 0.4;
         int var16 = (int)((double)fN_2.id_break(var13) * 0.4);
         int var17 = (int)((double)fN_2.id_byte(var13) * 0.4);
         int var18 = (int)((double)fN_2.id_protected(var13) * 0.4);
         int var19 = fN_2.id_class(0, var18, var17, var16);
         byte var20 = 20;

         for (int var21 = 0; var21 < 4; var21++) {
            rpl_3 var22 = var1.id_class(var21, var1x -> {
               List var2x = var11.id_break(var1x, 90);
               return var2x.isEmpty() ? rpl_3.id_class : (rpl_3)var2x.get(0);
            });
            if (var22 != null) {
               float var23 = (float)(-var11.id_class(var22) / 2);
               var11.id_class(var22, var23, (float)(var21 * 10 - 20), var19, false, var3.id_byte().id_class(), var4, false, 0, var5);
            }
         }
      }

      var3.id_break();
   }

   private static boolean id_class(ryS_2 var0) {
      if (rrdZ.id_new) {
         return false;
      } else {
         if (!rrbb_3.id_package) {
            rfH_2 var1 = var0.id_char();
            an_3 var2 = QY.id_instanceof().id_catch();
            double var3 = var2.id_class((double)var1.b_(), (double)var1.c_(), (double)var1.d_());
            if (var3 > id_break) {
               return false;
            }
         }

         return true;
      }
   }

   public static Ig_1 id_class(xd_3 var0) {
      Qr_1 var1;
      if (var0 instanceof JD) {
         var1 = ((JD)var0).id_break();
      } else {
         var1 = Qr_1.id_class;
      }

      return lp_3.id_implements.get(var1);
   }
}
