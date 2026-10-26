package celestial;

import com.google.common.collect.Ordering;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.List;

public abstract class cc_3<T extends rJr_1> extends Fb_1<T> {
   protected boolean class_;

   private void byte_(Ml_1 var1, int var2, int var3, Iterable<rLY> var4) {
      int var5 = this.abstract_;

      for (rLY var7 : var4) {
         String var8 = jI_2.class_(var7.class_().byte_());
         if (var7.byte_() >= 1 && var7.byte_() <= 9) {
            var8 = var8 + " " + jI_2.class_("enchantment.level." + (var7.byte_() + 1));
         }

         this.super_.class_(var1, var8, (float)(var2 + 10 + 18), (float)(var5 + 6), 16777215);
         String var9 = rLK.class_(var7, 1.0F);
         this.super_.class_(var1, var9, (float)(var2 + 10 + 18), (float)(var5 + 6 + 10), 8355711);
         var5 += var3;
      }
   }

   public cc_3(T var1, rhz_3 var2, rgP_2 var3) {
      super((T)var1, var2, var3);
   }

   private void class_(Ml_1 var1, int var2, int var3, Iterable<rLY> var4) {
      this.volatile_.A().class_(else_);
      int var5 = this.abstract_;

      for (rLY var7 : var4) {
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.break_(var1, var2, var5, 0, 166, 140, 32);
         var5 += var3;
      }
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      super.class_(var1, var2, var3, var4);
      if (this.class_) {
         this.break_(var1);
      }
   }

   private void break_(Ml_1 var1) {
      int var2 = this.char_ - 124;
      Collection var3 = ((cb_3)this.volatile_.class_[57]).So();
      if (!var3.isEmpty()) {
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         int var4 = 33;
         if (var3.size() > 5) {
            var4 = 132 / (var3.size() - 1);
         }

         List var5 = Ordering.natural().sortedCopy(var3);
         this.class_(var1, var2, var4, var5);
         this.break_(var1, var2, var4, var5);
         this.byte_(var1, var2, var4, var5);
      }
   }

   private void break_(Ml_1 var1, int var2, int var3, Iterable<rLY> var4) {
      fC_2 var5 = this.volatile_.abstract_();
      int var6 = this.abstract_;

      for (rLY var8 : var4) {
         rLR var9 = var8.class_();
         fj_3 var10 = var5.class_(var9);
         this.volatile_.A().class_(var10.extends_().protected_());
         class_(var1, var2 + 6, var6 + 7, this.h_(), 18, 18, var10);
         var6 += var3;
      }
   }

   protected void throws_() {
      if (((cb_3)this.volatile_.class_[57]).So().isEmpty()) {
         this.class_ = false;
      } else {
         this.class_ = true;
      }
   }

   @Override
   protected void v_() {
      super.v_();
      this.throws_();
   }
}
