package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class mX_2 extends Lm_1 {
   private final gM_2 id_super;
   private float id_this;

   public mX_2(gM_2 var1) {
      super(0, 0, 35, 27, false);
      this.id_super = var1;
      this.id_class(153, 2, 35, 0, ms_3.id_class);
   }

   private void id_class(Hz_1 var1) {
      List var2 = this.id_super.id_class();
      int var3 = this.id_throws ? -2 : 0;
      if (var2.size() == 1) {
         var1.id_break((rdn_3)var2.get(0), this.id_volatile + 9 + var3, this.id_final + 5);
      } else if (var2.size() == 2) {
         var1.id_break((rdn_3)var2.get(0), this.id_volatile + 3 + var3, this.id_final + 5);
         var1.id_break((rdn_3)var2.get(1), this.id_volatile + 14 + var3, this.id_final + 5);
      }
   }

   public gM_2 id_class() {
      return this.id_super;
   }

   public boolean id_class(VR var1) {
      List var2 = var1.id_class(this.id_super);
      this.id_new = false;
      if (var2 != null) {
         for (mG_2 var4 : var2) {
            if (var4.id_class() && var4.id_byte()) {
               this.id_new = true;
               break;
            }
         }
      }

      return this.id_new;
   }

   public void id_class(QY var1) {
      VR var2 = ((cb_3)var1.id_class[57]).Z();
      List var3 = var2.id_class(this.id_super);
      if ((rJr_1)((cb_3)var1.id_class[57]).id_implements[4] instanceof rJI) {
         for (mG_2 var5 : var3) {
            for (rkw_3 var7 : var5.id_class(var2.id_class((rJI<?>)((rJr_1)((cb_3)var1.id_class[57]).id_implements[4])))) {
               if (var2.id_protected(var7)) {
                  this.id_this = 15.0F;
                  return;
               }
            }
         }
      }
   }

   @Override
   public void id_break(Ml_1 var1, int var2, int var3, float var4) {
      if (this.id_this > 0.0F) {
         float var5 = 1.0F + 0.1F * (float)Math.sin((double)(this.id_this / 15.0F * (float) Math.PI));
         RenderSystem.pushMatrix();
         RenderSystem.translatef((float)(this.id_volatile + 8), (float)(this.id_final + 12), 0.0F);
         RenderSystem.scalef(1.0F, var5, 1.0F);
         RenderSystem.translatef((float)(-(this.id_volatile + 8)), (float)(-(this.id_final + 12)), 0.0F);
      }

      QY var9 = QY.id_instanceof();
      var9.A().id_class(this.id_class);
      RenderSystem.disableDepthTest();
      int var6 = this.id_case;
      int var7 = this.id_catch;
      if (this.id_throws) {
         var6 += this.id_private;
      }

      if (this.B_()) {
         var7 += this.id_implements;
      }

      int var8 = this.id_volatile;
      if (this.id_throws) {
         var8 -= 2;
      }

      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.id_break(var1, var8, this.id_final, var6, var7, this.id_extends, this.id_native);
      RenderSystem.enableDepthTest();
      this.id_class(var9.id_float());
      if (this.id_this > 0.0F) {
         RenderSystem.popMatrix();
         this.id_this -= var4;
      }
   }
}
