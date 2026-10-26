package celestial;

import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;

public class rhF_2 extends rhm_3 {
   private static final rut_3<Integer> id_private = rmE_2.id_class(rhF_2.class, ruw_3.id_break);
   private rLi_1 id_implements = rAS.id_class;
   private final Set<rLY> id_finally = Sets.newHashSet();
   private boolean id_extends;

   private void id_byte(int var1) {
      this.id_extends = true;
      ((rmE_2)this.id_throws[49]).id_break(id_private, var1);
   }

   public static int id_byte(rdn_3 var0) {
      rcd_3 var1 = var0.id_package();
      return var1 != null && var1.id_byte("CustomPotionColor", 99) ? var1.id_private("CustomPotionColor") : -1;
   }

   public rhF_2(aI_2<? extends rhF_2> var1, rYB var2) {
      super(var1, var2);
   }

   public rhF_2(rYB var1, iB_2 var2) {
      super(aI_2.id_byte, var2, var1);
   }

   public rhF_2(rYB var1, double var2, double var4, double var6) {
      super(aI_2.id_byte, var2, var4, var6, var1);
   }

   @Override
   public void id_this() {
      super.id_this();
      if (((rYB)this.id_throws[7]).id_continue) {
         if (this.id_class) {
            if (this.id_break % 5 == 0) {
               this.id_break(1);
            }
         } else {
            this.id_break(2);
         }
      } else if (this.id_class && this.id_break != 0 && !this.id_finally.isEmpty() && this.id_break >= 600) {
         ((rYB)this.id_throws[7]).id_class(this, (byte)0);
         this.id_implements = rAS.id_class;
         this.id_finally.clear();
         ((rmE_2)this.id_throws[49]).id_break(id_private, -1);
      }
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      if (this.id_implements != rAS.id_class && this.id_implements != null) {
         var1.id_class("Potion", rVL.id_double.id_break(this.id_implements).toString());
      }

      if (this.id_extends) {
         var1.id_break("Color", this.id_super());
      }

      if (!this.id_finally.isEmpty()) {
         rcy_3 var2 = new rcy_3();

         for (rLY var4 : this.id_finally) {
            var2.add(var4.id_class(new rcd_3()));
         }

         var1.id_class("CustomPotionEffects", var2);
      }
   }

   @Override
   public void id_class(byte var1) {
      if (var1 == 0) {
         int var2 = this.id_super();
         if (var2 != -1) {
            double var3 = (double)(var2 >> 16 & 0xFF) / 255.0;
            double var5 = (double)(var2 >> 8 & 0xFF) / 255.0;
            double var7 = (double)(var2 >> 0 & 0xFF) / 255.0;

            for (int var9 = 0; var9 < 20; var9++) {
               ((rYB)this.id_throws[7]).id_class(rLQ.id_else, this.id_break(0.5), this.Ph(), this.id_protected(0.5), var3, var5, var7);
            }
         }
      } else {
         super.id_class(var1);
      }
   }

   @Override
   protected void id_class(iB_2 var1) {
      super.id_class(var1);

      for (rLY var3 : this.id_implements.id_class()) {
         var1.id_break(new rLY(var3.id_class(), Math.max(var3.id_break() / 8, 1), var3.id_byte(), var3.id_protected(), var3.id_throws()));
      }

      if (!this.id_finally.isEmpty()) {
         for (rLY var5 : this.id_finally) {
            var1.id_break(var5);
         }
      }
   }

   public void id_class(rLY var1) {
      this.id_finally.add(var1);
      this.BQ().id_break(id_private, rAB.id_class(rAB.id_class(this.id_implements, this.id_finally)));
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      if (var1.id_byte("Potion", 8)) {
         this.id_implements = rAB.id_byte(var1);
      }

      for (rLY var3 : rAB.id_break(var1)) {
         this.id_class(var3);
      }

      if (var1.id_byte("Color", 99)) {
         this.id_byte(var1.id_private("Color"));
      } else {
         this.id_public();
      }
   }

   private void id_break(int var1) {
      int var2 = this.id_super();
      if (var2 != -1 && var1 > 0) {
         double var3 = (double)(var2 >> 16 & 0xFF) / 255.0;
         double var5 = (double)(var2 >> 8 & 0xFF) / 255.0;
         double var7 = (double)(var2 >> 0 & 0xFF) / 255.0;

         for (int var9 = 0; var9 < var1; var9++) {
            ((rYB)this.id_throws[7]).id_class(rLQ.id_else, this.id_break(0.5), this.Ph(), this.id_protected(0.5), var3, var5, var7);
         }
      }
   }

   public void id_break(rdn_3 var1) {
      if (var1.id_break() == rdy_3.kz) {
         this.id_implements = rAB.id_protected(var1);
         List var2 = rAB.id_break(var1);
         if (!var2.isEmpty()) {
            for (rLY var4 : var2) {
               this.id_finally.add(new rLY(var4));
            }
         }

         int var5 = id_byte(var1);
         if (var5 == -1) {
            this.id_public();
         } else {
            this.id_byte(var5);
         }
      } else if (var1.id_break() == rdy_3.OO) {
         this.id_implements = rAS.id_class;
         this.id_finally.clear();
         ((rmE_2)this.id_throws[49]).id_break(id_private, -1);
      }
   }

   @Override
   protected rdn_3 id_catch() {
      if (this.id_finally.isEmpty() && this.id_implements == rAS.id_class) {
         return new rdn_3(rdy_3.OO);
      } else {
         rdn_3 var1 = new rdn_3(rdy_3.kz);
         rAB.id_class(var1, this.id_implements);
         rAB.id_class(var1, this.id_finally);
         if (this.id_extends) {
            var1.id_int().id_break("CustomPotionColor", this.id_super());
         }

         return var1;
      }
   }

   public int id_super() {
      return ((rmE_2)this.id_throws[49]).id_class(id_private);
   }

   private void id_public() {
      this.id_extends = false;
      if (this.id_implements == rAS.id_class && this.id_finally.isEmpty()) {
         ((rmE_2)this.id_throws[49]).id_break(id_private, -1);
      } else {
         ((rmE_2)this.id_throws[49]).id_break(id_private, rAB.id_class(rAB.id_class(this.id_implements, this.id_finally)));
      }
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_private, -1);
   }
}
