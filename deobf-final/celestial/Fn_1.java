package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class Fn_1 extends Fu_1<rJs_1> {
   private static final rqO_2 class_ = new rqO_2("textures/gui/container/dispenser.png");

   public Fn_1(rJs_1 var1, rhz_3 var2, rgP_2 var3) {
      super(var1, var2, var3);
   }

   @Override
   protected void class_(Ml_1 var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.volatile_.A().class_(class_);
      int var5 = (this.package_ - this.synchronized_) / 2;
      int var6 = (this.int_ - this.return_) / 2;
      this.break_(var1, var5, var6, 0, 0, this.synchronized_, this.return_);
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      super.class_(var1, var2, var3, var4);
      this.break_(var1, var2, var3);
   }

   @Override
   protected void v_() {
      super.v_();
      this.public_ = (this.synchronized_ - this.super_.class_(this.extends_)) / 2;
   }
}
