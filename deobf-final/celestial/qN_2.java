package celestial;

public class qN_2<T extends rsJ_2> extends pV_2<T> {
   private static final rqO_2 throws_ = new rqO_2("textures/entity/minecart.png");
   protected final tp_3<T> class_ = new wr_3<>();

   public qN_2(pg_3 var1) {
      super(var1);
      this.byte_ = 0.7F;
   }

   protected void class_(T var1, float var2, xc_3 var3, Ml_1 var4, Hx_1 var5, int var6) {
      QY.instanceof_().synchronized_().class_(var3, var4, var5, var6, fZ_2.class_);
   }

   public void class_(T var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      super.class_((T)var1, var2, var3, var4, var5, var6);
      var4.class_();
      long var7 = (long)var1.V() * 493286711L;
      var7 = var7 * var7 * 4392167121L + var7 * 98761L;
      float var9 = (((float)(var7 >> 16 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      float var10 = (((float)(var7 >> 20 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      float var11 = (((float)(var7 >> 24 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      var4.class_((double)var9, (double)var10, (double)var11);
      double var12 = rfU_2.protected_((double)var3, (Double)var1.throws_[34], var1.rx());
      double var14 = rfU_2.protected_((double)var3, (Double)var1.throws_[35], var1.re());
      double var16 = rfU_2.protected_((double)var3, (Double)var1.throws_[36], var1.BO());
      double var18 = 0.3F;
      rjU_2 var20 = var1.continue_(var12, var14, var16);
      float var21 = rfU_2.catch_(var3, (Float)var1.throws_[18], (Float)var1.throws_[16]);
      if (var20 != null) {
         rjU_2 var22 = var1.class_(var12, var14, var16, 0.3F);
         rjU_2 var23 = var1.class_(var12, var14, var16, -0.3F);
         if (var22 == null) {
            var22 = var20;
         }

         if (var23 == null) {
            var23 = var20;
         }

         var4.class_(var20.break_ - var12, (var22.byte_ + var23.byte_) / 2.0 - var14, var20.protected_ - var16);
         rjU_2 var24 = var23.break_(-var22.break_, -var22.byte_, -var22.protected_);
         if (var24.case_() != 0.0) {
            var24 = var24.protected_();
            var2 = (float)(Math.atan2(var24.protected_, var24.break_) * 180.0 / Math.PI);
            var21 = (float)(Math.atan(var24.byte_) * 73.0);
         }
      }

      var4.class_(0.0, 0.375, 0.0);
      var4.class_(rje_3.protected_.byte_(180.0F - var2));
      var4.class_(rje_3.case_.byte_(-var21));
      float var28 = (float)var1.private_() - var3;
      float var29 = var1.catch_() - var3;
      if (var29 < 0.0F) {
         var29 = 0.0F;
      }

      if (var28 > 0.0F) {
         var4.class_(rje_3.break_.byte_(rfU_2.class_(var28) * var28 * var29 / 10.0F * (float)var1.implements_()));
      }

      int var31 = var1.new_();
      xc_3 var25 = var1.package_();
      if (var25.private_() != xN_2.INVISIBLE) {
         var4.class_();
         float var26 = 0.75F;
         var4.class_(0.75F, 0.75F, 0.75F);
         var4.class_(-0.5, (double)((float)(var31 - 8) / 16.0F), 0.5);
         var4.class_(rje_3.protected_.byte_(90.0F));
         this.class_((T)var1, var3, var25, var4, var5, var6);
         var4.break_();
      }

      var4.class_(-1.0F, -1.0F, 1.0F);
      this.class_.class_((T)var1, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
      Ok_1 var32 = var5.getBuffer(this.class_.class_(this.class_((T)var1)));
      this.class_.class_(var4, var32, var6, fZ_2.class_, 1.0F, 1.0F, 1.0F, 1.0F);
      var4.break_();
   }

   public rqO_2 class_(T var1) {
      return throws_;
   }
}
