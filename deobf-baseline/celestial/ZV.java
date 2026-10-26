package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class ZV extends Fu_1<rJz_1> {
   private static final rqO_2 id_class = new rqO_2("textures/gui/container/hopper.png");

   public ZV(rJz_1 var1, rhz_3 var2, rgP_2 var3) {
      super(var1, var2, var3);
      this.id_continue = false;
      this.id_return = 133;
      this.id_try = this.id_return - 94;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      super.id_class(var1, var2, var3, var4);
      this.id_break(var1, var2, var3);
   }

   @Override
   protected void id_class(Ml_1 var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.id_volatile.A().id_class(id_class);
      int var5 = (this.id_package - this.id_synchronized) / 2;
      int var6 = (this.id_int - this.id_return) / 2;
      this.id_break(var1, var5, var6, 0, 0, this.id_synchronized, this.id_return);
   }
}
