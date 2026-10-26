package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class Fw_1 extends Fu_1<rJD> {
   private static final rqO_2 id_class = new rqO_2("textures/gui/container/stonecutter.png");
   private float id_throws;
   private boolean id_case;
   private int id_catch;
   private boolean id_private;

   private void id_byte(int var1, int var2, int var3) {
      List var4 = this.id_instanceof.id_break();

      for (int var5 = this.id_catch; var5 < var3 && var5 < this.id_instanceof.id_byte(); var5++) {
         int var6 = var5 - this.id_catch;
         int var7 = var1 + var6 % 4 * 16;
         int var8 = var6 / 4;
         int var9 = var2 + var8 * 18 + 2;
         this.id_volatile.id_float().id_class(((rWu_1)var4.get(var5)).id_byte(), var7, var9);
      }
   }

   public Fw_1(rJD var1, rhz_3 var2, rgP_2 var3) {
      super(var1, var2, var3);
      var1.id_class(this::id_final);
      this.id_goto--;
   }

   @Override
   public boolean id_class(double var1, double var3, int var5, double var6, double var8) {
      if (this.id_case && this.id_native()) {
         int var10 = this.id_abstract + 14;
         int var11 = var10 + 54;
         this.id_throws = ((float)var3 - (float)var10 - 7.5F) / ((float)(var11 - var10) - 15.0F);
         this.id_throws = rfU_2.id_class(this.id_throws, 0.0F, 1.0F);
         this.id_catch = (int)((double)(this.id_throws * (float)this.id_finally()) + 0.5) * 4;
         return true;
      } else {
         return super.id_class(var1, var3, var5, var6, var8);
      }
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      super.id_class(var1, var2, var3, var4);
      this.id_break(var1, var2, var3);
   }

   @Override
   protected void id_class(Ml_1 var1, float var2, int var3, int var4) {
      this.id_class(var1);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.id_volatile.A().id_class(id_class);
      int var5 = this.id_char;
      int var6 = this.id_abstract;
      this.id_break(var1, var5, var6, 0, 0, this.id_synchronized, this.id_return);
      int var7 = (int)(41.0F * this.id_throws);
      this.id_break(var1, var5 + 119, var6 + 15 + var7, 176 + (this.id_native() ? 0 : 12), 0, 12, 15);
      int var8 = this.id_char + 52;
      int var9 = this.id_abstract + 14;
      int var10 = this.id_catch + 12;
      this.id_break(var1, var3, var4, var8, var9, var10);
      this.id_byte(var8, var9, var10);
   }

   @Override
   public boolean id_class(double var1, double var3, double var5) {
      if (this.id_native()) {
         int var7 = this.id_finally();
         this.id_throws = (float)((double)this.id_throws - var5 / (double)var7);
         this.id_throws = rfU_2.id_class(this.id_throws, 0.0F, 1.0F);
         this.id_catch = (int)((double)(this.id_throws * (float)var7) + 0.5) * 4;
      }

      return true;
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      this.id_case = false;
      if (this.id_private) {
         int var6 = this.id_char + 52;
         int var7 = this.id_abstract + 14;
         int var8 = this.id_catch + 12;

         for (int var9 = this.id_catch; var9 < var8; var9++) {
            int var10 = var9 - this.id_catch;
            double var11 = var1 - (double)(var6 + var10 % 4 * 16);
            double var13 = var3 - (double)(var7 + var10 / 4 * 18);
            if (var11 >= 0.0 && var13 >= 0.0 && var11 < 16.0 && var13 < 18.0 && this.id_instanceof.id_break((cb_3)this.id_volatile.id_class[57], var9)) {
               QY.id_instanceof().c().id_class(Np_1.id_class(rqn_3.dg, 1.0F));
               ((Ax_1)this.id_volatile.id_class[55]).id_class(this.id_instanceof.id_case, var9);
               return true;
            }
         }

         var6 = this.id_char + 119;
         var7 = this.id_abstract + 9;
         if (var1 >= (double)var6 && var1 < (double)(var6 + 12) && var3 >= (double)var7 && var3 < (double)(var7 + 54)) {
            this.id_case = true;
         }
      }

      return super.id_break(var1, var3, var5);
   }

   @Override
   protected void id_break(Ml_1 var1, int var2, int var3) {
      super.id_break(var1, var2, var3);
      if (this.id_private) {
         int var4 = this.id_char + 52;
         int var5 = this.id_abstract + 14;
         int var6 = this.id_catch + 12;
         List var7 = this.id_instanceof.id_break();

         for (int var8 = this.id_catch; var8 < var6 && var8 < this.id_instanceof.id_byte(); var8++) {
            int var9 = var8 - this.id_catch;
            int var10 = var4 + var9 % 4 * 16;
            int var11 = var5 + var9 / 4 * 18 + 2;
            if (var2 >= var10 && var2 < var10 + 16 && var3 >= var11 && var3 < var11 + 18) {
               this.id_class(var1, ((rWu_1)var7.get(var8)).id_byte(), var2, var3);
            }
         }
      }
   }

   private void id_break(Ml_1 var1, int var2, int var3, int var4, int var5, int var6) {
      for (int var7 = this.id_catch; var7 < var6 && var7 < this.id_instanceof.id_byte(); var7++) {
         int var8 = var7 - this.id_catch;
         int var9 = var4 + var8 % 4 * 16;
         int var10 = var8 / 4;
         int var11 = var5 + var10 * 18 + 2;
         int var12 = this.id_return;
         if (var7 == this.id_instanceof.id_class()) {
            var12 += 18;
         } else if (var2 >= var9 && var3 >= var11 && var2 < var9 + 16 && var3 < var11 + 18) {
            var12 += 36;
         }

         this.id_break(var1, var9, var11 - 1, 0, var12, 16, 18);
      }
   }

   protected int id_finally() {
      return (this.id_instanceof.id_byte() + 4 - 1) / 4 - 3;
   }

   private void id_final() {
      this.id_private = this.id_instanceof.id_protected();
      if (!this.id_private) {
         this.id_throws = 0.0F;
         this.id_catch = 0;
      }
   }

   private boolean id_native() {
      return this.id_private && this.id_instanceof.id_byte() > 12;
   }
}
