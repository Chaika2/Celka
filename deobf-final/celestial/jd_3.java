package celestial;

public class jd_3 extends jW_2<ryG_2> {
   public jd_3(jz_3 var1) {
      super(var1);
   }

   public boolean class_(ryG_2 var1) {
      return true;
   }

   private void class_(ryG_2 var1, Ok_1 var2, rfH_2 var3, boolean var4, Ml_1 var5) {
      rYB var6 = var1.while_();
      rfH_2 var7 = var1.char_();
      rfH_2 var8 = var7.break_(var3);

      for (rfH_2 var10 : rfH_2.class_(var8, var8.break_(var1.extends_()).break_(-1, -1, -1))) {
         xc_3 var11 = var6.byte_(var10);
         boolean var12 = var11.catch_();
         boolean var13 = var11.class_(xu_3.bo);
         if (var12 || var13) {
            float var14 = var12 ? 0.05F : 0.0F;
            double var15 = (double)((float)(var10.b_() - var7.b_()) + 0.45F - var14);
            double var17 = (double)((float)(var10.c_() - var7.c_()) + 0.45F - var14);
            double var19 = (double)((float)(var10.d_() - var7.d_()) + 0.45F - var14);
            double var21 = (double)((float)(var10.b_() - var7.b_()) + 0.55F + var14);
            double var23 = (double)((float)(var10.c_() - var7.c_()) + 0.55F + var14);
            double var25 = (double)((float)(var10.d_() - var7.d_()) + 0.55F + var14);
            if (var4) {
               yX_2.class_(var5, var2, var15, var17, var19, var21, var23, var25, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            } else if (var12) {
               yX_2.class_(var5, var2, var15, var17, var19, var21, var23, var25, 0.5F, 0.5F, 1.0F, 1.0F, 0.5F, 0.5F, 1.0F);
            } else {
               yX_2.class_(var5, var2, var15, var17, var19, var21, var23, var25, 1.0F, 0.25F, 0.25F, 1.0F, 1.0F, 0.25F, 0.25F);
            }
         }
      }
   }

   public void class_(ryG_2 var1, float var2, Ml_1 var3, Hx_1 var4, int var5, int var6) {
      if (((cb_3)QY.instanceof_().class_[57]).sU() || ((cb_3)QY.instanceof_().class_[57]).native_()) {
         rfH_2 var7 = var1.finally_();
         rfH_2 var8 = var1.extends_();
         if (var8.b_() >= 1 && var8.c_() >= 1 && var8.d_() >= 1 && (var1.package_() == rCD.SAVE || var1.package_() == rCD.LOAD)) {
            double var9 = (double)var7.b_();
            double var11 = (double)var7.d_();
            double var13 = (double)var7.c_();
            double var15 = var13 + (double)var8.c_();
            double var17;
            double var19;
            switch (var1.native_()) {
               case LEFT_RIGHT:
                  var17 = (double)var8.b_();
                  var19 = (double)(-var8.d_());
                  break;
               case FRONT_BACK:
                  var17 = (double)(-var8.b_());
                  var19 = (double)var8.d_();
                  break;
               default:
                  var17 = (double)var8.b_();
                  var19 = (double)var8.d_();
            }

            double var21;
            double var23;
            double var25;
            double var27;
            switch (var1.volatile_()) {
               case CLOCKWISE_90:
                  var21 = var19 < 0.0 ? var9 : var9 + 1.0;
                  var23 = var17 < 0.0 ? var11 + 1.0 : var11;
                  var25 = var21 - var19;
                  var27 = var23 + var17;
                  break;
               case CLOCKWISE_180:
                  var21 = var17 < 0.0 ? var9 : var9 + 1.0;
                  var23 = var19 < 0.0 ? var11 : var11 + 1.0;
                  var25 = var21 - var17;
                  var27 = var23 - var19;
                  break;
               case COUNTERCLOCKWISE_90:
                  var21 = var19 < 0.0 ? var9 + 1.0 : var9;
                  var23 = var17 < 0.0 ? var11 : var11 + 1.0;
                  var25 = var21 + var19;
                  var27 = var23 - var17;
                  break;
               default:
                  var21 = var17 < 0.0 ? var9 + 1.0 : var9;
                  var23 = var19 < 0.0 ? var11 + 1.0 : var11;
                  var25 = var21 + var17;
                  var27 = var23 + var19;
            }

            float var29 = 1.0F;
            float var30 = 0.9F;
            float var31 = 0.5F;
            Ok_1 var32 = var4.getBuffer(HU.return_());
            if (var1.package_() == rCD.SAVE || var1.instanceof_()) {
               yX_2.class_(var3, var32, var21, var13, var23, var25, var15, var27, 0.9F, 0.9F, 0.9F, 1.0F, 0.5F, 0.5F, 0.5F);
            }

            if (var1.package_() == rCD.SAVE && var1.try_()) {
               this.class_(var1, var32, var7, true, var3);
               this.class_(var1, var32, var7, false, var3);
            }
         }
      }
   }
}
