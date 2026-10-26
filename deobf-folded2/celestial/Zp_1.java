package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class Zp_1 extends Lg_1<Zp_1> {
   public Zp_1(Zy_1 var1) {
      this.id_class = var1;
   }

   void id_class() {
      this.id_class.id_class(this);
      ZH var1 = Zl_1.id_throws.get(this.id_class.x_().indexOf(this));
      rVF var2 = this.id_class.id_class.id_case.id_class.id_case.id_break().id_break(rVL.n);
      this.id_class.id_class.id_synchronized = var1.id_byte.apply(var2);
      this.id_class.id_class.id_else.id_class(Zl_1.id_class(var2, this.id_class.id_class.id_synchronized));
      this.id_class.id_class.id_else.id_extends();
   }

   private void id_class(Ml_1 var1, int var2, int var3, rdb_3 var4) {
      this.id_class(var1, var2 + 1, var3 + 1);
      RenderSystem.enableRescaleNormal();
      this.id_class.id_class.id_final.id_class(new rdn_3(var4), (float)(var2 + 2), (float)(var3 + 2));
      RenderSystem.disableRescaleNormal();
   }

   private void id_class(Ml_1 var1, int var2, int var3) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      Zy_1.id_class(this.id_class).A().id_class(ch_3.id_byte);
      ch_3.id_class(var1, var2, var3, this.id_class.id_class.h_(), 0.0F, 0.0F, 18, 18, 128, 128);
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      ZH var11 = Zl_1.id_throws.get(var2);
      this.id_class(var1, var4, var3, var11.id_class);
      this.id_class.id_class.id_super.id_byte(var1, var11.id_break, (float)(var4 + 18 + 5), (float)(var3 + 6), 16777215);
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      if (var5 == 0) {
         this.id_class();
      }

      return false;
   }
}
