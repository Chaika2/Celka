package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class FG<T extends rXy_1> extends Fu_1<T> implements rJu_1 {
   private rqO_2 id_class;

   public FG(T var1, rhz_3 var2, rgP_2 var3, rqO_2 var4) {
      super((T)var1, var2, var3);
      this.id_class = var4;
   }

   @Override
   public void id_class(rJr_1 var1, int var2, rdn_3 var3) {
   }

   @Override
   protected void id_class(Ml_1 var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.id_volatile.A().id_class(this.id_class);
      int var5 = (this.id_package - this.id_synchronized) / 2;
      int var6 = (this.id_int - this.id_return) / 2;
      this.id_break(var1, var5, var6, 0, 0, this.id_synchronized, this.id_return);
      this.id_break(var1, var5 + 59, var6 + 20, 0, this.id_return + (this.id_instanceof.id_class(0).id_break() ? 0 : 16), 110, 16);
      if ((this.id_instanceof.id_class(0).id_break() || this.id_instanceof.id_class(1).id_break()) && !this.id_instanceof.id_class(2).id_break()) {
         this.id_break(var1, var5 + 99, var6 + 45, this.id_synchronized, 0, 28, 21);
      }
   }

   @Override
   public void id_class(rJr_1 var1, rqs_3<rdn_3> var2) {
      this.id_class(var1, 0, var1.id_class(0).id_class());
   }

   @Override
   public void id_class(rJr_1 var1, int var2, int var3) {
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      super.id_class(var1, var2, var3, var4);
      RenderSystem.disableBlend();
      this.id_break(var1, var2, var3, var4);
      this.id_break(var1, var2, var3);
   }

   protected void id_break(Ml_1 var1, int var2, int var3, float var4) {
   }

   protected void id_native() {
   }

   @Override
   protected void v_() {
      super.v_();
      this.id_native();
      this.id_instanceof.id_class(this);
   }

   @Override
   public void w_() {
      super.w_();
      this.id_instanceof.id_break(this);
   }
}
