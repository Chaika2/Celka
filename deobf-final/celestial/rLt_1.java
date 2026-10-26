package celestial;

public class rLt_1 extends rLn_1 {
   private final boolean finally_;

   private rLp_1 byte_(int var1, int var2, int var3) {
      rfw_3 var4 = new rfw_3();

      for (int var5 = var1; var5 < var1 + this.protected_; var5++) {
         for (int var6 = var2; var6 < var2 + this.throws_; var6++) {
            for (int var7 = var3; var7 < var3 + this.case_; var7++) {
               rXE var8 = this.class_.break_(var4.class_(var5, var6, var7));
               xc_3 var9 = this.class_.byte_(var4.class_(var5, var6, var7));
               if (var8.byte_() && var9.class_(this.class_, var4.break_(), rLT.WATER) && var9.catch_()) {
                  return rLp_1.BREACH;
               }

               if (!var8.class_(rlG_2.break_)) {
                  return rLp_1.BLOCKED;
               }
            }
         }
      }

      xc_3 var10 = this.class_.byte_(var4);
      return var10.class_(this.class_, var4, rLT.WATER) ? rLp_1.WATER : rLp_1.BLOCKED;
   }

   public rLt_1(boolean var1) {
      this.finally_ = var1;
   }

   @Override
   public rLp_1 class_(rRq_1 var1, int var2, int var3, int var4, is_3 var5, int var6, int var7, int var8, boolean var9, boolean var10) {
      return this.class_(var1, var2, var3, var4);
   }

   @Override
   protected rLq_1 class_(int var1, int var2, int var3) {
      rLq_1 var4 = null;
      rLp_1 var5 = this.class_((rYB)this.break_.throws_[7], var1, var2, var3);
      float var6 = this.break_.class_(var5);
      if (var6 >= 0.0F) {
         var4 = super.class_(var1, var2, var3);
         var4.native_ = var5;
         var4.extends_ = Math.max(var4.extends_, var6);
         if (this.class_.break_(new rfH_2(var1, var2, var3)).byte_()) {
            var4.extends_ += 8.0F;
         }
      }

      return var5 == rLp_1.OPEN ? var4 : var4;
   }

   @Override
   public rLp_1 class_(rRq_1 var1, int var2, int var3, int var4) {
      rfH_2 var5 = new rfH_2(var2, var3, var4);
      rXE var6 = var1.break_(var5);
      xc_3 var7 = var1.byte_(var5);
      if (var6.byte_() && var7.class_(var1, var5.break_(), rLT.WATER) && var7.catch_()) {
         return rLp_1.BREACH;
      } else {
         return var6.class_(rlG_2.break_) && var7.class_(var1, var5, rLT.WATER) ? rLp_1.WATER : rLp_1.BLOCKED;
      }
   }

   @Override
   public rLv_1 class_(double var1, double var3, double var5) {
      return new rLv_1(
         super.class_(rfU_2.byte_(var1 - (double)(this.break_.PN() / 2.0F)), rfU_2.byte_(var3 + 0.5), rfU_2.byte_(var5 - (double)(this.break_.PN() / 2.0F)))
      );
   }

   @Override
   public int class_(rLq_1[] var1, rLq_1 var2) {
      int var3 = 0;

      for (rpr_3 var7 : rpr_3.values()) {
         rLq_1 var8 = this.break_(var2.class_ + var7.implements_(), var2.break_ + var7.finally_(), var2.byte_ + var7.extends_());
         if (var8 != null && !var8.implements_) {
            var1[var3++] = var8;
         }
      }

      return var3;
   }

   private rLq_1 break_(int var1, int var2, int var3) {
      rLp_1 var4 = this.byte_(var1, var2, var3);
      return (!this.finally_ || var4 != rLp_1.BREACH) && var4 != rLp_1.WATER ? null : this.class_(var1, var2, var3);
   }

   @Override
   public rLq_1 break_() {
      return super.class_(rfU_2.byte_(this.break_.rN().class_), rfU_2.byte_(this.break_.rN().break_ + 0.5), rfU_2.byte_(this.break_.rN().byte_));
   }
}
