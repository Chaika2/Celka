package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class Hm_1 {
   private static final rqO_2 id_class = new rqO_2("textures/misc/underwater.png");

   public static void id_class(QY var0, Ml_1 var1) {
      RenderSystem.disableAlphaTest();
      cb_3 var2 = (cb_3)var0.id_class[57];
      if (!((cb_3)var0.id_class[57]).id_native() && ((cb_3)var0.id_class[57]).id_class(rlG_2.id_break) && !rrxr_3.K.id_break(var2, var1)) {
         id_break(var0, var1);
      }

      RenderSystem.enableAlphaTest();
   }

   private static void id_break(QY var0, Ml_1 var1) {
      if (!rrbb_3.rs() || rrdZ.id_int()) {
         RenderSystem.enableTexture();
         var0.A().id_class(id_class);
         if (rrMh_1.id_class()) {
            rrMh_1.id_class(var0.A().id_break(id_class).id_new());
         }

         lD_2 var2 = yb_3.id_class().id_byte();
         float var3 = ((cb_3)var0.id_class[57]).rX();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         float var4 = -(Float)((cb_3)var0.id_class[57]).id_throws[15] / 64.0F;
         float var5 = (Float)((cb_3)var0.id_class[57]).id_throws[16] / 64.0F;
         rjV_2 var6 = var1.id_byte().id_class();
         var2.id_class(7, ju_3.id_return);
         var2.id_class(var6, -1.0F, -1.0F, -0.5F).id_class(var3, var3, var3, 0.1F).id_class(4.0F + var4, 4.0F + var5).id_class();
         var2.id_class(var6, 1.0F, -1.0F, -0.5F).id_class(var3, var3, var3, 0.1F).id_class(0.0F + var4, 4.0F + var5).id_class();
         var2.id_class(var6, 1.0F, 1.0F, -0.5F).id_class(var3, var3, var3, 0.1F).id_class(0.0F + var4, 0.0F + var5).id_class();
         var2.id_class(var6, -1.0F, 1.0F, -0.5F).id_class(var3, var3, var3, 0.1F).id_class(4.0F + var4, 0.0F + var5).id_class();
         var2.id_finally();
         yk_3.id_class(var2);
         RenderSystem.disableBlend();
      }
   }
}
