package celestial;

public class Tm_1 extends Tf_1<cG_2, wh_3<cG_2>> {
   public Tm_1(qE_2<cG_2, wh_3<cG_2>> var1) {
      super(var1);
   }

   public void class_(Ml_1 var1, Hx_1 var2, int var3, cG_2 var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (var4.super_() && !var4.Pp() && var4.class_(rhQ_2.CAPE) && var4.case_() != null) {
         rdn_3 var11 = var4.class_(rXQ.CHEST);
         if (var11.break_() != rdy_3.kc) {
            var1.class_();
            var1.class_(0.0, 0.0, 0.125);
            double var12 = rfU_2.protected_((double)var7, (Double)var4.implements_[10], (Double)var4.implements_[13])
               - rfU_2.protected_((double)var7, (Double)var4.throws_[8], var4.rx());
            double var14 = rfU_2.protected_((double)var7, (Double)var4.implements_[11], (Double)var4.implements_[14])
               - rfU_2.protected_((double)var7, (Double)var4.throws_[9], var4.re());
            double var16 = rfU_2.protected_((double)var7, (Double)var4.implements_[12], (Double)var4.implements_[15])
               - rfU_2.protected_((double)var7, (Double)var4.throws_[10], var4.BO());
            float var18 = (Float)var4.private_[24] + ((Float)var4.private_[23] - (Float)var4.private_[24]) * var7;
            double var19 = (double)rfU_2.class_(var18 * (float) (Math.PI / 180.0));
            double var21 = (double)(-rfU_2.break_(var18 * (float) (Math.PI / 180.0)));
            float var23 = (float)var14 * 10.0F;
            var23 = rfU_2.class_(var23, -6.0F, 32.0F);
            float var24 = (float)(var12 * var19 + var16 * var21) * 100.0F;
            var24 = rfU_2.class_(var24, 0.0F, 150.0F);
            float var25 = (float)(var12 * var21 - var16 * var19) * 100.0F;
            var25 = rfU_2.class_(var25, -20.0F, 20.0F);
            if (var24 < 0.0F) {
               var24 = 0.0F;
            }

            if (var24 > 165.0F) {
               var24 = 165.0F;
            }

            if (var23 < -5.0F) {
               var23 = -5.0F;
            }

            float var26 = rfU_2.catch_(var7, (Float)var4.implements_[7], (Float)var4.implements_[8]);
            var23 += rfU_2.class_(rfU_2.catch_(var7, (Float)var4.throws_[28], (Float)var4.throws_[29]) * 6.0F) * 32.0F * var26;
            if (var4.x()) {
               var23 += 25.0F;
            }

            float var27 = rrbb_3.rV() * 20.0F;
            var27 = rrbb_3.class_(var27, 0.02F, 1.0F);
            Float var33 = rfU_2.catch_(var27, (Float)var4.class_[11], 6.0F + var24 / 2.0F + var23);
            var4.class_[11] = var33;
            Float var34 = rfU_2.catch_(var27, (Float)var4.class_[13], var25 / 2.0F);
            var4.class_[13] = var34;
            Float var35 = rfU_2.catch_(var27, (Float)var4.class_[12], 180.0F - var25 / 2.0F);
            var4.class_[12] = var35;
            var1.class_(rje_3.break_.byte_((Float)var4.class_[11]));
            var1.class_(rje_3.case_.byte_((Float)var4.class_[13]));
            var1.class_(rje_3.protected_.byte_((Float)var4.class_[12]));
            Ok_1 var28 = var2.getBuffer(HU.break_(var4.case_()));
            this.byte_().break_(var1, var28, var3, fZ_2.class_);
            var1.break_();
         }
      }
   }
}
