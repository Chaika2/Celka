package celestial;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collections;
import java.util.List;

public class mb_3 extends ch_3 implements cC_2, cp_3 {
   static final rqO_2 class_ = new rqO_2("textures/gui/recipe_book.png");
   private final List<mO_2> throws_ = Lists.newArrayList();
   private boolean case_;
   private int catch_;
   private int private_;
   QY implements_;
   private mG_2 finally_;
   private rkw_3<?> extends_;
   float native_;
   boolean volatile_;

   private void byte_(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.break_(var1, this.catch_, this.private_, var6, var7, var5, var5);
      this.break_(var1, this.catch_ + var5 * 2 + var2 * var4, this.private_, var6 + var4 + var5, var7, var5, var5);
      this.break_(var1, this.catch_, this.private_ + var5 * 2 + var3 * var4, var6, var7 + var4 + var5, var5, var5);
      this.break_(var1, this.catch_ + var5 * 2 + var2 * var4, this.private_ + var5 * 2 + var3 * var4, var6 + var4 + var5, var7 + var4 + var5, var5, var5);

      for (int var8 = 0; var8 < var2; var8++) {
         this.break_(var1, this.catch_ + var5 + var8 * var4, this.private_, var6 + var5, var7, var4, var5);
         this.break_(var1, this.catch_ + var5 + (var8 + 1) * var4, this.private_, var6 + var5, var7, var5, var5);

         for (int var9 = 0; var9 < var3; var9++) {
            if (var8 == 0) {
               this.break_(var1, this.catch_, this.private_ + var5 + var9 * var4, var6, var7 + var5, var5, var4);
               this.break_(var1, this.catch_, this.private_ + var5 + (var9 + 1) * var4, var6, var7 + var5, var5, var5);
            }

            this.break_(var1, this.catch_ + var5 + var8 * var4, this.private_ + var5 + var9 * var4, var6 + var5, var7 + var5, var4, var4);
            this.break_(var1, this.catch_ + var5 + (var8 + 1) * var4, this.private_ + var5 + var9 * var4, var6 + var5, var7 + var5, var5, var4);
            this.break_(var1, this.catch_ + var5 + var8 * var4, this.private_ + var5 + (var9 + 1) * var4, var6 + var5, var7 + var5, var4, var5);
            this.break_(
               var1, this.catch_ + var5 + (var8 + 1) * var4 - 1, this.private_ + var5 + (var9 + 1) * var4 - 1, var6 + var5, var7 + var5, var5 + 1, var5 + 1
            );
            if (var8 == var2 - 1) {
               this.break_(var1, this.catch_ + var5 * 2 + var2 * var4, this.private_ + var5 + var9 * var4, var6 + var4 + var5, var7 + var5, var5, var4);
               this.break_(var1, this.catch_ + var5 * 2 + var2 * var4, this.private_ + var5 + (var9 + 1) * var4, var6 + var4 + var5, var7 + var5, var5, var5);
            }
         }

         this.break_(var1, this.catch_ + var5 + var8 * var4, this.private_ + var5 * 2 + var3 * var4, var6 + var5, var7 + var4 + var5, var4, var5);
         this.break_(var1, this.catch_ + var5 + (var8 + 1) * var4, this.private_ + var5 * 2 + var3 * var4, var6 + var5, var7 + var4 + var5, var5, var5);
      }
   }

   public void class_(boolean var1) {
      this.case_ = var1;
   }

   public void class_(QY var1, mG_2 var2, int var3, int var4, int var5, int var6, float var7) {
      this.implements_ = var1;
      this.finally_ = var2;
      if ((rJr_1)((cb_3)var1.class_[57]).implements_[4] instanceof rXH) {
         this.volatile_ = true;
      }

      boolean var8 = ((cb_3)var1.class_[57]).Z().class_((rJI<?>)((rJr_1)((cb_3)var1.class_[57]).implements_[4]));
      List var9 = var2.break_(true);
      List var10 = var8 ? Collections.emptyList() : var2.break_(false);
      int var11 = var9.size();
      int var12 = var11 + var10.size();
      int var13 = var12 <= 16 ? 4 : 5;
      int var14 = (int)Math.ceil((double)((float)var12 / (float)var13));
      this.catch_ = var3;
      this.private_ = var4;
      byte var15 = 25;
      float var16 = (float)(this.catch_ + Math.min(var12, var13) * 25);
      float var17 = (float)(var5 + 50);
      if (var16 > var17) {
         this.catch_ = (int)((float)this.catch_ - var7 * (float)((int)((var16 - var17) / var7)));
      }

      float var18 = (float)(this.private_ + var14 * 25);
      float var19 = (float)(var6 + 50);
      if (var18 > var19) {
         this.private_ = (int)((float)this.private_ - var7 * (float)rfU_2.case_((var18 - var19) / var7));
      }

      float var20 = (float)this.private_;
      float var21 = (float)(var6 - 100);
      if (var20 < var21) {
         this.private_ = (int)((float)this.private_ - var7 * (float)rfU_2.case_((var20 - var21) / var7));
      }

      this.case_ = true;
      this.throws_.clear();

      for (int var22 = 0; var22 < var12; var22++) {
         boolean var23 = var22 < var11;
         rkw_3 var24 = var23 ? (rkw_3)var9.get(var22) : (rkw_3)var10.get(var22 - var11);
         int var25 = this.catch_ + 4 + 25 * (var22 % var13);
         int var26 = this.private_ + 5 + 25 * (var22 / var13);
         if (this.volatile_) {
            this.throws_.add(new mM_2((int)this, var25, var26, (boolean)var24, var23));
         } else {
            this.throws_.add(new mO_2((int)this, var25, var26, (boolean)var24, var23));
         }
      }

      this.extends_ = null;
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      if (this.case_) {
         this.native_ += var4;
         RenderSystem.enableBlend();
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.implements_.A().class_(class_);
         RenderSystem.pushMatrix();
         RenderSystem.translatef(0.0F, 0.0F, 170.0F);
         int var5 = this.throws_.size() <= 16 ? 4 : 5;
         int var6 = Math.min(this.throws_.size(), var5);
         int var7 = rfU_2.case_((float)this.throws_.size() / (float)var5);
         byte var8 = 24;
         byte var9 = 4;
         byte var10 = 82;
         short var11 = 208;
         this.byte_(var1, var6, var7, 24, 4, 82, 208);
         RenderSystem.disableBlend();

         for (mO_2 var13 : this.throws_) {
            var13.class_(var1, var2, var3, var4);
         }

         RenderSystem.popMatrix();
      }
   }

   public mG_2 class_() {
      return this.finally_;
   }

   @Override
   public boolean break_(double var1, double var3) {
      return false;
   }

   @Override
   public boolean break_(boolean var1) {
      return false;
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      if (var5 != 0) {
         return false;
      } else {
         for (mO_2 var7 : this.throws_) {
            if (var7.break_(var1, var3, var5)) {
               this.extends_ = var7.case_;
               return true;
            }
         }

         return false;
      }
   }

   public boolean throws_() {
      return this.case_;
   }

   public rkw_3<?> protected_() {
      return this.extends_;
   }
}
