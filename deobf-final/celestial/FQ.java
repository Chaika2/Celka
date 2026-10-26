package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class FQ extends Fu_1<rXf_1> {
   private static final rqO_2 class_ = new rqO_2("textures/gui/container/brewing_stand.png");
   private static final int[] throws_ = new int[]{29, 24, 20, 16, 11, 6, 0};

   public FQ(rXf_1 var1, rhz_3 var2, rgP_2 var3) {
      super(var1, var2, var3);
   }

   @Override
   protected void class_(Ml_1 var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.volatile_.A().class_(class_);
      int var5 = (this.package_ - this.synchronized_) / 2;
      int var6 = (this.int_ - this.return_) / 2;
      this.break_(var1, var5, var6, 0, 0, this.synchronized_, this.return_);
      int var7 = this.instanceof_.class_();
      int var8 = rfU_2.class_((18 * var7 + 20 - 1) / 20, 0, 18);
      if (var8 > 0) {
         this.break_(var1, var5 + 60, var6 + 44, 176, 29, var8, 4);
      }

      int var9 = this.instanceof_.break_();
      if (var9 > 0) {
         int var10 = (int)(28.0F * (1.0F - (float)var9 / 400.0F));
         if (var10 > 0) {
            this.break_(var1, var5 + 97, var6 + 16, 176, 0, 9, var10);
         }

         var10 = throws_[var9 / 2 % 7];
         if (var10 > 0) {
            this.break_(var1, var5 + 63, var6 + 14 + 29 - var10, 185, 29 - var10, 12, var10);
         }
      }
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
