package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

abstract class FJ extends Lv_1 {
   private boolean id_class;

   protected FJ(int var1, int var2) {
      super(var1, var2, 22, 22, rgN_2.id_byte);
   }

   public void id_class(boolean var1) {
      this.id_class = var1;
   }

   protected abstract void id_class(Ml_1 var1);

   @Override
   public void id_break(Ml_1 var1, int var2, int var3, float var4) {
      QY.id_instanceof().A().id_class(Fh_1.id_class);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      short var5 = 219;
      int var6 = 0;
      if (!this.id_int) {
         var6 += this.id_extends * 2;
      } else if (this.id_class) {
         var6 += this.id_extends * 1;
      } else if (this.B_()) {
         var6 += this.id_extends * 3;
      }

      this.id_break(var1, this.id_volatile, this.id_final, var6, 219, this.id_extends, this.id_native);
      this.id_class(var1);
   }

   public boolean id_private() {
      return this.id_class;
   }
}
