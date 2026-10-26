package celestial;

public class Tm_1 extends Tf_1<cG_2, wh_3<cG_2>> {
   public Tm_1(qE_2<cG_2, wh_3<cG_2>> var1) {
      super(var1);
   }

   public void id_class(Ml_1 var1, Hx_1 var2, int var3, cG_2 var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (var4.id_super() && !var4.Pp() && var4.id_class(rhQ_2.CAPE) && var4.id_case() != null) {
         rdn_3 var11 = var4.id_class(rXQ.CHEST);
         if (var11.id_break() != rdy_3.kc) {
            var1.id_class();
            var1.id_class(0.0, 0.0, 0.125);
            double var12 = rfU_2.id_protected((double)var7, (Double)var4.id_implements[10], (Double)var4.id_implements[13])
               - rfU_2.id_protected((double)var7, (Double)var4.id_throws[8], var4.rx());
            double var14 = rfU_2.id_protected((double)var7, (Double)var4.id_implements[11], (Double)var4.id_implements[14])
               - rfU_2.id_protected((double)var7, (Double)var4.id_throws[9], var4.re());
            double var16 = rfU_2.id_protected((double)var7, (Double)var4.id_implements[12], (Double)var4.id_implements[15])
               - rfU_2.id_protected((double)var7, (Double)var4.id_throws[10], var4.BO());
            float var18 = (Float)var4.id_private[24] + ((Float)var4.id_private[23] - (Float)var4.id_private[24]) * var7;
            double var19 = (double)rfU_2.id_class(var18 * (float) (Math.PI / 180.0));
            double var21 = (double)(-rfU_2.id_break(var18 * (float) (Math.PI / 180.0)));
            float var23 = (float)var14 * 10.0F;
            var23 = rfU_2.id_class(var23, -6.0F, 32.0F);
            float var24 = (float)(var12 * var19 + var16 * var21) * 100.0F;
            var24 = rfU_2.id_class(var24, 0.0F, 150.0F);
            float var25 = (float)(var12 * var21 - var16 * var19) * 100.0F;
            var25 = rfU_2.id_class(var25, -20.0F, 20.0F);
            if (var24 < 0.0F) {
               var24 = 0.0F;
            }

            if (var24 > 165.0F) {
               var24 = 165.0F;
            }

            if (var23 < -5.0F) {
               var23 = -5.0F;
            }

            float var26 = rfU_2.id_catch(var7, (Float)var4.id_implements[7], (Float)var4.id_implements[8]);
            var23 += rfU_2.id_class(rfU_2.id_catch(var7, (Float)var4.id_throws[28], (Float)var4.id_throws[29]) * 6.0F) * 32.0F * var26;
            if (var4.x()) {
               var23 += 25.0F;
            }

            float var27 = rrbb_3.rV() * 20.0F;
            var27 = rrbb_3.id_class(var27, 0.02F, 1.0F);
            Float var33 = rfU_2.id_catch(var27, (Float)var4.id_class[11], 6.0F + var24 / 2.0F + var23);
            var4.id_class[11] = var33;
            Float var34 = rfU_2.id_catch(var27, (Float)var4.id_class[13], var25 / 2.0F);
            var4.id_class[13] = var34;
            Float var35 = rfU_2.id_catch(var27, (Float)var4.id_class[12], 180.0F - var25 / 2.0F);
            var4.id_class[12] = var35;
            var1.id_class(rje_3.id_break.id_byte((Float)var4.id_class[11]));
            var1.id_class(rje_3.id_case.id_byte((Float)var4.id_class[13]));
            var1.id_class(rje_3.id_protected.id_byte((Float)var4.id_class[12]));
            Ok_1 var28 = var2.getBuffer(HU.id_break(var4.id_case()));
            this.id_byte().id_break(var1, var28, var3, fZ_2.id_class);
            var1.id_break();
         }
      }
   }
}
