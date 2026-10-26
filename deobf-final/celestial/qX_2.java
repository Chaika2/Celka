package celestial;

import java.util.Random;

public class qX_2 extends pV_2<rsE_2> {
   private final Hz_1 class_;
   private final Random throws_ = new Random();

   public qX_2(pg_3 var1, Hz_1 var2) {
      super(var1);
      this.class_ = var2;
      this.byte_ = 0.15F;
      this.protected_ = 0.75F;
   }

   public rqO_2 class_(rsE_2 var1) {
      return fJ_2.class_;
   }

   private int class_(rdn_3 var1) {
      if (var1.char_() > 48) {
         return 5;
      } else if (var1.char_() > 32) {
         return 4;
      } else if (var1.char_() > 16) {
         return 3;
      } else {
         return var1.char_() > 1 ? 2 : 1;
      }
   }

   public void class_(rsE_2 var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      ItemPhysics var7 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().Z();
      boolean var8 = var7.aJ_();
      float var9 = var7.new_();
      var4.class_();
      rdn_3 var10 = var1.protected_();
      int var11 = var10.class_() ? 187 : rdb_3.class_(var10.break_()) + var10.catch_();
      this.throws_.setSeed((long)var11);
      IJ var12 = this.class_.class_(var10, (rYB)var1.throws_[7], null);
      boolean var13 = var12.break_();
      int var14 = this.class_(var10);
      if (!var8) {
         float var15 = rfU_2.class_(((float)var1.catch_() + var3) / 10.0F + var1.class_) * 0.1F + 0.1F;
         if (!this.case_()) {
            var15 = 0.0F;
         }

         float var16 = var12.case_().class_(IQ.GROUND).protected_.break_();
         var4.class_(0.0, (double)(var15 + 0.25F * var16), 0.0);
         float var17 = var1.byte_(var3);
         var4.class_(rje_3.protected_.break_(var17));
      } else {
         boolean var22 = var1.PZ();
         if (var22) {
            var4.class_(0.0, 0.15F, 0.0);
         }

         if (!var1.BL() && !var22) {
            float var24 = (((float)var1.catch_() + var3) / 20.0F + var1.class_) * (180.0F / (float)Math.PI);
            var4.class_(rje_3.break_.byte_(var24 * var9));
         } else {
            var4.class_(rje_3.protected_.byte_((Float)var1.throws_[15]));
            var4.class_(rje_3.break_.byte_((Float)var1.throws_[16] + (var1.protected_().break_() instanceof rxJ_2 ? 0.0F : 90.0F)));
         }
      }

      float var23 = var12.case_().private_.protected_.class_();
      float var25 = var12.case_().private_.protected_.break_();
      float var26 = var12.case_().private_.protected_.byte_();
      if (!var13) {
         float var18 = -0.0F * (float)(var14 - 1) * 0.5F * var23;
         float var19 = -0.0F * (float)(var14 - 1) * 0.5F * var25;
         float var20 = -0.09375F * (float)(var14 - 1) * 0.5F * var26;
         var4.class_((double)var18, (double)var19, (double)var20);
      }

      for (int var27 = 0; var27 < var14; var27++) {
         var4.class_();
         if (var27 > 0) {
            if (var13) {
               float var28 = (this.throws_.nextFloat() * 2.0F - 1.0F) * 0.15F;
               float var30 = (this.throws_.nextFloat() * 2.0F - 1.0F) * 0.15F;
               float var21 = (this.throws_.nextFloat() * 2.0F - 1.0F) * 0.15F;
               if (!this.throws_()) {
                  var28 = 0.0F;
                  var30 = 0.0F;
               }

               var4.class_((double)var28, (double)var30, (double)var21);
            } else {
               float var29 = (this.throws_.nextFloat() * 2.0F - 1.0F) * 0.15F * 0.5F;
               float var31 = (this.throws_.nextFloat() * 2.0F - 1.0F) * 0.15F * 0.5F;
               var4.class_((double)var29, (double)var31, 0.0);
            }
         }

         this.class_.class_(var10, IQ.GROUND, false, var4, var5, var6, fZ_2.class_, var12);
         var4.break_();
         if (!var13) {
            var4.class_((double)(0.0F * var23), (double)(0.0F * var25), (double)(0.09375F * var26));
         }
      }

      var4.break_();
      super.class_(var1, var2, var3, var4, var5, var6);
   }

   public boolean throws_() {
      return true;
   }

   public boolean case_() {
      return true;
   }
}
