package celestial;

import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.HashSet;

public class rLF extends rLf_1 {
   @Override
   public rLp_1 id_class(rRq_1 var1, int var2, int var3, int var4, is_3 var5, int var6, int var7, int var8, boolean var9, boolean var10) {
      EnumSet var11 = EnumSet.noneOf(rLp_1.class);
      rLp_1 var12 = rLp_1.BLOCKED;
      rfH_2 var13 = var5.Bs();
      var12 = this.id_class(var1, var2, var3, var4, var6, var7, var8, var9, var10, var11, var12, var13);
      if (var11.contains(rLp_1.FENCE)) {
         return rLp_1.FENCE;
      } else {
         rLp_1 var14 = rLp_1.BLOCKED;

         for (rLp_1 var16 : var11) {
            if (var5.id_class(var16) < 0.0F) {
               return var16;
            }

            if (var5.id_class(var16) >= var5.id_class(var14)) {
               var14 = var16;
            }
         }

         return var12 == rLp_1.OPEN && var5.id_class(var14) == 0.0F ? rLp_1.OPEN : var14;
      }
   }

   @Override
   protected rLq_1 id_class(int var1, int var2, int var3) {
      rLq_1 var4 = null;
      rLp_1 var5 = this.id_class(this.id_break, var1, var2, var3);
      float var6 = this.id_break.id_class(var5);
      if (var6 >= 0.0F) {
         var4 = super.id_class(var1, var2, var3);
         var4.id_native = var5;
         var4.id_extends = Math.max(var4.id_extends, var6);
         if (var5 == rLp_1.WALKABLE) {
            var4.id_extends++;
         }
      }

      return var5 != rLp_1.OPEN && var5 != rLp_1.WALKABLE ? var4 : var4;
   }

   private boolean id_class(rLq_1 var1) {
      return var1 != null && var1.id_extends >= 0.0F;
   }

   @Override
   public rLp_1 id_class(rRq_1 var1, int var2, int var3, int var4) {
      rfw_3 var5 = new rfw_3();
      rLp_1 var6 = id_break(var1, var5.id_class(var2, var3, var4));
      if (var6 == rLp_1.OPEN && var3 >= 1) {
         xc_3 var7 = var1.id_byte(var5.id_class(var2, var3 - 1, var4));
         rLp_1 var8 = id_break(var1, var5.id_class(var2, var3 - 1, var4));
         if (var8 == rLp_1.DAMAGE_FIRE || var7.id_class(xu_3.bV) || var8 == rLp_1.LAVA || var7.id_class(rls_3.l)) {
            var6 = rLp_1.DAMAGE_FIRE;
         } else if (var8 == rLp_1.DAMAGE_CACTUS) {
            var6 = rLp_1.DAMAGE_CACTUS;
         } else if (var8 == rLp_1.DAMAGE_OTHER) {
            var6 = rLp_1.DAMAGE_OTHER;
         } else if (var8 == rLp_1.COCOA) {
            var6 = rLp_1.COCOA;
         } else if (var8 == rLp_1.FENCE) {
            var6 = rLp_1.FENCE;
         } else {
            var6 = var8 != rLp_1.WALKABLE && var8 != rLp_1.OPEN && var8 != rLp_1.WATER ? rLp_1.WALKABLE : rLp_1.OPEN;
         }
      }

      if (var6 == rLp_1.WALKABLE || var6 == rLp_1.OPEN) {
         var6 = id_class(var1, var5.id_class(var2, var3, var4), var6);
      }

      return var6;
   }

   private rLp_1 id_class(is_3 var1, rfH_2 var2) {
      return this.id_class(var1, var2.b_(), var2.c_(), var2.d_());
   }

   private rLp_1 id_class(is_3 var1, int var2, int var3, int var4) {
      return this.id_class(this.id_class, var2, var3, var4, var1, this.id_protected, this.id_throws, this.id_case, this.id_protected(), this.id_byte());
   }

   @Override
   public void id_class() {
      this.id_break.id_class(rLp_1.WATER, this.id_finally);
      super.id_class();
   }

   @Override
   public rLv_1 id_class(double var1, double var3, double var5) {
      return new rLv_1(super.id_class(rfU_2.id_byte(var1), rfU_2.id_byte(var3), rfU_2.id_byte(var5)));
   }

   @Override
   public int id_class(rLq_1[] var1, rLq_1 var2) {
      int var3 = 0;
      rLq_1 var4 = this.id_class(var2.id_class, var2.id_break, var2.id_byte + 1);
      if (this.id_break(var4)) {
         var1[var3++] = var4;
      }

      rLq_1 var5 = this.id_class(var2.id_class - 1, var2.id_break, var2.id_byte);
      if (this.id_break(var5)) {
         var1[var3++] = var5;
      }

      rLq_1 var6 = this.id_class(var2.id_class + 1, var2.id_break, var2.id_byte);
      if (this.id_break(var6)) {
         var1[var3++] = var6;
      }

      rLq_1 var7 = this.id_class(var2.id_class, var2.id_break, var2.id_byte - 1);
      if (this.id_break(var7)) {
         var1[var3++] = var7;
      }

      rLq_1 var8 = this.id_class(var2.id_class, var2.id_break + 1, var2.id_byte);
      if (this.id_break(var8)) {
         var1[var3++] = var8;
      }

      rLq_1 var9 = this.id_class(var2.id_class, var2.id_break - 1, var2.id_byte);
      if (this.id_break(var9)) {
         var1[var3++] = var9;
      }

      rLq_1 var10 = this.id_class(var2.id_class, var2.id_break + 1, var2.id_byte + 1);
      if (this.id_break(var10) && this.id_class(var4) && this.id_class(var8)) {
         var1[var3++] = var10;
      }

      rLq_1 var11 = this.id_class(var2.id_class - 1, var2.id_break + 1, var2.id_byte);
      if (this.id_break(var11) && this.id_class(var5) && this.id_class(var8)) {
         var1[var3++] = var11;
      }

      rLq_1 var12 = this.id_class(var2.id_class + 1, var2.id_break + 1, var2.id_byte);
      if (this.id_break(var12) && this.id_class(var6) && this.id_class(var8)) {
         var1[var3++] = var12;
      }

      rLq_1 var13 = this.id_class(var2.id_class, var2.id_break + 1, var2.id_byte - 1);
      if (this.id_break(var13) && this.id_class(var7) && this.id_class(var8)) {
         var1[var3++] = var13;
      }

      rLq_1 var14 = this.id_class(var2.id_class, var2.id_break - 1, var2.id_byte + 1);
      if (this.id_break(var14) && this.id_class(var4) && this.id_class(var9)) {
         var1[var3++] = var14;
      }

      rLq_1 var15 = this.id_class(var2.id_class - 1, var2.id_break - 1, var2.id_byte);
      if (this.id_break(var15) && this.id_class(var5) && this.id_class(var9)) {
         var1[var3++] = var15;
      }

      rLq_1 var16 = this.id_class(var2.id_class + 1, var2.id_break - 1, var2.id_byte);
      if (this.id_break(var16) && this.id_class(var6) && this.id_class(var9)) {
         var1[var3++] = var16;
      }

      rLq_1 var17 = this.id_class(var2.id_class, var2.id_break - 1, var2.id_byte - 1);
      if (this.id_break(var17) && this.id_class(var7) && this.id_class(var9)) {
         var1[var3++] = var17;
      }

      rLq_1 var18 = this.id_class(var2.id_class + 1, var2.id_break, var2.id_byte - 1);
      if (this.id_break(var18) && this.id_class(var7) && this.id_class(var6)) {
         var1[var3++] = var18;
      }

      rLq_1 var19 = this.id_class(var2.id_class + 1, var2.id_break, var2.id_byte + 1);
      if (this.id_break(var19) && this.id_class(var4) && this.id_class(var6)) {
         var1[var3++] = var19;
      }

      rLq_1 var20 = this.id_class(var2.id_class - 1, var2.id_break, var2.id_byte - 1);
      if (this.id_break(var20) && this.id_class(var7) && this.id_class(var5)) {
         var1[var3++] = var20;
      }

      rLq_1 var21 = this.id_class(var2.id_class - 1, var2.id_break, var2.id_byte + 1);
      if (this.id_break(var21) && this.id_class(var4) && this.id_class(var5)) {
         var1[var3++] = var21;
      }

      rLq_1 var22 = this.id_class(var2.id_class + 1, var2.id_break + 1, var2.id_byte - 1);
      if (this.id_break(var22)
         && this.id_class(var18)
         && this.id_class(var7)
         && this.id_class(var6)
         && this.id_class(var8)
         && this.id_class(var13)
         && this.id_class(var12)) {
         var1[var3++] = var22;
      }

      rLq_1 var23 = this.id_class(var2.id_class + 1, var2.id_break + 1, var2.id_byte + 1);
      if (this.id_break(var23)
         && this.id_class(var19)
         && this.id_class(var4)
         && this.id_class(var6)
         && this.id_class(var8)
         && this.id_class(var10)
         && this.id_class(var12)) {
         var1[var3++] = var23;
      }

      rLq_1 var24 = this.id_class(var2.id_class - 1, var2.id_break + 1, var2.id_byte - 1);
      if (this.id_break(var24)
         && this.id_class(var20)
         && this.id_class(var7)
         && this.id_class(var5) & this.id_class(var8)
         && this.id_class(var13)
         && this.id_class(var11)) {
         var1[var3++] = var24;
      }

      rLq_1 var25 = this.id_class(var2.id_class - 1, var2.id_break + 1, var2.id_byte + 1);
      if (this.id_break(var25)
         && this.id_class(var21)
         && this.id_class(var4)
         && this.id_class(var5) & this.id_class(var8)
         && this.id_class(var10)
         && this.id_class(var11)) {
         var1[var3++] = var25;
      }

      rLq_1 var26 = this.id_class(var2.id_class + 1, var2.id_break - 1, var2.id_byte - 1);
      if (this.id_break(var26)
         && this.id_class(var18)
         && this.id_class(var7)
         && this.id_class(var6)
         && this.id_class(var9)
         && this.id_class(var17)
         && this.id_class(var16)) {
         var1[var3++] = var26;
      }

      rLq_1 var27 = this.id_class(var2.id_class + 1, var2.id_break - 1, var2.id_byte + 1);
      if (this.id_break(var27)
         && this.id_class(var19)
         && this.id_class(var4)
         && this.id_class(var6)
         && this.id_class(var9)
         && this.id_class(var14)
         && this.id_class(var16)) {
         var1[var3++] = var27;
      }

      rLq_1 var28 = this.id_class(var2.id_class - 1, var2.id_break - 1, var2.id_byte - 1);
      if (this.id_break(var28)
         && this.id_class(var20)
         && this.id_class(var7)
         && this.id_class(var5)
         && this.id_class(var9)
         && this.id_class(var17)
         && this.id_class(var15)) {
         var1[var3++] = var28;
      }

      rLq_1 var29 = this.id_class(var2.id_class - 1, var2.id_break - 1, var2.id_byte + 1);
      if (this.id_break(var29)
         && this.id_class(var21)
         && this.id_class(var4)
         && this.id_class(var5)
         && this.id_class(var9)
         && this.id_class(var14)
         && this.id_class(var15)) {
         var1[var3++] = var29;
      }

      return var3;
   }

   @Override
   public void id_class(rRU var1, is_3 var2) {
      super.id_class(var1, var2);
      this.id_finally = var2.id_class(rLp_1.WATER);
   }

   private boolean id_break(rLq_1 var1) {
      return var1 != null && !var1.id_implements;
   }

   @Override
   public rLq_1 id_break() {
      int var1;
      if (this.id_throws() && this.id_break.rT()) {
         var1 = rfU_2.id_byte(this.id_break.re());
         rfw_3 var2 = new rfw_3(this.id_break.rx(), (double)var1, this.id_break.BO());

         for (xd_3 var3 = this.id_class.id_byte(var2).id_break(); var3 == xu_3.id_try; var3 = this.id_class.id_byte(var2).id_break()) {
            var2.id_break(this.id_break.rx(), (double)(++var1), this.id_break.BO());
         }
      } else {
         var1 = rfU_2.id_byte(this.id_break.re() + 0.5);
      }

      rfH_2 var8 = this.id_break.Bs();
      rLp_1 var9 = this.id_class(this.id_break, var8.b_(), var1, var8.d_());
      if (this.id_break.id_class(var9) < 0.0F) {
         HashSet var4 = Sets.newHashSet();
         var4.add(new rfH_2(this.id_break.rN().id_class, (double)var1, this.id_break.rN().id_byte));
         var4.add(new rfH_2(this.id_break.rN().id_class, (double)var1, this.id_break.rN().id_case));
         var4.add(new rfH_2(this.id_break.rN().id_protected, (double)var1, this.id_break.rN().id_byte));
         var4.add(new rfH_2(this.id_break.rN().id_protected, (double)var1, this.id_break.rN().id_case));

         for (rfH_2 var6 : var4) {
            rLp_1 var7 = this.id_class(this.id_break, var6);
            if (this.id_break.id_class(var7) >= 0.0F) {
               return super.id_class(var6.b_(), var6.c_(), var6.d_());
            }
         }
      }

      return super.id_class(var8.b_(), var1, var8.d_());
   }
}
