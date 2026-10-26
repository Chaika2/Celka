package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class HE {
   public static float class_;
   public static float break_;
   public static float byte_;
   private static int throws_ = -1;
   private static int case_ = -1;
   private static long catch_ = -1L;
   public static boolean protected_ = false;

   public static void class_(ly_3 var0, HG var1, float var2, boolean var3, float var4) {
      float var5;
      float var6;
      if (var3) {
         protected_ = true;
         var5 = var2 * 0.05F;
         var6 = Math.min(var2, 192.0F) * 0.5F;
      } else if (var1 == HG.FOG_SKY) {
         protected_ = true;
         var5 = 0.0F;
         var6 = var2;
      } else {
         protected_ = true;
         var5 = var2 * rrbb_3.public_();
         var6 = var2;
      }

      RenderSystem.fogStart(var5);
      RenderSystem.fogEnd(var6);
      RenderSystem.fogMode(MD.LINEAR);
      RenderSystem.setupNvFogDistance();
   }

   public static void class_(ly_3 var0, float var1, gm_3 var2, int var3, float var4) {
      rXE var5 = var0.finally_();
      if (var5.class_(rlG_2.break_)) {
         long var6 = rqR_2.break_();
         int var8 = var2.implements_(new rfH_2(var0.break_())).final_();
         if (catch_ < 0L) {
            throws_ = var8;
            case_ = var8;
            catch_ = var6;
         }

         int var9 = throws_ >> 16 & 0xFF;
         int var10 = throws_ >> 8 & 0xFF;
         int var11 = throws_ & 0xFF;
         int var12 = case_ >> 16 & 0xFF;
         int var13 = case_ >> 8 & 0xFF;
         int var14 = case_ & 0xFF;
         float var15 = rfU_2.class_((float)(var6 - catch_) / 5000.0F, 0.0F, 1.0F);
         float var16 = rfU_2.catch_(var15, (float)var12, (float)var9);
         float var17 = rfU_2.catch_(var15, (float)var13, (float)var10);
         float var18 = rfU_2.catch_(var15, (float)var14, (float)var11);
         class_ = var16 / 255.0F;
         break_ = var17 / 255.0F;
         byte_ = var18 / 255.0F;
         if (throws_ != var8) {
            throws_ = var8;
            case_ = rfU_2.protected_(var16) << 16 | rfU_2.protected_(var17) << 8 | rfU_2.protected_(var18);
            catch_ = var6;
         }
      } else if (var5.class_(rlG_2.byte_)) {
         class_ = 0.6F;
         break_ = 0.1F;
         byte_ = 0.0F;
         catch_ = -1L;
      } else {
         float var19 = 0.25F + 0.75F * (float)var3 / 32.0F;
         var19 = 1.0F - (float)Math.pow((double)var19, 0.25);
         rjU_2 var7 = var2.class_(var0.byte_(), var1);
         var7 = rrbN_2.break_(var7, var2, var0.catch_(), var1);
         float var24 = (float)var7.break_;
         float var29 = (float)var7.byte_;
         float var33 = (float)var7.protected_;
         float var34 = rfU_2.class_(rfU_2.break_(var2.protected_(var1) * (float) (Math.PI * 2)) * 2.0F + 0.5F, 0.0F, 1.0F);
         rYA var35 = var2.static_();
         rjU_2 var36 = var0.break_().class_(2.0, 2.0, 2.0).class_(0.25);
         rjU_2 var37 = ryD_2.class_(var36, (var3x, var4x, var5x) -> var2.break_().class_(rjU_2.class_(var35.class_(var3x, var4x, var5x).case_()), var34));
         var37 = rrbN_2.class_(var37, var2, var0.catch_(), var1);
         class_ = (float)var37.class_();
         break_ = (float)var37.break_();
         byte_ = (float)var37.byte_();
         if (var3 >= 4) {
            float var39 = rfU_2.class_(var2.throws_(var1)) > 0.0F ? -1.0F : 1.0F;
            rje_3 var41 = new rje_3(var39, 0.0F, 0.0F);
            float var44 = var0.volatile_().byte_(var41);
            if (var44 < 0.0F) {
               var44 = 0.0F;
            }

            if (var44 > 0.0F) {
               float[] var48 = var2.break_().class_(var2.protected_(var1), var1);
               if (var48 != null) {
                  var44 *= var48[3];
                  class_ = class_ * (1.0F - var44) + var48[0] * var44;
                  break_ = break_ * (1.0F - var44) + var48[1] * var44;
                  byte_ = byte_ * (1.0F - var44) + var48[2] * var44;
               }
            }
         }

         class_ = class_ + (var24 - class_) * var19;
         break_ = break_ + (var29 - break_) * var19;
         byte_ = byte_ + (var33 - byte_) * var19;
         float var40 = var2.private_(var1);
         if (var40 > 0.0F) {
            float var42 = 1.0F - var40 * 0.5F;
            float var46 = 1.0F - var40 * 0.4F;
            class_ *= var42;
            break_ *= var42;
            byte_ *= var46;
         }

         float var43 = var2.case_(var1);
         if (var43 > 0.0F) {
            float var47 = 1.0F - var43 * 0.5F;
            class_ *= var47;
            break_ *= var47;
            byte_ *= var47;
         }

         catch_ = -1L;
      }

      double var21 = var0.break_().byte_ * var2.synchronized_().final_();
      if (var21 < 1.0 && !var5.class_(rlG_2.byte_)) {
         if (var21 < 0.0) {
            var21 = 0.0;
         }

         var21 *= var21;
         class_ = (float)((double)class_ * var21);
         break_ = (float)((double)break_ * var21);
         byte_ = (float)((double)byte_ * var21);
      }

      if (var4 > 0.0F) {
         class_ = class_ * (1.0F - var4) + class_ * 0.7F * var4;
         break_ = break_ * (1.0F - var4) + break_ * 0.6F * var4;
         byte_ = byte_ * (1.0F - var4) + byte_ * 0.6F * var4;
      }

      if (var5.class_(rlG_2.break_)) {
         float var25 = 0.0F;
         if (var0.catch_() == (cb_3)QY.instanceof_().class_[57]) {
            var25 = ((cb_3)QY.instanceof_().class_[57]).public_();
         }

         float var30 = Math.min(1.0F / class_, Math.min(1.0F / break_, 1.0F / byte_));
         if (Float.isInfinite(var30)) {
            var30 = Math.nextAfter(var30, 0.0);
         }

         class_ = class_ * (1.0F - var25) + class_ * var30 * var25;
         break_ = break_ * (1.0F - var25) + break_ * var30 * var25;
         byte_ = byte_ * (1.0F - var25) + byte_ * var30 * var25;
      } else if (((Qw_1)QY.instanceof_().class_[20]).a == 100.0) {
         float var26 = 1.0F;
         float var31 = Math.min(1.0F / class_, Math.min(1.0F / break_, 1.0F / byte_));
         if (Float.isInfinite(var31)) {
            var31 = Math.nextAfter(var31, 0.0);
         }

         class_ = class_ * (1.0F - var26) + class_ * var31 * var26;
         break_ = break_ * (1.0F - var26) + break_ * var31 * var26;
         byte_ = byte_ * (1.0F - var26) + byte_ * var31 * var26;
      } else if (var0.catch_() instanceof iB_2 && ((iB_2)var0.catch_()).break_(rLD.int_)) {
         float var27 = Hh_1.class_((iB_2)var0.catch_(), var1);
         float var32 = Math.min(1.0F / class_, Math.min(1.0F / break_, 1.0F / byte_));
         if (Float.isInfinite(var32)) {
            var32 = Math.nextAfter(var32, 0.0);
         }

         class_ = class_ * (1.0F - var27) + class_ * var32 * var27;
         break_ = break_ * (1.0F - var27) + break_ * var32 * var27;
         byte_ = byte_ * (1.0F - var27) + byte_ * var32 * var27;
      }

      if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().K().else_()) {
         float var28 = 0.2F;
         rrdZ.class_(var28, var28, var28, 0.0F);
         RenderSystem.clearColor(var28, var28, var28, 0.0F);
      } else {
         rrdZ.class_(class_, break_, byte_, 0.0F);
         RenderSystem.clearColor(class_, break_, byte_, 0.0F);
      }
   }

   public static void class_(ly_3 var0, HG var1, float var2, boolean var3) {
      class_(var0, var1, var2, var3, 0.0F);
   }

   public static void class_() {
      RenderSystem.fogDensity(0.0F);
      RenderSystem.fogMode(MD.EXP2);
   }

   public static void break_() {
      RenderSystem.fog(2918, class_, break_, byte_, 1.0F);
      if (rrbb_3.rs()) {
         rrdZ.class_(class_, break_, byte_);
      }
   }
}
