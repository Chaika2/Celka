package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class pJ_2 implements yD_2 {
   private final QY class_;

   public pJ_2(QY var1) {
      this.class_ = var1;
   }

   @Override
   public void class_(Ml_1 var1, Hx_1 var2, double var3, double var5, double var7) {
      rfH_2 var9 = ((cb_3)this.class_.class_[57]).Bs();
      rYB var10 = (rYB)((cb_3)this.class_.class_[57]).throws_[7];
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.color4f(0.0F, 1.0F, 0.0F, 0.75F);
      RenderSystem.disableTexture();
      RenderSystem.lineWidth(6.0F);

      for (rfH_2 var12 : rfH_2.class_(var9.break_(-10, -10, -10), var9.break_(10, 10, 10))) {
         rXE var13 = var10.break_(var12);
         if (var13.class_(rlG_2.break_)) {
            double var14 = (double)((float)var12.c_() + var13.class_((rRq_1)var10, var12));
            yK_2.class_(
               new rfl_3(
                     (double)((float)var12.b_() + 0.01F),
                     (double)((float)var12.c_() + 0.01F),
                     (double)((float)var12.d_() + 0.01F),
                     (double)((float)var12.b_() + 0.99F),
                     var14,
                     (double)((float)var12.d_() + 0.99F)
                  )
                  .protected_(-var3, -var5, -var7),
               1.0F,
               1.0F,
               1.0F,
               0.2F
            );
         }
      }

      for (rfH_2 var17 : rfH_2.class_(var9.break_(-10, -10, -10), var9.break_(10, 10, 10))) {
         rXE var18 = var10.break_(var17);
         if (var18.class_(rlG_2.break_)) {
            yK_2.class_(
               String.valueOf(var18.throws_()),
               (double)var17.b_() + 0.5,
               (double)((float)var17.c_() + var18.class_((rRq_1)var10, var17)),
               (double)var17.d_() + 0.5,
               -16777216
            );
         }
      }

      RenderSystem.enableTexture();
      RenderSystem.disableBlend();
   }
}
