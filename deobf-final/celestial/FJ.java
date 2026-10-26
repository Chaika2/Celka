package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

abstract class FJ extends Lv_1 {
   private boolean class_;

   protected FJ(int var1, int var2) {
      super(var1, var2, 22, 22, rgN_2.byte_);
   }

   public void class_(boolean var1) {
      this.class_ = var1;
   }

   protected abstract void class_(Ml_1 var1);

   @Override
   public void break_(Ml_1 var1, int var2, int var3, float var4) {
      QY.instanceof_().A().class_(Fh_1.class_);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      short var5 = 219;
      int var6 = 0;
      if (!this.int_) {
         var6 += this.extends_ * 2;
      } else if (this.class_) {
         var6 += this.extends_ * 1;
      } else if (this.B_()) {
         var6 += this.extends_ * 3;
      }

      this.break_(var1, this.volatile_, this.final_, var6, 219, this.extends_, this.native_);
      this.class_(var1);
   }

   public boolean private_() {
      return this.class_;
   }
}
