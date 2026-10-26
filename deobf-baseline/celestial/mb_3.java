package celestial;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collections;
import java.util.List;

public class mb_3 extends ch_3 implements cC_2, cp_3 {
   static final rqO_2 id_class = new rqO_2("textures/gui/recipe_book.png");
   private final List<mO_2> id_throws = Lists.newArrayList();
   private boolean id_case;
   private int id_catch;
   private int id_private;
   QY id_implements;
   private mG_2 id_finally;
   private rkw_3<?> id_extends;
   float id_native;
   boolean id_volatile;

   private void id_byte(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.id_break(var1, this.id_catch, this.id_private, var6, var7, var5, var5);
      this.id_break(var1, this.id_catch + var5 * 2 + var2 * var4, this.id_private, var6 + var4 + var5, var7, var5, var5);
      this.id_break(var1, this.id_catch, this.id_private + var5 * 2 + var3 * var4, var6, var7 + var4 + var5, var5, var5);
      this.id_break(var1, this.id_catch + var5 * 2 + var2 * var4, this.id_private + var5 * 2 + var3 * var4, var6 + var4 + var5, var7 + var4 + var5, var5, var5);

      for (int var8 = 0; var8 < var2; var8++) {
         this.id_break(var1, this.id_catch + var5 + var8 * var4, this.id_private, var6 + var5, var7, var4, var5);
         this.id_break(var1, this.id_catch + var5 + (var8 + 1) * var4, this.id_private, var6 + var5, var7, var5, var5);

         for (int var9 = 0; var9 < var3; var9++) {
            if (var8 == 0) {
               this.id_break(var1, this.id_catch, this.id_private + var5 + var9 * var4, var6, var7 + var5, var5, var4);
               this.id_break(var1, this.id_catch, this.id_private + var5 + (var9 + 1) * var4, var6, var7 + var5, var5, var5);
            }

            this.id_break(var1, this.id_catch + var5 + var8 * var4, this.id_private + var5 + var9 * var4, var6 + var5, var7 + var5, var4, var4);
            this.id_break(var1, this.id_catch + var5 + (var8 + 1) * var4, this.id_private + var5 + var9 * var4, var6 + var5, var7 + var5, var5, var4);
            this.id_break(var1, this.id_catch + var5 + var8 * var4, this.id_private + var5 + (var9 + 1) * var4, var6 + var5, var7 + var5, var4, var5);
            this.id_break(
               var1, this.id_catch + var5 + (var8 + 1) * var4 - 1, this.id_private + var5 + (var9 + 1) * var4 - 1, var6 + var5, var7 + var5, var5 + 1, var5 + 1
            );
            if (var8 == var2 - 1) {
               this.id_break(var1, this.id_catch + var5 * 2 + var2 * var4, this.id_private + var5 + var9 * var4, var6 + var4 + var5, var7 + var5, var5, var4);
               this.id_break(
                  var1, this.id_catch + var5 * 2 + var2 * var4, this.id_private + var5 + (var9 + 1) * var4, var6 + var4 + var5, var7 + var5, var5, var5
               );
            }
         }

         this.id_break(var1, this.id_catch + var5 + var8 * var4, this.id_private + var5 * 2 + var3 * var4, var6 + var5, var7 + var4 + var5, var4, var5);
         this.id_break(var1, this.id_catch + var5 + (var8 + 1) * var4, this.id_private + var5 * 2 + var3 * var4, var6 + var5, var7 + var4 + var5, var5, var5);
      }
   }

   public void id_class(boolean var1) {
      this.id_case = var1;
   }

   public void id_class(QY var1, mG_2 var2, int var3, int var4, int var5, int var6, float var7) {
      this.id_implements = var1;
      this.id_finally = var2;
      if ((rJr_1)((cb_3)var1.id_class[57]).id_implements[4] instanceof rXH) {
         this.id_volatile = true;
      }

      boolean var8 = ((cb_3)var1.id_class[57]).Z().id_class((rJI<?>)((rJr_1)((cb_3)var1.id_class[57]).id_implements[4]));
      List var9 = var2.id_break(true);
      List var10 = var8 ? Collections.emptyList() : var2.id_break(false);
      int var11 = var9.size();
      int var12 = var11 + var10.size();
      int var13 = var12 <= 16 ? 4 : 5;
      int var14 = (int)Math.ceil((double)((float)var12 / (float)var13));
      this.id_catch = var3;
      this.id_private = var4;
      byte var15 = 25;
      float var16 = (float)(this.id_catch + Math.min(var12, var13) * 25);
      float var17 = (float)(var5 + 50);
      if (var16 > var17) {
         this.id_catch = (int)((float)this.id_catch - var7 * (float)((int)((var16 - var17) / var7)));
      }

      float var18 = (float)(this.id_private + var14 * 25);
      float var19 = (float)(var6 + 50);
      if (var18 > var19) {
         this.id_private = (int)((float)this.id_private - var7 * (float)rfU_2.id_case((var18 - var19) / var7));
      }

      float var20 = (float)this.id_private;
      float var21 = (float)(var6 - 100);
      if (var20 < var21) {
         this.id_private = (int)((float)this.id_private - var7 * (float)rfU_2.id_case((var20 - var21) / var7));
      }

      this.id_case = true;
      this.id_throws.clear();

      for (int var22 = 0; var22 < var12; var22++) {
         boolean var23 = var22 < var11;
         rkw_3 var24 = var23 ? (rkw_3)var9.get(var22) : (rkw_3)var10.get(var22 - var11);
         int var25 = this.id_catch + 4 + 25 * (var22 % var13);
         int var26 = this.id_private + 5 + 25 * (var22 / var13);
         if (this.id_volatile) {
            this.id_throws.add(new mM_2((int)this, var25, var26, (boolean)var24, var23));
         } else {
            this.id_throws.add(new mO_2((int)this, var25, var26, (boolean)var24, var23));
         }
      }

      this.id_extends = null;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      if (this.id_case) {
         this.id_native += var4;
         RenderSystem.enableBlend();
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.id_implements.A().id_class(id_class);
         RenderSystem.pushMatrix();
         RenderSystem.translatef(0.0F, 0.0F, 170.0F);
         int var5 = this.id_throws.size() <= 16 ? 4 : 5;
         int var6 = Math.min(this.id_throws.size(), var5);
         int var7 = rfU_2.id_case((float)this.id_throws.size() / (float)var5);
         byte var8 = 24;
         byte var9 = 4;
         byte var10 = 82;
         short var11 = 208;
         this.id_byte(var1, var6, var7, 24, 4, 82, 208);
         RenderSystem.disableBlend();

         for (mO_2 var13 : this.id_throws) {
            var13.id_class(var1, var2, var3, var4);
         }

         RenderSystem.popMatrix();
      }
   }

   public mG_2 id_class() {
      return this.id_finally;
   }

   @Override
   public boolean id_break(double var1, double var3) {
      return false;
   }

   @Override
   public boolean id_break(boolean var1) {
      return false;
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      if (var5 != 0) {
         return false;
      } else {
         for (mO_2 var7 : this.id_throws) {
            if (var7.id_break(var1, var3, var5)) {
               this.id_extends = var7.id_case;
               return true;
            }
         }

         return false;
      }
   }

   public boolean id_throws() {
      return this.id_case;
   }

   public rkw_3<?> id_protected() {
      return this.id_extends;
   }
}
