package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class FG<T extends rXy_1> extends Fu_1<T> implements rJu_1 {
   private rqO_2 class_;

   public FG(T var1, rhz_3 var2, rgP_2 var3, rqO_2 var4) {
      super((T)var1, var2, var3);
      this.class_ = var4;
   }

   @Override
   public void class_(rJr_1 var1, int var2, rdn_3 var3) {
   }

   @Override
   protected void class_(Ml_1 var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.volatile_.A().class_(this.class_);
      int var5 = (this.package_ - this.synchronized_) / 2;
      int var6 = (this.int_ - this.return_) / 2;
      this.break_(var1, var5, var6, 0, 0, this.synchronized_, this.return_);
      this.break_(var1, var5 + 59, var6 + 20, 0, this.return_ + (this.instanceof_.class_(0).break_() ? 0 : 16), 110, 16);
      if ((this.instanceof_.class_(0).break_() || this.instanceof_.class_(1).break_()) && !this.instanceof_.class_(2).break_()) {
         this.break_(var1, var5 + 99, var6 + 45, this.synchronized_, 0, 28, 21);
      }
   }

   @Override
   public void class_(rJr_1 var1, rqs_3<rdn_3> var2) {
      this.class_(var1, 0, var1.class_(0).class_());
   }

   @Override
   public void class_(rJr_1 var1, int var2, int var3) {
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      super.class_(var1, var2, var3, var4);
      RenderSystem.disableBlend();
      this.break_(var1, var2, var3, var4);
      this.break_(var1, var2, var3);
   }

   protected void break_(Ml_1 var1, int var2, int var3, float var4) {
   }

   protected void native_() {
   }

   @Override
   protected void v_() {
      super.v_();
      this.native_();
      this.instanceof_.class_(this);
   }

   @Override
   public void w_() {
      super.w_();
      this.instanceof_.break_(this);
   }
}
