package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class pJ_2 implements yD_2 {
   private final QY id_class;

   public pJ_2(QY var1) {
      this.id_class = var1;
   }

   @Override
   public void id_class(Ml_1 var1, Hx_1 var2, double var3, double var5, double var7) {
      rfH_2 var9 = ((cb_3)this.id_class.id_class[57]).Bs();
      rYB var10 = (rYB)((cb_3)this.id_class.id_class[57]).id_throws[7];
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.color4f(0.0F, 1.0F, 0.0F, 0.75F);
      RenderSystem.disableTexture();
      RenderSystem.lineWidth(6.0F);

      for (rfH_2 var12 : rfH_2.id_class(var9.id_break(-10, -10, -10), var9.id_break(10, 10, 10))) {
         rXE var13 = var10.id_break(var12);
         if (var13.id_class(rlG_2.id_break)) {
            double var14 = (double)((float)var12.c_() + var13.id_class((rRq_1)var10, var12));
            yK_2.id_class(
               new rfl_3(
                     (double)((float)var12.b_() + 0.01F),
                     (double)((float)var12.c_() + 0.01F),
                     (double)((float)var12.d_() + 0.01F),
                     (double)((float)var12.b_() + 0.99F),
                     var14,
                     (double)((float)var12.d_() + 0.99F)
                  )
                  .id_protected(-var3, -var5, -var7),
               1.0F,
               1.0F,
               1.0F,
               0.2F
            );
         }
      }

      for (rfH_2 var17 : rfH_2.id_class(var9.id_break(-10, -10, -10), var9.id_break(10, 10, 10))) {
         rXE var18 = var10.id_break(var17);
         if (var18.id_class(rlG_2.id_break)) {
            yK_2.id_class(
               String.valueOf(var18.id_throws()),
               (double)var17.b_() + 0.5,
               (double)((float)var17.c_() + var18.id_class((rRq_1)var10, var17)),
               (double)var17.d_() + 0.5,
               -16777216
            );
         }
      }

      RenderSystem.enableTexture();
      RenderSystem.disableBlend();
   }
}
