package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

class mY_2 extends Lg_1<mY_2> {
   mY_2(mR_2 var1) {
      this.class_ = var1;
   }

   private void class_(Ml_1 var1, int var2, int var3, rdn_3 var4) {
      this.class_(var1, var2 + 1, var3 + 1);
      RenderSystem.enableRescaleNormal();
      if (!var4.class_()) {
         this.class_.class_.final_.class_(var4, (float)(var2 + 2), (float)(var3 + 2));
      }

      RenderSystem.disableRescaleNormal();
   }

   private void class_(Ml_1 var1, int var2, int var3) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      mR_2.class_(this.class_).A().class_(ch_3.byte_);
      ch_3.class_(var1, var2, var3, this.class_.class_.h_(), 0.0F, 0.0F, 18, 18, 128, 128);
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      rKN var11 = this.class_.class_.case_.case_().get(this.class_.class_.case_.case_().size() - var2 - 1);
      xc_3 var12 = var11.break_();
      rdb_3 var13 = var12.break_().case_();
      if (var13 == rdy_3.class_) {
         if (var12.class_(xu_3.try_)) {
            var13 = rdy_3.hR;
         } else if (var12.class_(xu_3.instanceof_)) {
            var13 = rdy_3.hY;
         }
      }

      rdn_3 var14 = new rdn_3(var13);
      this.class_(var1, var4, var3, var14);
      this.class_.class_.super_.byte_(var1, var13.implements_(var14), (float)(var4 + 18 + 5), (float)(var3 + 3), 16777215);
      String var15;
      if (var2 == 0) {
         var15 = jI_2.class_("createWorld.customize.flat.layer.top", var11.class_());
      } else if (var2 == this.class_.class_.case_.case_().size() - 1) {
         var15 = jI_2.class_("createWorld.customize.flat.layer.bottom", var11.class_());
      } else {
         var15 = jI_2.class_("createWorld.customize.flat.layer", var11.class_());
      }

      this.class_.class_.super_.break_(var1, var15, (float)(var4 + 2 + 213 - this.class_.class_.super_.break_(var15)), (float)(var3 + 3), 16777215);
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      if (var5 == 0) {
         this.class_.class_(this);
         return true;
      } else {
         return false;
      }
   }
}
