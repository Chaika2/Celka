package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class FQ extends Fu_1<rXf_1> {
   private static final rqO_2 id_class = new rqO_2("textures/gui/container/brewing_stand.png");
   private static final int[] id_throws = new int[]{29, 24, 20, 16, 11, 6, 0};

   public FQ(rXf_1 var1, rhz_3 var2, rgP_2 var3) {
      super(var1, var2, var3);
   }

   @Override
   protected void id_class(Ml_1 var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.id_volatile.A().id_class(id_class);
      int var5 = (this.id_package - this.id_synchronized) / 2;
      int var6 = (this.id_int - this.id_return) / 2;
      this.id_break(var1, var5, var6, 0, 0, this.id_synchronized, this.id_return);
      int var7 = this.id_instanceof.id_class();
      int var8 = rfU_2.id_class((18 * var7 + 20 - 1) / 20, 0, 18);
      if (var8 > 0) {
         this.id_break(var1, var5 + 60, var6 + 44, 176, 29, var8, 4);
      }

      int var9 = this.id_instanceof.id_break();
      if (var9 > 0) {
         int var10 = (int)(28.0F * (1.0F - (float)var9 / 400.0F));
         if (var10 > 0) {
            this.id_break(var1, var5 + 97, var6 + 16, 176, 0, 9, var10);
         }

         var10 = id_throws[var9 / 2 % 7];
         if (var10 > 0) {
            this.id_break(var1, var5 + 63, var6 + 14 + 29 - var10, 185, 29 - var10, 12, var10);
         }
      }
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      super.id_class(var1, var2, var3, var4);
      this.id_break(var1, var2, var3);
   }

   @Override
   protected void v_() {
      super.v_();
      this.id_public = (this.id_synchronized - this.id_super.id_class(this.id_extends)) / 2;
   }
}
