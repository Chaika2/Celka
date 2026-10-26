package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

class mY_2 extends Lg_1<mY_2> {
   mY_2(mR_2 var1) {
      this.id_class = var1;
   }

   private void id_class(Ml_1 var1, int var2, int var3, rdn_3 var4) {
      this.id_class(var1, var2 + 1, var3 + 1);
      RenderSystem.enableRescaleNormal();
      if (!var4.id_class()) {
         this.id_class.id_class.id_final.id_class(var4, (float)(var2 + 2), (float)(var3 + 2));
      }

      RenderSystem.disableRescaleNormal();
   }

   private void id_class(Ml_1 var1, int var2, int var3) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      mR_2.id_class(this.id_class).A().id_class(ch_3.id_byte);
      ch_3.id_class(var1, var2, var3, this.id_class.id_class.h_(), 0.0F, 0.0F, 18, 18, 128, 128);
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      rKN var11 = this.id_class.id_class.id_case.id_case().get(this.id_class.id_class.id_case.id_case().size() - var2 - 1);
      xc_3 var12 = var11.id_break();
      rdb_3 var13 = var12.id_break().id_case();
      if (var13 == rdy_3.id_class) {
         if (var12.id_class(xu_3.id_try)) {
            var13 = rdy_3.hR;
         } else if (var12.id_class(xu_3.id_instanceof)) {
            var13 = rdy_3.hY;
         }
      }

      rdn_3 var14 = new rdn_3(var13);
      this.id_class(var1, var4, var3, var14);
      this.id_class.id_class.id_super.id_byte(var1, var13.id_implements(var14), (float)(var4 + 18 + 5), (float)(var3 + 3), 16777215);
      String var15;
      if (var2 == 0) {
         var15 = jI_2.id_class("createWorld.customize.flat.layer.top", var11.id_class());
      } else if (var2 == this.id_class.id_class.id_case.id_case().size() - 1) {
         var15 = jI_2.id_class("createWorld.customize.flat.layer.bottom", var11.id_class());
      } else {
         var15 = jI_2.id_class("createWorld.customize.flat.layer", var11.id_class());
      }

      this.id_class
         .id_class
         .id_super
         .id_break(var1, var15, (float)(var4 + 2 + 213 - this.id_class.id_class.id_super.id_break(var15)), (float)(var3 + 3), 16777215);
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      if (var5 == 0) {
         this.id_class.id_class(this);
         return true;
      } else {
         return false;
      }
   }
}
