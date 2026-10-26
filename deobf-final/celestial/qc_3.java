package celestial;

public abstract class qc_3<T extends is_3, M extends tp_3<T>> extends qd_3<T, M> {
   public qc_3(pg_3 var1, M var2, float var3) {
      super(var1, (M)var2, var3);
   }

   public static void class_(
      Ok_1 var0, rjV_2 var1, int var2, float var3, float var4, float var5, float var6, float var7, int var8, int var9, boolean var10, float var11, float var12
   ) {
      float var13 = 0.5F;
      float var14 = 0.4F;
      float var15 = 0.3F;
      if (var9 % 2 == 0) {
         var13 *= 0.7F;
         var14 *= 0.7F;
         var15 *= 0.7F;
      }

      float var16 = (float)var9 / (float)var8;
      float var17 = var3 * var16;
      float var18 = var4 > 0.0F ? var4 * var16 * var16 : var4 - var4 * (1.0F - var16) * (1.0F - var16);
      float var19 = var5 * var16;
      if (!var10) {
         var0.class_(var1, var17 + var11, var18 + var6 - var7, var19 - var12).class_(var13, var14, var15, 1.0F).break_(var2).class_();
      }

      var0.class_(var1, var17 - var11, var18 + var7, var19 + var12).class_(var13, var14, var15, 1.0F).break_(var2).class_();
      if (var10) {
         var0.class_(var1, var17 + var11, var18 + var6 - var7, var19 - var12).class_(var13, var14, var15, 1.0F).break_(var2).class_();
      }
   }

   public static void class_(
      Ok_1 var0, rjV_2 var1, float var2, float var3, float var4, int var5, int var6, int var7, int var8, float var9, float var10, float var11, float var12
   ) {
      byte var13 = 24;

      for (int var14 = 0; var14 < 24; var14++) {
         float var15 = (float)var14 / 23.0F;
         int var16 = (int)rfU_2.catch_(var15, (float)var5, (float)var6);
         int var17 = (int)rfU_2.catch_(var15, (float)var7, (float)var8);
         int var18 = HQ.class_(var16, var17);
         class_(var0, var1, var18, var2, var3, var4, var9, var10, 24, var14, false, var11, var12);
         class_(var0, var1, var18, var2, var3, var4, var9, var10, 24, var14 + 1, true, var11, var12);
      }
   }

   public boolean class_(T var1, yt_3 var2, double var3, double var5, double var7) {
      if (super.class_((T)var1, var2, var3, var5, var7)) {
         return true;
      } else {
         an_3 var9 = var1.N();
         return var9 != null ? var2.class_(var9.PE()) : false;
      }
   }

   public void class_(T var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      super.class_((T)var1, var2, var3, var4, var5, var6);
      an_3 var7 = var1.N();
      if (var7 != null) {
         this.class_((T)var1, var3, var4, var5, var7);
      }
   }

   private <E extends an_3> void class_(T var1, float var2, Ml_1 var3, Hx_1 var4, E var5) {
      if (!rrbb_3.rs() || !rrdZ.new_) {
         var3.class_();
         rjU_2 var6 = var5.class_(var2);
         double var7 = (double)(rfU_2.catch_(var2, (Float)var1.private_[23], (Float)var1.private_[24]) * (float) (Math.PI / 180.0)) + (Math.PI / 2);
         rjU_2 var9 = var1.BA();
         double var10 = Math.cos(var7) * var9.protected_ + Math.sin(var7) * var9.break_;
         double var12 = Math.sin(var7) * var9.protected_ - Math.cos(var7) * var9.break_;
         double var14 = rfU_2.protected_((double)var2, (Double)var1.throws_[8], var1.rx()) + var10;
         double var16 = rfU_2.protected_((double)var2, (Double)var1.throws_[9], var1.re()) + var9.byte_;
         double var18 = rfU_2.protected_((double)var2, (Double)var1.throws_[10], var1.BO()) + var12;
         var3.class_(var10, var9.byte_, var12);
         float var20 = (float)(var6.break_ - var14);
         float var21 = (float)(var6.byte_ - var16);
         float var22 = (float)(var6.protected_ - var18);
         float var23 = 0.025F;
         Ok_1 var24 = var4.getBuffer(HU.native_());
         rjV_2 var25 = var3.byte_().class_();
         float var26 = rfU_2.implements_(var20 * var20 + var22 * var22) * 0.025F / 2.0F;
         float var27 = var22 * var26;
         float var28 = var20 * var26;
         rfH_2 var29 = new rfH_2(var1.new_(var2));
         rfH_2 var30 = new rfH_2(var5.new_(var2));
         int var31 = this.class_((T)var1, var29);
         int var32 = this.break_.class_(var5).class_(var5, var30);
         int var33 = ((rYB)var1.throws_[7]).class_(rRo_1.SKY, var29);
         int var34 = ((rYB)var1.throws_[7]).class_(rRo_1.SKY, var30);
         if (rrbb_3.rs()) {
            rrdZ.Z();
         }

         class_(var24, var25, var20, var21, var22, var31, var32, var33, var34, 0.025F, 0.025F, var27, var28);
         class_(var24, var25, var20, var21, var22, var31, var32, var33, var34, 0.025F, 0.0F, var27, var28);
         if (rrbb_3.rs()) {
            rrdZ.v();
         }

         var3.break_();
      }
   }

   protected boolean break_(T var1) {
      return super.break_((T)var1) && (var1.rJ() || var1.Bk() && var1 == this.break_.byte_);
   }
}
