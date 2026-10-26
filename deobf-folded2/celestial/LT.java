package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public abstract class LT<E extends Lt_1<E>> extends cu_3 implements cp_3 {
   protected final QY id_native;
   protected final int id_volatile;
   private List<E> id_class = new LI(this);
   protected int id_final;
   protected int id_package;
   protected int id_int;
   protected int id_new;
   protected int id_continue;
   protected int id_super;
   protected boolean id_this = true;
   private double id_throws;
   private boolean id_case = true;
   private boolean id_catch;
   protected int id_else;
   protected int id_synchronized;
   private boolean id_private;
   private E id_implements;
   private boolean id_finally = true;
   private boolean id_extends = true;

   protected void id_byte(double var1, double var3, int var5) {
      this.id_private = var5 == 0 && var1 >= (double)this.id_protected() && var1 < (double)(this.id_protected() + 6);
   }

   protected void id_byte(E var1) {
      this.id_class((double)(this.x_().indexOf(var1) * this.id_volatile + this.id_volatile / 2 - (this.id_new - this.id_int) / 2));
   }

   public void id_byte(boolean var1) {
      this.id_case = var1;
   }

   protected E id_byte(int var1) {
      List var2 = this.x_();
      return (E)(var1 >= 0 && var1 < var2.size() ? var2.get(var1) : null);
   }

   public int id_int() {
      return Math.max(0, this.id_final() - (this.id_new - this.id_int - 4 - this.id_synchronized));
   }

   public LT(QY var1, int var2, int var3, int var4, int var5, int var6) {
      this.id_native = var1;
      this.id_final = var2;
      this.id_package = var3;
      this.id_int = var4;
      this.id_new = var5;
      this.id_volatile = var6;
      this.id_super = 0;
      this.id_continue = var2;
   }

   public List<E> id_this() {
      return this.id_class;
   }

   protected void id_class(Ml_1 var1, int var2, int var3) {
   }

   protected void id_class(Ml_1 var1) {
   }

   protected void id_class(Ml_1 var1, int var2, int var3, yb_3 var4) {
   }

   protected void id_class(int var1, int var2) {
   }

   protected void id_class(Lw_1 var1) {
      this.id_class(var1, var0 -> true);
   }

   @Override
   public boolean id_class(double var1, double var3, int var5) {
      if (this.id_extends() != null) {
         this.id_extends().id_class(var1, var3, var5);
      }

      return false;
   }

   public void id_class(double var1) {
      this.id_throws = rfU_2.id_class(var1, 0.0, (double)this.id_int());
   }

   @Override
   public boolean id_class(double var1, double var3, int var5, double var6, double var8) {
      if (super.id_class(var1, var3, var5, var6, var8)) {
         return true;
      } else if (var5 == 0 && this.id_private) {
         if (var3 < (double)this.id_int) {
            this.id_class(0.0);
         } else if (var3 > (double)this.id_new) {
            this.id_class((double)this.id_int());
         } else {
            double var10 = (double)Math.max(1, this.id_int());
            int var12 = this.id_new - this.id_int;
            int var13 = rfU_2.id_class((int)((float)(var12 * var12) / (float)this.id_final()), 32, var12 - 8);
            double var14 = Math.max(1.0, var10 / (double)(var12 - var13));
            this.id_class(this.id_package() + var8 * var14);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean id_class(double var1, double var3, double var5) {
      this.id_class(this.id_package() - var5 * (double)this.id_volatile / 2.0);
      return true;
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      if (super.id_class(var1, var2, var3)) {
         return true;
      } else if (var1 == 264) {
         this.id_class(Lw_1.DOWN);
         return true;
      } else if (var1 == 265) {
         this.id_class(Lw_1.UP);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      int var5 = this.id_protected();
      int var6 = var5 + 6;
      yb_3 var7 = yb_3.id_class();
      lD_2 var8 = var7.id_byte();
      if (this.id_finally) {
         this.id_native.A().id_class(ch_3.id_break);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         var8.id_class(7, ju_3.id_public);
         var8.id_class((double)this.id_super, (double)this.id_new, 0.0)
            .id_class((float)this.id_super / 32.0F, (float)(this.id_new + (int)this.id_package()) / 32.0F)
            .id_break(32, 32, 32, 255)
            .id_class();
         var8.id_class((double)this.id_continue, (double)this.id_new, 0.0)
            .id_class((float)this.id_continue / 32.0F, (float)(this.id_new + (int)this.id_package()) / 32.0F)
            .id_break(32, 32, 32, 255)
            .id_class();
         var8.id_class((double)this.id_continue, (double)this.id_int, 0.0)
            .id_class((float)this.id_continue / 32.0F, (float)(this.id_int + (int)this.id_package()) / 32.0F)
            .id_break(32, 32, 32, 255)
            .id_class();
         var8.id_class((double)this.id_super, (double)this.id_int, 0.0)
            .id_class((float)this.id_super / 32.0F, (float)(this.id_int + (int)this.id_package()) / 32.0F)
            .id_break(32, 32, 32, 255)
            .id_class();
         var7.id_break();
      }

      int var9 = this.id_continue();
      int var10 = this.id_int + 4 - (int)this.id_package();
      if (this.id_catch) {
         this.id_class(var1, var9, var10, var7);
      }

      this.id_class(var1, var9, var10, var2, var3, var4);
      if (this.id_extends) {
         this.id_native.A().id_class(ch_3.id_break);
         RenderSystem.enableDepthTest();
         RenderSystem.depthFunc(519);
         var8.id_class(7, ju_3.id_public);
         var8.id_class((double)this.id_super, (double)this.id_int, -100.0).id_class(0.0F, (float)this.id_int / 32.0F).id_break(64, 64, 64, 255).id_class();
         var8.id_class((double)(this.id_super + this.id_final), (double)this.id_int, -100.0)
            .id_class((float)this.id_final / 32.0F, (float)this.id_int / 32.0F)
            .id_break(64, 64, 64, 255)
            .id_class();
         var8.id_class((double)(this.id_super + this.id_final), 0.0, -100.0).id_class((float)this.id_final / 32.0F, 0.0F).id_break(64, 64, 64, 255).id_class();
         var8.id_class((double)this.id_super, 0.0, -100.0).id_class(0.0F, 0.0F).id_break(64, 64, 64, 255).id_class();
         var8.id_class((double)this.id_super, (double)this.id_package, -100.0)
            .id_class(0.0F, (float)this.id_package / 32.0F)
            .id_break(64, 64, 64, 255)
            .id_class();
         var8.id_class((double)(this.id_super + this.id_final), (double)this.id_package, -100.0)
            .id_class((float)this.id_final / 32.0F, (float)this.id_package / 32.0F)
            .id_break(64, 64, 64, 255)
            .id_class();
         var8.id_class((double)(this.id_super + this.id_final), (double)this.id_new, -100.0)
            .id_class((float)this.id_final / 32.0F, (float)this.id_new / 32.0F)
            .id_break(64, 64, 64, 255)
            .id_class();
         var8.id_class((double)this.id_super, (double)this.id_new, -100.0).id_class(0.0F, (float)this.id_new / 32.0F).id_break(64, 64, 64, 255).id_class();
         var7.id_break();
         RenderSystem.depthFunc(515);
         RenderSystem.disableDepthTest();
         RenderSystem.enableBlend();
         RenderSystem.blendFuncSeparate(OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA, OP.ZERO, MK.ONE);
         RenderSystem.disableAlphaTest();
         RenderSystem.shadeModel(7425);
         RenderSystem.disableTexture();
         var8.id_class(7, ju_3.id_public);
         var8.id_class((double)this.id_super, (double)(this.id_int + 4), 0.0).id_class(0.0F, 1.0F).id_break(0, 0, 0, 0).id_class();
         var8.id_class((double)this.id_continue, (double)(this.id_int + 4), 0.0).id_class(1.0F, 1.0F).id_break(0, 0, 0, 0).id_class();
         var8.id_class((double)this.id_continue, (double)this.id_int, 0.0).id_class(1.0F, 0.0F).id_break(0, 0, 0, 255).id_class();
         var8.id_class((double)this.id_super, (double)this.id_int, 0.0).id_class(0.0F, 0.0F).id_break(0, 0, 0, 255).id_class();
         var8.id_class((double)this.id_super, (double)this.id_new, 0.0).id_class(0.0F, 1.0F).id_break(0, 0, 0, 255).id_class();
         var8.id_class((double)this.id_continue, (double)this.id_new, 0.0).id_class(1.0F, 1.0F).id_break(0, 0, 0, 255).id_class();
         var8.id_class((double)this.id_continue, (double)(this.id_new - 4), 0.0).id_class(1.0F, 0.0F).id_break(0, 0, 0, 0).id_class();
         var8.id_class((double)this.id_super, (double)(this.id_new - 4), 0.0).id_class(0.0F, 0.0F).id_break(0, 0, 0, 0).id_class();
         var7.id_break();
      }

      int var11 = this.id_int();
      if (var11 > 0) {
         RenderSystem.disableTexture();
         int var12 = (int)((float)((this.id_new - this.id_int) * (this.id_new - this.id_int)) / (float)this.id_final());
         var12 = rfU_2.id_class(var12, 32, this.id_new - this.id_int - 8);
         int var13 = (int)this.id_package() * (this.id_new - this.id_int - var12) / var11 + this.id_int;
         if (var13 < this.id_int) {
            var13 = this.id_int;
         }

         var8.id_class(7, ju_3.id_public);
         var8.id_class((double)var5, (double)this.id_new, 0.0).id_class(0.0F, 1.0F).id_break(0, 0, 0, 255).id_class();
         var8.id_class((double)var6, (double)this.id_new, 0.0).id_class(1.0F, 1.0F).id_break(0, 0, 0, 255).id_class();
         var8.id_class((double)var6, (double)this.id_int, 0.0).id_class(1.0F, 0.0F).id_break(0, 0, 0, 255).id_class();
         var8.id_class((double)var5, (double)this.id_int, 0.0).id_class(0.0F, 0.0F).id_break(0, 0, 0, 255).id_class();
         var8.id_class((double)var5, (double)(var13 + var12), 0.0).id_class(0.0F, 1.0F).id_break(128, 128, 128, 255).id_class();
         var8.id_class((double)var6, (double)(var13 + var12), 0.0).id_class(1.0F, 1.0F).id_break(128, 128, 128, 255).id_class();
         var8.id_class((double)var6, (double)var13, 0.0).id_class(1.0F, 0.0F).id_break(128, 128, 128, 255).id_class();
         var8.id_class((double)var5, (double)var13, 0.0).id_class(0.0F, 0.0F).id_break(128, 128, 128, 255).id_class();
         var8.id_class((double)var5, (double)(var13 + var12 - 1), 0.0).id_class(0.0F, 1.0F).id_break(192, 192, 192, 255).id_class();
         var8.id_class((double)(var6 - 1), (double)(var13 + var12 - 1), 0.0).id_class(1.0F, 1.0F).id_break(192, 192, 192, 255).id_class();
         var8.id_class((double)(var6 - 1), (double)var13, 0.0).id_class(1.0F, 0.0F).id_break(192, 192, 192, 255).id_class();
         var8.id_class((double)var5, (double)var13, 0.0).id_class(0.0F, 0.0F).id_break(192, 192, 192, 255).id_class();
         var7.id_break();
      }

      this.id_class(var1, var2, var3);
      RenderSystem.enableTexture();
      RenderSystem.shadeModel(7424);
      RenderSystem.enableAlphaTest();
      RenderSystem.disableBlend();
   }

   public void id_class(E var1) {
      this.id_implements = (E)var1;
   }

   protected void id_class(Ml_1 var1, int var2, int var3, int var4, int var5, float var6) {
      int var7 = this.id_volatile();
      yb_3 var8 = yb_3.id_class();
      lD_2 var9 = var8.id_byte();

      for (int var10 = 0; var10 < var7; var10++) {
         int var11 = this.id_case(var10);
         int var12 = this.id_implements(var10);
         if (var12 >= this.id_int && var11 <= this.id_new) {
            int var13 = var3 + var10 * this.id_volatile + this.id_else;
            int var14 = this.id_volatile - 4;
            Lt_1 var15 = this.id_byte(var10);
            if (var15 != null) {
               int var16 = this.F_();
               int var17 = this.id_super + this.id_final / 2 - var16 / 2;
               int var18 = this.id_super + this.id_final / 2 + var16 / 2;
               if (this.id_case && this.id_protected(var10)) {
                  RenderSystem.disableTexture();
                  float var19 = this.id_class() ? 1.0F : 0.5F;
                  RenderSystem.color4f(var19, var19, var19, 1.0F);
                  var9.id_class(7, ju_3.id_super);
                  var9.id_class((double)var17, (double)(var13 + var14 + 2), 0.0).id_class();
                  var9.id_class((double)var18, (double)(var13 + var14 + 2), 0.0).id_class();
                  var9.id_class((double)var18, (double)(var13 - 2), 0.0).id_class();
                  var9.id_class((double)var17, (double)(var13 - 2), 0.0).id_class();
                  var8.id_break();
                  RenderSystem.color4f(0.0F, 0.0F, 0.0F, 1.0F);
                  var9.id_class(7, ju_3.id_super);
                  var9.id_class((double)(var17 + 1), (double)(var13 + var14 + 1), 0.0).id_class();
                  var9.id_class((double)(var18 - 1), (double)(var13 + var14 + 1), 0.0).id_class();
                  var9.id_class((double)(var18 - 1), (double)(var13 - 1), 0.0).id_class();
                  var9.id_class((double)(var17 + 1), (double)(var13 - 1), 0.0).id_class();
                  var8.id_break();
                  RenderSystem.enableTexture();
               }

               int var20 = this.id_continue();
               var15.id_class(
                  var1,
                  var10,
                  var11,
                  var20,
                  var16,
                  var14,
                  var4,
                  var5,
                  this.id_break((double)var4, (double)var5) && Objects.equals(this.id_protected((double)var4, (double)var5), var15),
                  var6
               );
            }
         }
      }
   }

   protected void id_class(Collection<E> var1) {
      this.id_class.clear();
      this.id_class.addAll(var1);
   }

   protected boolean id_class() {
      return false;
   }

   public void id_class(boolean var1, int var2) {
      this.id_catch = var1;
      this.id_else = var2;
      if (!var1) {
         this.id_else = 0;
      }
   }

   protected void id_class(Lw_1 var1, Predicate<E> var2) {
      int var3 = var1 == Lw_1.UP ? -1 : 1;
      if (!this.x_().isEmpty()) {
         int var4 = this.x_().indexOf(this.id_finally());

         while (true) {
            int var5 = rfU_2.id_class(var4 + var3, 0, this.id_volatile() - 1);
            if (var4 == var5) {
               break;
            }

            Lt_1 var6 = this.x_().get(var5);
            if (var2.test(var6)) {
               this.id_class((E)var6);
               this.id_protected((E)var6);
               break;
            }

            var4 = var5;
         }
      }
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      this.id_byte(var1, var3, var5);
      if (!this.id_break(var1, var3)) {
         return false;
      } else {
         Lt_1 var6 = this.id_protected(var1, var3);
         if (var6 != null) {
            if (var6.id_break(var1, var3, var5)) {
               this.id_class(var6);
               this.id_class(true);
               return true;
            }
         } else if (var5 == 0) {
            this.id_class(
               (int)(var1 - (double)(this.id_super + this.id_final / 2 - this.F_() / 2)), (int)(var3 - (double)this.id_int) + (int)this.id_package() - 4
            );
            return true;
         }

         return this.id_private;
      }
   }

   public void id_break(int var1) {
      this.id_synchronized = var1;
   }

   public void id_break(int var1, int var2, int var3, int var4) {
      this.id_final = var1;
      this.id_package = var2;
      this.id_int = var3;
      this.id_new = var4;
      this.id_super = 0;
      this.id_continue = var1;
   }

   @Override
   public boolean id_break(double var1, double var3) {
      return var3 >= (double)this.id_int && var3 <= (double)this.id_new && var1 >= (double)this.id_super && var1 <= (double)this.id_continue;
   }

   protected int id_break(E var1) {
      this.id_class.add((E)var1);
      return this.id_class.size() - 1;
   }

   public void id_throws(int var1) {
      this.id_super = var1;
      this.id_continue = var1 + this.id_final;
   }

   public void id_throws(boolean var1) {
      this.id_extends = var1;
   }

   public boolean id_throws(E var1) {
      boolean var2 = this.id_class.remove(var1);
      if (var2 && var1 == this.id_finally()) {
         this.id_class(null);
      }

      return var2;
   }

   public E id_finally() {
      return this.id_implements;
   }

   protected E id_catch(int var1) {
      Lt_1 var2 = this.id_class.get(var1);
      return (E)(this.id_throws(this.id_class.get(var1)) ? var2 : null);
   }

   public E id_extends() {
      return (E)super.id_catch();
   }

   void id_case(Lt_1<E> var1) {
      var1.id_class = this;
   }

   protected int id_case(int var1) {
      return this.id_int + 4 - (int)this.id_package() + var1 * this.id_volatile + this.id_else;
   }

   public int id_continue() {
      return this.id_super + this.id_final / 2 - this.F_() / 2 + 2;
   }

   private int id_implements(int var1) {
      return this.id_case(var1) + this.id_volatile;
   }

   protected void id_new() {
      Lt_1 var1 = this.id_finally();
      if (var1 != null) {
         this.id_class((E)var1);
         this.id_protected((E)var1);
      }
   }

   public double id_package() {
      return this.id_throws;
   }

   public int id_super() {
      return this.id_continue() + this.F_();
   }

   public void id_protected(boolean var1) {
      this.id_finally = var1;
   }

   protected void id_protected(E var1) {
      int var2 = this.id_case(this.x_().indexOf(var1));
      int var3 = var2 - this.id_int - 4 - this.id_volatile;
      if (var3 < 0) {
         this.id_private(var3);
      }

      int var4 = this.id_new - var2 - this.id_volatile - this.id_volatile;
      if (var4 < 0) {
         this.id_private(-var4);
      }
   }

   protected final E id_protected(double var1, double var3) {
      int var5 = this.F_() / 2;
      int var6 = this.id_super + this.id_final / 2;
      int var7 = var6 - var5;
      int var8 = var6 + var5;
      int var9 = rfU_2.id_byte(var3 - (double)this.id_int) - this.id_else + (int)this.id_package() - 4;
      int var10 = var9 / this.id_volatile;
      return var1 < (double)this.id_protected() && var1 >= (double)var7 && var1 <= (double)var8 && var10 >= 0 && var9 >= 0 && var10 < this.id_volatile()
         ? this.x_().get(var10)
         : null;
   }

   protected boolean id_protected(int var1) {
      return Objects.equals(this.id_finally(), this.x_().get(var1));
   }

   protected int id_protected() {
      return this.id_final / 2 + 124;
   }

   private void id_private(int var1) {
      this.id_class(this.id_package() + (double)var1);
   }

   protected int id_final() {
      return this.id_volatile() * this.id_volatile + this.id_else;
   }

   protected int id_volatile() {
      return this.x_().size();
   }

   protected final void id_native() {
      this.id_class.clear();
   }

   @Override
   public final List<E> x_() {
      return this.id_class;
   }

   public int F_() {
      return 220;
   }
}
