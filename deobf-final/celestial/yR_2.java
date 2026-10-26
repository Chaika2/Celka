package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.Map.Entry;

public class yR_2 implements yD_2 {
   final QY class_;
   private double break_ = Double.MIN_VALUE;
   private final int byte_ = 12;
   private yY_2 protected_;

   public yR_2(QY var1) {
      this.class_ = var1;
   }

   @Override
   public void class_(Ml_1 var1, Hx_1 var2, double var3, double var5, double var7) {
      double var9 = (double)rqR_2.byte_();
      if (var9 - this.break_ > 3.0E9) {
         this.break_ = var9;
         rng_3 var11 = this.class_.this_();
         if (var11 != null) {
            this.protected_ = new yY_2(this, var11, var3, var7);
         } else {
            this.protected_ = null;
         }
      }

      if (this.protected_ != null) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.lineWidth(2.0F);
         RenderSystem.disableTexture();
         RenderSystem.depthMask(false);
         Map var24 = this.protected_.break_.getNow((Map<rfj_3, String>)null);
         double var12 = ((Hh_1)this.class_.class_[16]).finally_().break_().byte_ * 0.85;

         for (Entry var15 : this.protected_.class_.entrySet()) {
            rfj_3 var16 = (rfj_3)var15.getKey();
            String var17 = (String)var15.getValue();
            if (var24 != null) {
               var17 = var17 + (String)var24.get(var16);
            }

            String[] var18 = var17.split("\n");
            byte var19 = 0;

            for (String var23 : var18) {
               yK_2.class_(var23, (double)((var16.break_ << 4) + 8), var12 + (double)var19, (double)((var16.byte_ << 4) + 8), -1, 0.15F);
               var19 -= 2;
            }
         }

         RenderSystem.depthMask(true);
         RenderSystem.enableTexture();
         RenderSystem.disableBlend();
      }
   }
}
