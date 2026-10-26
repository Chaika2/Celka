package celestial;

public class pe_3 extends pV_2<rhp_3> {
   private static final rqO_2 id_class = new rqO_2("textures/entity/fishing_hook.png");
   private static final HU id_throws = HU.id_byte(id_class);

   public pe_3(pg_3 var1) {
      super(var1);
   }

   public rqO_2 id_class(rhp_3 var1) {
      return id_class;
   }

   private static void id_class(float var0, float var1, float var2, Ok_1 var3, rjV_2 var4, float var5) {
      var3.id_class(var4, var0 * var5, var1 * (var5 * var5 + var5) * 0.5F + 0.25F, var2 * var5).id_break(0, 0, 0, 255).id_class();
   }

   public void id_class(rhp_3 var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      rhd_3 var7 = var1.id_case();
      if (var7 != null) {
         var4.id_class();
         var4.id_class();
         var4.id_class(0.5F, 0.5F, 0.5F);
         var4.id_class(this.id_break.id_byte());
         var4.id_class(rje_3.id_protected.id_byte(180.0F));
         MH var8 = var4.id_byte();
         rjV_2 var9 = var8.id_class();
         rjj_3 var10 = var8.id_break();
         Ok_1 var11 = var5.getBuffer(id_throws);
         id_class(var11, var9, var10, var6, 0.0F, 0, 0, 1);
         id_class(var11, var9, var10, var6, 1.0F, 0, 1, 1);
         id_class(var11, var9, var10, var6, 1.0F, 1, 1, 0);
         id_class(var11, var9, var10, var6, 0.0F, 1, 0, 0);
         var4.id_break();
         int var12 = var7.Su() == rpZ_2.RIGHT ? 1 : -1;
         rdn_3 var13 = var7.ss();
         if (var13.id_break() != rdy_3.Xd) {
            var12 = -var12;
         }

         float var14 = var7.id_goto(var3);
         float var15 = rfU_2.id_class(rfU_2.id_byte(var14) * (float) Math.PI);
         float var16 = rfU_2.id_catch(var3, (Float)var7.id_private[24], (Float)var7.id_private[23]) * (float) (Math.PI / 180.0);
         double var17 = (double)rfU_2.id_class(var16);
         double var19 = (double)rfU_2.id_break(var16);
         double var21 = (double)var12 * 0.35;
         double var23 = 0.8;
         double var25;
         double var27;
         double var29;
         float var31;
         if ((this.id_break.id_protected == null || this.id_break.id_protected.id_volatile().id_class()) && var7 == (cb_3)QY.id_instanceof().id_class[57]) {
            double var32 = this.id_break.id_protected.U;
            var32 /= 100.0;
            rjU_2 var34 = new rjU_2((double)var12 * -0.36 * var32, -0.045 * var32, 0.4);
            var34 = var34.id_class(-rfU_2.id_catch(var3, (Float)var7.id_throws[18], (Float)var7.id_throws[16]) * (float) (Math.PI / 180.0));
            var34 = var34.id_break(-rfU_2.id_catch(var3, (Float)var7.id_throws[17], (Float)var7.id_throws[15]) * (float) (Math.PI / 180.0));
            var34 = var34.id_break(var15 * 0.5F);
            var34 = var34.id_class(-var15 * 0.7F);
            var25 = rfU_2.id_protected((double)var3, (Double)var7.id_throws[8], var7.rx()) + var34.id_break;
            var27 = rfU_2.id_protected((double)var3, (Double)var7.id_throws[9], var7.re()) + var34.id_byte;
            var29 = rfU_2.id_protected((double)var3, (Double)var7.id_throws[10], var7.BO()) + var34.id_protected;
            var31 = var7.Bx();
         } else {
            var25 = rfU_2.id_protected((double)var3, (Double)var7.id_throws[8], var7.rx()) - var19 * var21 - var17 * 0.8;
            var27 = (Double)var7.id_throws[9] + (double)var7.Bx() + (var7.re() - (Double)var7.id_throws[9]) * (double)var3 - 0.45;
            var29 = rfU_2.id_protected((double)var3, (Double)var7.id_throws[10], var7.BO()) - var17 * var21 + var19 * 0.8;
            var31 = var7.x() ? -0.1875F : 0.0F;
         }

         double var46 = rfU_2.id_protected((double)var3, (Double)var1.id_throws[8], var1.rx());
         double var51 = rfU_2.id_protected((double)var3, (Double)var1.id_throws[9], var1.re()) + 0.25;
         double var36 = rfU_2.id_protected((double)var3, (Double)var1.id_throws[10], var1.BO());
         float var38 = (float)(var25 - var46);
         float var39 = (float)(var27 - var51) + var31;
         float var40 = (float)(var29 - var36);
         Ok_1 var41 = var5.getBuffer(HU.id_return());
         rjV_2 var42 = var4.id_byte().id_class();
         byte var43 = 16;

         for (int var44 = 0; var44 < 16; var44++) {
            id_class(var38, var39, var40, var41, var42, id_class(var44, 16));
            id_class(var38, var39, var40, var41, var42, id_class(var44 + 1, 16));
         }

         var4.id_break();
         super.id_class(var1, var2, var3, var4, var5, var6);
      }
   }

   private static void id_class(Ok_1 var0, rjV_2 var1, rjj_3 var2, int var3, float var4, int var5, int var6, int var7) {
      var0.id_class(var1, var4 - 0.5F, (float)var5 - 0.5F, 0.0F)
         .id_break(255, 255, 255, 255)
         .id_class((float)var6, (float)var7)
         .id_byte(fZ_2.id_class)
         .id_break(var3)
         .id_class(var2, 0.0F, 1.0F, 0.0F)
         .id_class();
   }

   private static float id_class(int var0, int var1) {
      return (float)var0 / (float)var1;
   }
}
