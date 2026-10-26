package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collections;
import java.util.List;

public abstract class rrJh_1 extends cu_3 implements cp_3 {
   protected static final int id_class = -1;
   protected static final int id_throws = -2;
   protected final QY id_case;
   protected int id_catch;
   protected int id_private;
   protected int id_implements;
   protected int id_finally;
   protected int id_extends;
   protected int id_native;
   protected final int id_volatile;
   protected boolean id_final = true;
   protected int id_package = -2;
   protected double id_int;
   protected boolean id_new = true;
   protected boolean id_continue = true;
   protected boolean id_super;
   protected int id_this;
   private boolean id_else;

   public void id_byte(int var1) {
      this.id_int = (double)(var1 * this.id_volatile + this.id_volatile / 2 - (this.id_finally - this.id_implements) / 2);
      this.id_implements();
   }

   public void id_byte(boolean var1) {
      this.id_continue = var1;
   }

   protected void id_byte(int var1, int var2, int var3, int var4) {
      yb_3 var5 = yb_3.id_class();
      lD_2 var6 = var5.id_byte();
      this.id_case.A().id_class(ch_3.id_break);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var7 = 32.0F;
      var6.id_class(7, ju_3.id_public);
      var6.id_class((double)this.id_native, (double)var2, 0.0).id_class(0.0F, (float)var2 / 32.0F).id_break(64, 64, 64, var4).id_class();
      var6.id_class((double)(this.id_native + this.id_catch), (double)var2, 0.0)
         .id_class((float)this.id_catch / 32.0F, (float)var2 / 32.0F)
         .id_break(64, 64, 64, var4)
         .id_class();
      var6.id_class((double)(this.id_native + this.id_catch), (double)var1, 0.0)
         .id_class((float)this.id_catch / 32.0F, (float)var1 / 32.0F)
         .id_break(64, 64, 64, var3)
         .id_class();
      var6.id_class((double)this.id_native, (double)var1, 0.0).id_class(0.0F, (float)var1 / 32.0F).id_break(64, 64, 64, var3).id_class();
      var5.id_break();
   }

   protected void id_byte(double var1, double var3, int var5) {
      this.id_else = var5 == 0 && var1 >= (double)this.id_package() && var1 < (double)(this.id_package() + 6);
   }

   public int id_int() {
      return this.id_volatile;
   }

   public rrJh_1(QY var1, int var2, int var3, int var4, int var5, int var6) {
      this.id_case = var1;
      this.id_catch = var2;
      this.id_private = var3;
      this.id_implements = var4;
      this.id_finally = var5;
      this.id_volatile = var6;
      this.id_native = 0;
      this.id_extends = var2;
   }

   protected void id_class(boolean var1, int var2) {
      this.id_super = var1;
      this.id_this = var2;
      if (!var1) {
         this.id_this = 0;
      }
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      if (this.id_new) {
         this.id_private();
         int var5 = this.id_package();
         int var6 = var5 + 6;
         this.id_implements();
         yb_3 var7 = yb_3.id_class();
         lD_2 var8 = var7.id_byte();
         this.id_case.A().id_class(ch_3.id_break);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         float var9 = 32.0F;
         var8.id_class(7, ju_3.id_public);
         var8.id_class((double)this.id_native, (double)this.id_finally, 0.0)
            .id_class((float)this.id_native / 32.0F, (float)(this.id_finally + (int)this.id_int) / 32.0F)
            .id_break(32, 32, 32, 255)
            .id_class();
         var8.id_class((double)this.id_extends, (double)this.id_finally, 0.0)
            .id_class((float)this.id_extends / 32.0F, (float)(this.id_finally + (int)this.id_int) / 32.0F)
            .id_break(32, 32, 32, 255)
            .id_class();
         var8.id_class((double)this.id_extends, (double)this.id_implements, 0.0)
            .id_class((float)this.id_extends / 32.0F, (float)(this.id_implements + (int)this.id_int) / 32.0F)
            .id_break(32, 32, 32, 255)
            .id_class();
         var8.id_class((double)this.id_native, (double)this.id_implements, 0.0)
            .id_class((float)this.id_native / 32.0F, (float)(this.id_implements + (int)this.id_int) / 32.0F)
            .id_break(32, 32, 32, 255)
            .id_class();
         var7.id_break();
         int var10 = this.id_native + this.id_catch / 2 - this.id_volatile() / 2 + 2;
         int var11 = this.id_implements + 4 - (int)this.id_int;
         if (this.id_super) {
            this.id_class(var10, var11, var7);
         }

         this.id_class(var1, var10, var11, var2, var3, var4);
         RenderSystem.disableDepthTest();
         this.id_byte(0, this.id_implements, 255, 255);
         this.id_byte(this.id_finally, this.id_private, 255, 255);
         RenderSystem.enableBlend();
         RenderSystem.blendFuncSeparate(OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA, OP.ZERO, MK.ONE);
         RenderSystem.disableAlphaTest();
         RenderSystem.shadeModel(7425);
         RenderSystem.disableTexture();
         byte var12 = 4;
         var8.id_class(7, ju_3.id_public);
         var8.id_class((double)this.id_native, (double)(this.id_implements + 4), 0.0).id_class(0.0F, 1.0F).id_break(0, 0, 0, 0).id_class();
         var8.id_class((double)this.id_extends, (double)(this.id_implements + 4), 0.0).id_class(1.0F, 1.0F).id_break(0, 0, 0, 0).id_class();
         var8.id_class((double)this.id_extends, (double)this.id_implements, 0.0).id_class(1.0F, 0.0F).id_break(0, 0, 0, 255).id_class();
         var8.id_class((double)this.id_native, (double)this.id_implements, 0.0).id_class(0.0F, 0.0F).id_break(0, 0, 0, 255).id_class();
         var7.id_break();
         var8.id_class(7, ju_3.id_public);
         var8.id_class((double)this.id_native, (double)this.id_finally, 0.0).id_class(0.0F, 1.0F).id_break(0, 0, 0, 255).id_class();
         var8.id_class((double)this.id_extends, (double)this.id_finally, 0.0).id_class(1.0F, 1.0F).id_break(0, 0, 0, 255).id_class();
         var8.id_class((double)this.id_extends, (double)(this.id_finally - 4), 0.0).id_class(1.0F, 0.0F).id_break(0, 0, 0, 0).id_class();
         var8.id_class((double)this.id_native, (double)(this.id_finally - 4), 0.0).id_class(0.0F, 0.0F).id_break(0, 0, 0, 0).id_class();
         var7.id_break();
         int var13 = this.id_finally();
         if (var13 > 0) {
            int var14 = (int)((float)((this.id_finally - this.id_implements) * (this.id_finally - this.id_implements)) / (float)this.id_throws());
            var14 = rfU_2.id_class(var14, 32, this.id_finally - this.id_implements - 8);
            int var15 = (int)this.id_int * (this.id_finally - this.id_implements - var14) / var13 + this.id_implements;
            if (var15 < this.id_implements) {
               var15 = this.id_implements;
            }

            var8.id_class(7, ju_3.id_public);
            var8.id_class((double)var5, (double)this.id_finally, 0.0).id_class(0.0F, 1.0F).id_break(0, 0, 0, 255).id_class();
            var8.id_class((double)var6, (double)this.id_finally, 0.0).id_class(1.0F, 1.0F).id_break(0, 0, 0, 255).id_class();
            var8.id_class((double)var6, (double)this.id_implements, 0.0).id_class(1.0F, 0.0F).id_break(0, 0, 0, 255).id_class();
            var8.id_class((double)var5, (double)this.id_implements, 0.0).id_class(0.0F, 0.0F).id_break(0, 0, 0, 255).id_class();
            var7.id_break();
            var8.id_class(7, ju_3.id_public);
            var8.id_class((double)var5, (double)(var15 + var14), 0.0).id_class(0.0F, 1.0F).id_break(128, 128, 128, 255).id_class();
            var8.id_class((double)var6, (double)(var15 + var14), 0.0).id_class(1.0F, 1.0F).id_break(128, 128, 128, 255).id_class();
            var8.id_class((double)var6, (double)var15, 0.0).id_class(1.0F, 0.0F).id_break(128, 128, 128, 255).id_class();
            var8.id_class((double)var5, (double)var15, 0.0).id_class(0.0F, 0.0F).id_break(128, 128, 128, 255).id_class();
            var7.id_break();
            var8.id_class(7, ju_3.id_public);
            var8.id_class((double)var5, (double)(var15 + var14 - 1), 0.0).id_class(0.0F, 1.0F).id_break(192, 192, 192, 255).id_class();
            var8.id_class((double)(var6 - 1), (double)(var15 + var14 - 1), 0.0).id_class(1.0F, 1.0F).id_break(192, 192, 192, 255).id_class();
            var8.id_class((double)(var6 - 1), (double)var15, 0.0).id_class(1.0F, 0.0F).id_break(192, 192, 192, 255).id_class();
            var8.id_class((double)var5, (double)var15, 0.0).id_class(0.0F, 0.0F).id_break(192, 192, 192, 255).id_class();
            var7.id_break();
         }

         this.id_break(var2, var3);
         RenderSystem.enableTexture();
         RenderSystem.shadeModel(7424);
         RenderSystem.enableAlphaTest();
         RenderSystem.disableBlend();
      }
   }

   protected void id_class(Ml_1 var1, int var2, int var3, int var4, int var5, float var6) {
      int var7 = this.id_protected();
      yb_3 var8 = yb_3.id_class();
      lD_2 var9 = var8.id_byte();

      for (int var10 = 0; var10 < var7; var10++) {
         int var11 = var3 + var10 * this.id_volatile + this.id_this;
         int var12 = this.id_volatile - 4;
         if (var11 > this.id_finally || var11 + var12 < this.id_implements) {
            this.id_class(var10, var2, var11, var6);
         }

         if (this.id_continue && this.id_break(var10)) {
            int var13 = this.id_native + this.id_catch / 2 - this.id_volatile() / 2;
            int var14 = this.id_native + this.id_catch / 2 + this.id_volatile() / 2;
            RenderSystem.disableTexture();
            float var15 = this.id_final() ? 1.0F : 0.5F;
            RenderSystem.color4f(var15, var15, var15, 1.0F);
            var9.id_class(7, ju_3.id_super);
            var9.id_class((double)var13, (double)(var11 + var12 + 2), 0.0).id_class();
            var9.id_class((double)var14, (double)(var11 + var12 + 2), 0.0).id_class();
            var9.id_class((double)var14, (double)(var11 - 2), 0.0).id_class();
            var9.id_class((double)var13, (double)(var11 - 2), 0.0).id_class();
            var8.id_break();
            RenderSystem.color4f(0.0F, 0.0F, 0.0F, 1.0F);
            var9.id_class(7, ju_3.id_super);
            var9.id_class((double)(var13 + 1), (double)(var11 + var12 + 1), 0.0).id_class();
            var9.id_class((double)(var14 - 1), (double)(var11 + var12 + 1), 0.0).id_class();
            var9.id_class((double)(var14 - 1), (double)(var11 - 1), 0.0).id_class();
            var9.id_class((double)(var13 + 1), (double)(var11 - 1), 0.0).id_class();
            var8.id_break();
            RenderSystem.enableTexture();
         }

         if (var11 + this.id_volatile >= this.id_implements && var11 <= this.id_finally) {
            this.id_class(var1, var10, var2, var11, var12, var4, var5, var6);
         }
      }
   }

   @Override
   public boolean id_class(char var1, int var2) {
      return !this.id_class() ? false : super.id_class(var1, var2);
   }

   protected void id_class(int var1, int var2) {
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      if (!this.id_class()) {
         return false;
      } else if (super.id_class(var1, var2, var3)) {
         return true;
      } else if (var1 == 264) {
         this.id_throws(1);
         return true;
      } else if (var1 == 265) {
         this.id_throws(-1);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean id_class(double var1, double var3, double var5) {
      if (!this.id_class()) {
         return false;
      } else {
         this.id_int = this.id_int - var5 * (double)this.id_volatile / 2.0;
         return true;
      }
   }

   @Override
   public boolean id_class(double var1, double var3, int var5, double var6, double var8) {
      if (super.id_class(var1, var3, var5, var6, var8)) {
         return true;
      } else if (this.id_class() && var5 == 0 && this.id_else) {
         if (var3 < (double)this.id_implements) {
            this.id_int = 0.0;
         } else if (var3 > (double)this.id_finally) {
            this.id_int = (double)this.id_finally();
         } else {
            double var10 = (double)this.id_finally();
            if (var10 < 1.0) {
               var10 = 1.0;
            }

            int var12 = (int)((float)((this.id_finally - this.id_implements) * (this.id_finally - this.id_implements)) / (float)this.id_throws());
            var12 = rfU_2.id_class(var12, 32, this.id_finally - this.id_implements - 8);
            double var13 = var10 / (double)(this.id_finally - this.id_implements - var12);
            if (var13 < 1.0) {
               var13 = 1.0;
            }

            this.id_int += var8 * var13;
            this.id_implements();
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean id_class(double var1, double var3, int var5) {
      if (this.id_catch() != null) {
         this.id_catch().id_class(var1, var3, var5);
      }

      return false;
   }

   protected abstract void id_class(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8);

   protected void id_class(int var1, int var2, int var3, float var4) {
   }

   protected boolean id_class(int var1, int var2, double var3, double var5) {
      return true;
   }

   protected void id_class(int var1, int var2, yb_3 var3) {
   }

   public boolean id_class() {
      return this.id_new;
   }

   @Override
   public boolean id_break(double var1, double var3) {
      return this.id_throws(var1, var3);
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      this.id_byte(var1, var3, var5);
      if (this.id_class() && this.id_throws(var1, var3)) {
         int var6 = this.id_protected(var1, var3);
         if (var6 == -1 && var5 == 0) {
            this.id_class(
               (int)(var1 - (double)(this.id_native + this.id_catch / 2 - this.id_volatile() / 2)),
               (int)(var3 - (double)this.id_implements) + (int)this.id_int - 4
            );
            return true;
         } else if (var6 != -1 && this.id_class(var6, var5, var1, var3)) {
            if (this.x_().size() > var6) {
               this.id_class(this.x_().get(var6));
            }

            this.id_class(true);
            return true;
         } else {
            return this.id_else;
         }
      } else {
         return false;
      }
   }

   protected abstract boolean id_break(int var1);

   protected void id_break(int var1, int var2) {
   }

   public void id_break(int var1, int var2, int var3, int var4) {
      this.id_catch = var1;
      this.id_private = var2;
      this.id_implements = var3;
      this.id_finally = var4;
      this.id_native = 0;
      this.id_extends = var1;
   }

   public boolean id_throws(double var1, double var3) {
      return var3 >= (double)this.id_implements && var3 <= (double)this.id_finally && var1 >= (double)this.id_native && var1 <= (double)this.id_extends;
   }

   protected int id_throws() {
      return this.id_protected() * this.id_volatile + this.id_this;
   }

   protected void id_throws(int var1) {
   }

   public int id_finally() {
      return Math.max(0, this.id_throws() - (this.id_finally - this.id_implements - 4));
   }

   public int id_extends() {
      return (int)this.id_int;
   }

   public void id_case(int var1) {
      this.id_native = var1;
      this.id_extends = var1 + this.id_catch;
   }

   protected void id_implements() {
      this.id_int = rfU_2.id_class(this.id_int, 0.0, (double)this.id_finally());
   }

   protected int id_package() {
      return this.id_catch / 2 + 124;
   }

   protected abstract int id_protected();

   public int id_protected(double var1, double var3) {
      int var5 = this.id_native + this.id_catch / 2 - this.id_volatile() / 2;
      int var6 = this.id_native + this.id_catch / 2 + this.id_volatile() / 2;
      int var7 = rfU_2.id_byte(var3 - (double)this.id_implements) - this.id_this + (int)this.id_int - 4;
      int var8 = var7 / this.id_volatile;
      return var1 < (double)this.id_package() && var1 >= (double)var5 && var1 <= (double)var6 && var8 >= 0 && var7 >= 0 && var8 < this.id_protected()
         ? var8
         : -1;
   }

   public void id_protected(boolean var1) {
      this.id_new = var1;
   }

   public void id_protected(int var1) {
      this.id_int += (double)var1;
      this.id_implements();
      this.id_package = -2;
   }

   protected abstract void id_private();

   protected boolean id_final() {
      return false;
   }

   public int id_volatile() {
      return 220;
   }

   public int id_native() {
      return (int)this.id_int - this.id_private - this.id_this;
   }

   @Override
   public List<? extends cC_2> x_() {
      return Collections.emptyList();
   }
}
