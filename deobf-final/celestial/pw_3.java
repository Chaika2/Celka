package celestial;

import java.util.Random;

public class pw_3 extends pV_2<rSu_1> {
   public static final rqO_2 class_ = new rqO_2("textures/entity/end_crystal/end_crystal_beam.png");
   private static final rqO_2 throws_ = new rqO_2("textures/entity/enderdragon/dragon_exploding.png");
   private static final rqO_2 case_ = new rqO_2("textures/entity/enderdragon/dragon.png");
   private static final rqO_2 catch_ = new rqO_2("textures/entity/enderdragon/dragon_eyes.png");
   private static final HU private_ = HU.protected_(case_);
   private static final HU implements_ = HU.finally_(case_);
   private static final HU finally_ = HU.volatile_(catch_);
   private static final HU extends_ = HU.implements_(class_);
   private static final float native_ = (float)(Math.sqrt(3.0) / 2.0);
   private final pI_2 volatile_ = new pI_2();

   private static void byte_(Ok_1 var0, rjV_2 var1, float var2, float var3) {
      var0.class_(var1, 0.0F, var2, 1.0F * var3).break_(255, 0, 255, 0).class_();
   }

   public pw_3(pg_3 var1) {
      super(var1);
      this.byte_ = 0.5F;
   }

   public rqO_2 class_(rSu_1 var1) {
      return case_;
   }

   private static void class_(Ok_1 var0, rjV_2 var1, int var2) {
      var0.class_(var1, 0.0F, 0.0F, 0.0F).break_(255, 255, 255, var2).class_();
      var0.class_(var1, 0.0F, 0.0F, 0.0F).break_(255, 255, 255, var2).class_();
   }

   private static void class_(Ok_1 var0, rjV_2 var1, float var2, float var3) {
      var0.class_(var1, -native_ * var3, var2, -0.5F * var3).break_(255, 0, 255, 0).class_();
   }

   public void class_(rSu_1 var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      var4.class_();
      float var7 = (float)var1.class_(7, var3)[0];
      float var8 = (float)(var1.class_(5, var3)[1] - var1.class_(10, var3)[1]);
      var4.class_(rje_3.protected_.byte_(-var7));
      var4.class_(rje_3.break_.byte_(var8 * 10.0F));
      var4.class_(0.0, 0.0, 1.0);
      var4.class_(-1.0F, -1.0F, 1.0F);
      var4.class_(0.0, -1.501F, 0.0);
      boolean var9 = (Integer)var1.private_[10] > 0;
      this.volatile_.class_(var1, 0.0F, 0.0F, var3);
      if (var1.return_ > 0) {
         float var10 = (float)var1.return_ / 200.0F;
         Ok_1 var11 = var5.getBuffer(HU.class_(throws_, var10));
         this.volatile_.class_(var4, var11, var6, fZ_2.class_, 1.0F, 1.0F, 1.0F, 1.0F);
         Ok_1 var12 = var5.getBuffer(implements_);
         this.volatile_.class_(var4, var12, var6, fZ_2.class_(0.0F, var9), 1.0F, 1.0F, 1.0F, 1.0F);
      } else {
         Ok_1 var20 = var5.getBuffer(private_);
         this.volatile_.class_(var4, var20, var6, fZ_2.class_(0.0F, var9), 1.0F, 1.0F, 1.0F, 1.0F);
      }

      Ok_1 var21 = var5.getBuffer(finally_);
      if (rrbb_3.rs()) {
         rrdZ.double_();
      }

      rrbb_3.z().case_ = true;
      this.volatile_.class_(var4, var21, var6, fZ_2.class_, 1.0F, 1.0F, 1.0F, 1.0F);
      rrbb_3.z().case_ = false;
      if (rrbb_3.rs()) {
         rrdZ.switch_();
      }

      if (var1.return_ > 0) {
         float var22 = ((float)var1.return_ + var3) / 200.0F;
         float var24 = Math.min(var22 > 0.8F ? (var22 - 0.8F) / 0.2F : 0.0F, 1.0F);
         Random var13 = new Random(432L);
         Ok_1 var14 = var5.getBuffer(HU.else_());
         var4.class_();
         var4.class_(0.0, -1.0, -2.0);

         for (int var15 = 0; (float)var15 < (var22 + var22 * var22) / 2.0F * 60.0F; var15++) {
            var4.class_(rje_3.break_.byte_(var13.nextFloat() * 360.0F));
            var4.class_(rje_3.protected_.byte_(var13.nextFloat() * 360.0F));
            var4.class_(rje_3.case_.byte_(var13.nextFloat() * 360.0F));
            var4.class_(rje_3.break_.byte_(var13.nextFloat() * 360.0F));
            var4.class_(rje_3.protected_.byte_(var13.nextFloat() * 360.0F));
            var4.class_(rje_3.case_.byte_(var13.nextFloat() * 360.0F + var22 * 90.0F));
            float var16 = var13.nextFloat() * 20.0F + 5.0F + var24 * 10.0F;
            float var17 = var13.nextFloat() * 2.0F + 1.0F + var24 * 2.0F;
            rjV_2 var18 = var4.byte_().class_();
            int var19 = (int)(255.0F * (1.0F - var24));
            class_(var14, var18, var19);
            class_(var14, var18, var16, var17);
            break_(var14, var18, var16, var17);
            class_(var14, var18, var19);
            break_(var14, var18, var16, var17);
            byte_(var14, var18, var16, var17);
            class_(var14, var18, var19);
            byte_(var14, var18, var16, var17);
            class_(var14, var18, var16, var17);
         }

         var4.break_();
      }

      var4.break_();
      if (var1.goto_ != null) {
         var4.class_();
         float var23 = (float)(var1.goto_.rx() - rfU_2.protected_((double)var3, (Double)var1.throws_[8], var1.rx()));
         float var25 = (float)(var1.goto_.re() - rfU_2.protected_((double)var3, (Double)var1.throws_[9], var1.re()));
         float var26 = (float)(var1.goto_.BO() - rfU_2.protected_((double)var3, (Double)var1.throws_[10], var1.BO()));
         class_(var23, var25 + pt_3.class_(var1.goto_, var3), var26, var3, (Integer)var1.throws_[41], var4, var5, var6);
         var4.break_();
      }

      super.class_(var1, var2, var3, var4, var5, var6);
   }

   public static void class_(float var0, float var1, float var2, float var3, int var4, Ml_1 var5, Hx_1 var6, int var7) {
      float var8 = rfU_2.byte_(var0 * var0 + var2 * var2);
      float var9 = rfU_2.byte_(var0 * var0 + var1 * var1 + var2 * var2);
      var5.class_();
      var5.class_(0.0, 2.0, 0.0);
      var5.class_(rje_3.protected_.break_((float)(-Math.atan2((double)var2, (double)var0)) - (float) (Math.PI / 2)));
      var5.class_(rje_3.break_.break_((float)(-Math.atan2((double)var8, (double)var1)) - (float) (Math.PI / 2)));
      Ok_1 var10 = var6.getBuffer(extends_);
      float var11 = 0.0F - ((float)var4 + var3) * 0.01F;
      float var12 = rfU_2.byte_(var0 * var0 + var1 * var1 + var2 * var2) / 32.0F - ((float)var4 + var3) * 0.01F;
      byte var13 = 8;
      float var14 = 0.0F;
      float var15 = 0.75F;
      float var16 = 0.0F;
      MH var17 = var5.byte_();
      rjV_2 var18 = var17.class_();
      rjj_3 var19 = var17.break_();

      for (int var20 = 1; var20 <= 8; var20++) {
         float var21 = rfU_2.class_((float)var20 * (float) (Math.PI * 2) / 8.0F) * 0.75F;
         float var22 = rfU_2.break_((float)var20 * (float) (Math.PI * 2) / 8.0F) * 0.75F;
         float var23 = (float)var20 / 8.0F;
         var10.class_(var18, var14 * 0.2F, var15 * 0.2F, 0.0F)
            .break_(0, 0, 0, 255)
            .class_(var16, var11)
            .byte_(fZ_2.class_)
            .break_(var7)
            .class_(var19, 0.0F, -1.0F, 0.0F)
            .class_();
         var10.class_(var18, var14, var15, var9)
            .break_(255, 255, 255, 255)
            .class_(var16, var12)
            .byte_(fZ_2.class_)
            .break_(var7)
            .class_(var19, 0.0F, -1.0F, 0.0F)
            .class_();
         var10.class_(var18, var21, var22, var9)
            .break_(255, 255, 255, 255)
            .class_(var23, var12)
            .byte_(fZ_2.class_)
            .break_(var7)
            .class_(var19, 0.0F, -1.0F, 0.0F)
            .class_();
         var10.class_(var18, var21 * 0.2F, var22 * 0.2F, 0.0F)
            .break_(0, 0, 0, 255)
            .class_(var23, var11)
            .byte_(fZ_2.class_)
            .break_(var7)
            .class_(var19, 0.0F, -1.0F, 0.0F)
            .class_();
         var14 = var21;
         var15 = var22;
         var16 = var23;
      }

      var5.break_();
   }

   private static void break_(Ok_1 var0, rjV_2 var1, float var2, float var3) {
      var0.class_(var1, native_ * var3, var2, -0.5F * var3).break_(255, 0, 255, 0).class_();
   }
}
