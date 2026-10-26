package celestial;

import com.google.common.collect.Ordering;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.List;

public abstract class cc_3<T extends rJr_1> extends Fb_1<T> {
   protected boolean id_class;

   private void id_byte(Ml_1 var1, int var2, int var3, Iterable<rLY> var4) {
      int var5 = this.id_abstract;

      for (rLY var7 : var4) {
         String var8 = jI_2.id_class(var7.id_class().id_byte());
         if (var7.id_byte() >= 1 && var7.id_byte() <= 9) {
            var8 = var8 + " " + jI_2.id_class("enchantment.level." + (var7.id_byte() + 1));
         }

         this.id_super.id_class(var1, var8, (float)(var2 + 10 + 18), (float)(var5 + 6), 16777215);
         String var9 = rLK.id_class(var7, 1.0F);
         this.id_super.id_class(var1, var9, (float)(var2 + 10 + 18), (float)(var5 + 6 + 10), 8355711);
         var5 += var3;
      }
   }

   public cc_3(T var1, rhz_3 var2, rgP_2 var3) {
      super((T)var1, var2, var3);
   }

   private void id_class(Ml_1 var1, int var2, int var3, Iterable<rLY> var4) {
      this.id_volatile.A().id_class(id_else);
      int var5 = this.id_abstract;

      for (rLY var7 : var4) {
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.id_break(var1, var2, var5, 0, 166, 140, 32);
         var5 += var3;
      }
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      super.id_class(var1, var2, var3, var4);
      if (this.id_class) {
         this.id_break(var1);
      }
   }

   private void id_break(Ml_1 var1) {
      int var2 = this.id_char - 124;
      Collection var3 = ((cb_3)this.id_volatile.id_class[57]).So();
      if (!var3.isEmpty()) {
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         int var4 = 33;
         if (var3.size() > 5) {
            var4 = 132 / (var3.size() - 1);
         }

         List var5 = Ordering.natural().sortedCopy(var3);
         this.id_class(var1, var2, var4, var5);
         this.id_break(var1, var2, var4, var5);
         this.id_byte(var1, var2, var4, var5);
      }
   }

   private void id_break(Ml_1 var1, int var2, int var3, Iterable<rLY> var4) {
      fC_2 var5 = this.id_volatile.id_abstract();
      int var6 = this.id_abstract;

      for (rLY var8 : var4) {
         rLR var9 = var8.id_class();
         fj_3 var10 = var5.id_class(var9);
         this.id_volatile.A().id_class(var10.id_extends().id_protected());
         id_class(var1, var2 + 6, var6 + 7, this.h_(), 18, 18, var10);
         var6 += var3;
      }
   }

   protected void id_throws() {
      if (((cb_3)this.id_volatile.id_class[57]).So().isEmpty()) {
         this.id_class = false;
      } else {
         this.id_class = true;
      }
   }

   @Override
   protected void v_() {
      super.v_();
      this.id_throws();
   }
}
