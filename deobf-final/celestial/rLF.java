package celestial;

import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.HashSet;

public class rLF extends rLf_1 {
   @Override
   public rLp_1 class_(rRq_1 var1, int var2, int var3, int var4, is_3 var5, int var6, int var7, int var8, boolean var9, boolean var10) {
      EnumSet var11 = EnumSet.noneOf(rLp_1.class);
      rLp_1 var12 = rLp_1.BLOCKED;
      rfH_2 var13 = var5.Bs();
      var12 = this.class_(var1, var2, var3, var4, var6, var7, var8, var9, var10, var11, var12, var13);
      if (var11.contains(rLp_1.FENCE)) {
         return rLp_1.FENCE;
      } else {
         rLp_1 var14 = rLp_1.BLOCKED;

         for (rLp_1 var16 : var11) {
            if (var5.class_(var16) < 0.0F) {
               return var16;
            }

            if (var5.class_(var16) >= var5.class_(var14)) {
               var14 = var16;
            }
         }

         return var12 == rLp_1.OPEN && var5.class_(var14) == 0.0F ? rLp_1.OPEN : var14;
      }
   }

   @Override
   protected rLq_1 class_(int var1, int var2, int var3) {
      rLq_1 var4 = null;
      rLp_1 var5 = this.class_(this.break_, var1, var2, var3);
      float var6 = this.break_.class_(var5);
      if (var6 >= 0.0F) {
         var4 = super.class_(var1, var2, var3);
         var4.native_ = var5;
         var4.extends_ = Math.max(var4.extends_, var6);
         if (var5 == rLp_1.WALKABLE) {
            var4.extends_++;
         }
      }

      return var5 != rLp_1.OPEN && var5 != rLp_1.WALKABLE ? var4 : var4;
   }

   private boolean class_(rLq_1 var1) {
      return var1 != null && var1.extends_ >= 0.0F;
   }

   @Override
   public rLp_1 class_(rRq_1 var1, int var2, int var3, int var4) {
      rfw_3 var5 = new rfw_3();
      rLp_1 var6 = break_(var1, var5.class_(var2, var3, var4));
      if (var6 == rLp_1.OPEN && var3 >= 1) {
         xc_3 var7 = var1.byte_(var5.class_(var2, var3 - 1, var4));
         rLp_1 var8 = break_(var1, var5.class_(var2, var3 - 1, var4));
         if (var8 == rLp_1.DAMAGE_FIRE || var7.class_(xu_3.bV) || var8 == rLp_1.LAVA || var7.class_(rls_3.l)) {
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
         var6 = class_(var1, var5.class_(var2, var3, var4), var6);
      }

      return var6;
   }

   private rLp_1 class_(is_3 var1, rfH_2 var2) {
      return this.class_(var1, var2.b_(), var2.c_(), var2.d_());
   }

   private rLp_1 class_(is_3 var1, int var2, int var3, int var4) {
      return this.class_(this.class_, var2, var3, var4, var1, this.protected_, this.throws_, this.case_, this.protected_(), this.byte_());
   }

   @Override
   public void class_() {
      this.break_.class_(rLp_1.WATER, this.finally_);
      super.class_();
   }

   @Override
   public rLv_1 class_(double var1, double var3, double var5) {
      return new rLv_1(super.class_(rfU_2.byte_(var1), rfU_2.byte_(var3), rfU_2.byte_(var5)));
   }

   @Override
   public int class_(rLq_1[] var1, rLq_1 var2) {
      int var3 = 0;
      rLq_1 var4 = this.class_(var2.class_, var2.break_, var2.byte_ + 1);
      if (this.break_(var4)) {
         var1[var3++] = var4;
      }

      rLq_1 var5 = this.class_(var2.class_ - 1, var2.break_, var2.byte_);
      if (this.break_(var5)) {
         var1[var3++] = var5;
      }

      rLq_1 var6 = this.class_(var2.class_ + 1, var2.break_, var2.byte_);
      if (this.break_(var6)) {
         var1[var3++] = var6;
      }

      rLq_1 var7 = this.class_(var2.class_, var2.break_, var2.byte_ - 1);
      if (this.break_(var7)) {
         var1[var3++] = var7;
      }

      rLq_1 var8 = this.class_(var2.class_, var2.break_ + 1, var2.byte_);
      if (this.break_(var8)) {
         var1[var3++] = var8;
      }

      rLq_1 var9 = this.class_(var2.class_, var2.break_ - 1, var2.byte_);
      if (this.break_(var9)) {
         var1[var3++] = var9;
      }

      rLq_1 var10 = this.class_(var2.class_, var2.break_ + 1, var2.byte_ + 1);
      if (this.break_(var10) && this.class_(var4) && this.class_(var8)) {
         var1[var3++] = var10;
      }

      rLq_1 var11 = this.class_(var2.class_ - 1, var2.break_ + 1, var2.byte_);
      if (this.break_(var11) && this.class_(var5) && this.class_(var8)) {
         var1[var3++] = var11;
      }

      rLq_1 var12 = this.class_(var2.class_ + 1, var2.break_ + 1, var2.byte_);
      if (this.break_(var12) && this.class_(var6) && this.class_(var8)) {
         var1[var3++] = var12;
      }

      rLq_1 var13 = this.class_(var2.class_, var2.break_ + 1, var2.byte_ - 1);
      if (this.break_(var13) && this.class_(var7) && this.class_(var8)) {
         var1[var3++] = var13;
      }

      rLq_1 var14 = this.class_(var2.class_, var2.break_ - 1, var2.byte_ + 1);
      if (this.break_(var14) && this.class_(var4) && this.class_(var9)) {
         var1[var3++] = var14;
      }

      rLq_1 var15 = this.class_(var2.class_ - 1, var2.break_ - 1, var2.byte_);
      if (this.break_(var15) && this.class_(var5) && this.class_(var9)) {
         var1[var3++] = var15;
      }

      rLq_1 var16 = this.class_(var2.class_ + 1, var2.break_ - 1, var2.byte_);
      if (this.break_(var16) && this.class_(var6) && this.class_(var9)) {
         var1[var3++] = var16;
      }

      rLq_1 var17 = this.class_(var2.class_, var2.break_ - 1, var2.byte_ - 1);
      if (this.break_(var17) && this.class_(var7) && this.class_(var9)) {
         var1[var3++] = var17;
      }

      rLq_1 var18 = this.class_(var2.class_ + 1, var2.break_, var2.byte_ - 1);
      if (this.break_(var18) && this.class_(var7) && this.class_(var6)) {
         var1[var3++] = var18;
      }

      rLq_1 var19 = this.class_(var2.class_ + 1, var2.break_, var2.byte_ + 1);
      if (this.break_(var19) && this.class_(var4) && this.class_(var6)) {
         var1[var3++] = var19;
      }

      rLq_1 var20 = this.class_(var2.class_ - 1, var2.break_, var2.byte_ - 1);
      if (this.break_(var20) && this.class_(var7) && this.class_(var5)) {
         var1[var3++] = var20;
      }

      rLq_1 var21 = this.class_(var2.class_ - 1, var2.break_, var2.byte_ + 1);
      if (this.break_(var21) && this.class_(var4) && this.class_(var5)) {
         var1[var3++] = var21;
      }

      rLq_1 var22 = this.class_(var2.class_ + 1, var2.break_ + 1, var2.byte_ - 1);
      if (this.break_(var22) && this.class_(var18) && this.class_(var7) && this.class_(var6) && this.class_(var8) && this.class_(var13) && this.class_(var12)) {
         var1[var3++] = var22;
      }

      rLq_1 var23 = this.class_(var2.class_ + 1, var2.break_ + 1, var2.byte_ + 1);
      if (this.break_(var23) && this.class_(var19) && this.class_(var4) && this.class_(var6) && this.class_(var8) && this.class_(var10) && this.class_(var12)) {
         var1[var3++] = var23;
      }

      rLq_1 var24 = this.class_(var2.class_ - 1, var2.break_ + 1, var2.byte_ - 1);
      if (this.break_(var24) && this.class_(var20) && this.class_(var7) && this.class_(var5) & this.class_(var8) && this.class_(var13) && this.class_(var11)) {
         var1[var3++] = var24;
      }

      rLq_1 var25 = this.class_(var2.class_ - 1, var2.break_ + 1, var2.byte_ + 1);
      if (this.break_(var25) && this.class_(var21) && this.class_(var4) && this.class_(var5) & this.class_(var8) && this.class_(var10) && this.class_(var11)) {
         var1[var3++] = var25;
      }

      rLq_1 var26 = this.class_(var2.class_ + 1, var2.break_ - 1, var2.byte_ - 1);
      if (this.break_(var26) && this.class_(var18) && this.class_(var7) && this.class_(var6) && this.class_(var9) && this.class_(var17) && this.class_(var16)) {
         var1[var3++] = var26;
      }

      rLq_1 var27 = this.class_(var2.class_ + 1, var2.break_ - 1, var2.byte_ + 1);
      if (this.break_(var27) && this.class_(var19) && this.class_(var4) && this.class_(var6) && this.class_(var9) && this.class_(var14) && this.class_(var16)) {
         var1[var3++] = var27;
      }

      rLq_1 var28 = this.class_(var2.class_ - 1, var2.break_ - 1, var2.byte_ - 1);
      if (this.break_(var28) && this.class_(var20) && this.class_(var7) && this.class_(var5) && this.class_(var9) && this.class_(var17) && this.class_(var15)) {
         var1[var3++] = var28;
      }

      rLq_1 var29 = this.class_(var2.class_ - 1, var2.break_ - 1, var2.byte_ + 1);
      if (this.break_(var29) && this.class_(var21) && this.class_(var4) && this.class_(var5) && this.class_(var9) && this.class_(var14) && this.class_(var15)) {
         var1[var3++] = var29;
      }

      return var3;
   }

   @Override
   public void class_(rRU var1, is_3 var2) {
      super.class_(var1, var2);
      this.finally_ = var2.class_(rLp_1.WATER);
   }

   private boolean break_(rLq_1 var1) {
      return var1 != null && !var1.implements_;
   }

   @Override
   public rLq_1 break_() {
      int var1;
      if (this.throws_() && this.break_.rT()) {
         var1 = rfU_2.byte_(this.break_.re());
         rfw_3 var2 = new rfw_3(this.break_.rx(), (double)var1, this.break_.BO());

         for (xd_3 var3 = this.class_.byte_(var2).break_(); var3 == xu_3.try_; var3 = this.class_.byte_(var2).break_()) {
            var2.break_(this.break_.rx(), (double)(++var1), this.break_.BO());
         }
      } else {
         var1 = rfU_2.byte_(this.break_.re() + 0.5);
      }

      rfH_2 var8 = this.break_.Bs();
      rLp_1 var9 = this.class_(this.break_, var8.b_(), var1, var8.d_());
      if (this.break_.class_(var9) < 0.0F) {
         HashSet var4 = Sets.newHashSet();
         var4.add(new rfH_2(this.break_.rN().class_, (double)var1, this.break_.rN().byte_));
         var4.add(new rfH_2(this.break_.rN().class_, (double)var1, this.break_.rN().case_));
         var4.add(new rfH_2(this.break_.rN().protected_, (double)var1, this.break_.rN().byte_));
         var4.add(new rfH_2(this.break_.rN().protected_, (double)var1, this.break_.rN().case_));

         for (rfH_2 var6 : var4) {
            rLp_1 var7 = this.class_(this.break_, var6);
            if (this.break_.class_(var7) >= 0.0F) {
               return super.class_(var6.b_(), var6.c_(), var6.d_());
            }
         }
      }

      return super.class_(var8.b_(), var1, var8.d_());
   }
}
