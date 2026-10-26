package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.Map.Entry;

public class yR_2 implements yD_2 {
   final QY id_class;
   private double id_break = Double.MIN_VALUE;
   private final int id_byte = 12;
   private yY_2 id_protected;

   public yR_2(QY var1) {
      this.id_class = var1;
   }

   @Override
   public void id_class(Ml_1 var1, Hx_1 var2, double var3, double var5, double var7) {
      double var9 = (double)rqR_2.id_byte();
      if (var9 - this.id_break > 3.0E9) {
         this.id_break = var9;
         rng_3 var11 = this.id_class.id_this();
         if (var11 != null) {
            this.id_protected = new yY_2(this, var11, var3, var7);
         } else {
            this.id_protected = null;
         }
      }

      if (this.id_protected != null) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.lineWidth(2.0F);
         RenderSystem.disableTexture();
         RenderSystem.depthMask(false);
         Map var24 = this.id_protected.id_break.getNow((Map<rfj_3, String>)null);
         double var12 = ((Hh_1)this.id_class.id_class[16]).id_finally().id_break().id_byte * 0.85;

         for (Entry var15 : this.id_protected.id_class.entrySet()) {
            rfj_3 var16 = (rfj_3)var15.getKey();
            String var17 = (String)var15.getValue();
            if (var24 != null) {
               var17 = var17 + (String)var24.get(var16);
            }

            String[] var18 = var17.split("\n");
            byte var19 = 0;

            for (String var23 : var18) {
               yK_2.id_class(var23, (double)((var16.id_break << 4) + 8), var12 + (double)var19, (double)((var16.id_byte << 4) + 8), -1, 0.15F);
               var19 -= 2;
            }
         }

         RenderSystem.depthMask(true);
         RenderSystem.enableTexture();
         RenderSystem.disableBlend();
      }
   }
}
