package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class Hm_1 {
   private static final rqO_2 class_ = new rqO_2("textures/misc/underwater.png");

   public static void class_(QY var0, Ml_1 var1) {
      RenderSystem.disableAlphaTest();
      cb_3 var2 = (cb_3)var0.class_[57];
      if (!((cb_3)var0.class_[57]).native_() && ((cb_3)var0.class_[57]).class_(rlG_2.break_) && !rrxr_3.K.break_(var2, var1)) {
         break_(var0, var1);
      }

      RenderSystem.enableAlphaTest();
   }

   private static void break_(QY var0, Ml_1 var1) {
      if (!rrbb_3.rs() || rrdZ.int_()) {
         RenderSystem.enableTexture();
         var0.A().class_(class_);
         if (rrMh_1.class_()) {
            rrMh_1.class_(var0.A().break_(class_).new_());
         }

         lD_2 var2 = yb_3.class_().byte_();
         float var3 = ((cb_3)var0.class_[57]).rX();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         float var4 = -(Float)((cb_3)var0.class_[57]).throws_[15] / 64.0F;
         float var5 = (Float)((cb_3)var0.class_[57]).throws_[16] / 64.0F;
         rjV_2 var6 = var1.byte_().class_();
         var2.class_(7, ju_3.return_);
         var2.class_(var6, -1.0F, -1.0F, -0.5F).class_(var3, var3, var3, 0.1F).class_(4.0F + var4, 4.0F + var5).class_();
         var2.class_(var6, 1.0F, -1.0F, -0.5F).class_(var3, var3, var3, 0.1F).class_(0.0F + var4, 4.0F + var5).class_();
         var2.class_(var6, 1.0F, 1.0F, -0.5F).class_(var3, var3, var3, 0.1F).class_(0.0F + var4, 0.0F + var5).class_();
         var2.class_(var6, -1.0F, 1.0F, -0.5F).class_(var3, var3, var3, 0.1F).class_(4.0F + var4, 0.0F + var5).class_();
         var2.finally_();
         yk_3.class_(var2);
         RenderSystem.disableBlend();
      }
   }
}
