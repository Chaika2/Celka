package celestial;

import java.util.List;
import java.util.Random;

public class xD_2 extends Wk_1 implements kx_3 {
   public static final rCu_1<rCw_1> volatile_ = rCT.I;

   @Override
   protected void byte_(rYB var1, rfH_2 var2, xc_3 var3) {
      if (!var1.finally_().break_(var2, this)) {
         int var4 = this.throws_(var1, var2, var3);
         ryO_2 var5 = var1.class_(var2);
         int var6 = var5 instanceof rHL ? ((rHL)var5).throws_() : 0;
         if (var4 != var6 || var3.byte_(package_) != this.class_(var1, var2, var3)) {
            rYr_1 var7 = this.byte_(var1, var2, var3) ? rYr_1.HIGH : rYr_1.NORMAL;
            var1.finally_().class_(var2, this, 2, var7);
         }
      }
   }

   public xD_2(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(p, rpr_3.NORTH).class_(package_, Boolean.valueOf(false)).class_(volatile_, rCw_1.COMPARE));
   }

   private rsG_2 class_(rYB var1, rpr_3 var2, rfH_2 var3) {
      List var4 = var1.class_(
         rsG_2.class,
         new rfl_3((double)var3.b_(), (double)var3.c_(), (double)var3.d_(), (double)(var3.b_() + 1), (double)(var3.c_() + 1), (double)(var3.d_() + 1)),
         var1x -> var1x != null && var1x.Pg() == var2
      );
      return var4.size() == 1 ? (rsG_2)var4.get(0) : null;
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (!((rhx_3)var4.implements_[18]).throws_) {
         return ryZ_2.PASS;
      } else {
         var1 = var1.class_(volatile_);
         float var7 = var1.byte_(volatile_) == rCw_1.SUBTRACT ? 0.55F : 0.5F;
         var2.class_(var4, var3, rqn_3.ri, rqL_2.BLOCKS, 0.3F, var7);
         var2.class_(var3, var1, 2);
         this.case_(var2, var3, var1);
         return ryZ_2.class_(var2.continue_);
      }
   }

   @Override
   public ryO_2 class_(rRq_1 var1) {
      return new rHL();
   }

   @Override
   public boolean class_(xc_3 var1, rYB var2, rfH_2 var3, int var4, int var5) {
      super.class_(var1, var2, var3, var4, var5);
      ryO_2 var6 = var2.class_(var3);
      return var6 != null && var6.a_(var4, var5);
   }

   @Override
   protected boolean class_(rYB var1, rfH_2 var2, xc_3 var3) {
      int var4 = this.break_(var1, var2, var3);
      if (var4 == 0) {
         return false;
      } else {
         int var5 = this.break_((rRR)var1, var2, var3);
         return var4 > var5 ? true : var4 == var5 && var3.byte_(volatile_) == rCw_1.COMPARE;
      }
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(p, volatile_, package_);
   }

   @Override
   public void break_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      this.case_(var2, var3, var1);
   }

   @Override
   protected int break_(rYB var1, rfH_2 var2, xc_3 var3) {
      int var4 = super.break_(var1, var2, var3);
      rpr_3 var5 = var3.byte_(p);
      rfH_2 var6 = var2.break_(var5);
      xc_3 var7 = var1.byte_(var6);
      if (var7.finally_()) {
         var4 = var7.class_(var1, var6);
      } else if (var4 < 15 && var7.catch_(var1, var6)) {
         var6 = var6.break_(var5);
         var7 = var1.byte_(var6);
         rsG_2 var8 = this.class_(var1, var5, var6);
         int var9 = Math.max(var8 == null ? Integer.MIN_VALUE : var8.int_(), var7.finally_() ? var7.class_(var1, var6) : Integer.MIN_VALUE);
         if (var9 != Integer.MIN_VALUE) {
            var4 = var9;
         }
      }

      return var4;
   }

   @Override
   protected int break_(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      ryO_2 var4 = var1.class_(var2);
      return var4 instanceof rHL ? ((rHL)var4).throws_() : 0;
   }

   private int throws_(rYB var1, rfH_2 var2, xc_3 var3) {
      return var3.byte_(volatile_) == rCw_1.SUBTRACT
         ? Math.max(this.break_(var1, var2, var3) - this.break_((rRR)var1, var2, var3), 0)
         : this.break_(var1, var2, var3);
   }

   private void case_(rYB var1, rfH_2 var2, xc_3 var3) {
      int var4 = this.throws_(var1, var2, var3);
      ryO_2 var5 = var1.class_(var2);
      int var6 = 0;
      if (var5 instanceof rHL var7) {
         var6 = var7.throws_();
         var7.class_(var4);
      }

      if (var6 != var4 || var3.byte_(volatile_) == rCw_1.COMPARE) {
         boolean var9 = this.class_(var1, var2, var3);
         boolean var8 = var3.byte_(package_);
         if (var8 && !var9) {
            var1.class_(var2, var3.class_(package_, Boolean.valueOf(false)), 2);
         } else if (!var8 && var9) {
            var1.class_(var2, var3.class_(package_, Boolean.valueOf(true)), 2);
         }

         this.protected_(var1, var2, var3);
      }
   }

   @Override
   protected int private_(xc_3 var1) {
      return 2;
   }
}
