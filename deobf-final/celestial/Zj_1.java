package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class Zj_1 extends Fu_1<rJJ> {
   private static final rqO_2 class_ = new rqO_2("textures/gui/container/grindstone.png");

   public Zj_1(rJJ var1, rhz_3 var2, rgP_2 var3) {
      super(var1, var2, var3);
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      this.class_(var1, var4, var2, var3);
      super.class_(var1, var2, var3, var4);
      this.break_(var1, var2, var3);
   }

   @Override
   protected void class_(Ml_1 var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.volatile_.A().class_(class_);
      int var5 = (this.package_ - this.synchronized_) / 2;
      int var6 = (this.int_ - this.return_) / 2;
      this.break_(var1, var5, var6, 0, 0, this.synchronized_, this.return_);
      if ((this.instanceof_.class_(0).break_() || this.instanceof_.class_(1).break_()) && !this.instanceof_.class_(2).break_()) {
         this.break_(var1, var5 + 92, var6 + 31, this.synchronized_, 0, 28, 21);
      }
   }
}
