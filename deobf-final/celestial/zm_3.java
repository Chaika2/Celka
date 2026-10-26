package celestial;

import java.util.Random;

public class zm_3 extends xd_3 {
   private static final rCm_1 volatile_ = rCT.H;

   @Override
   public boolean byte_(xc_3 var1) {
      return true;
   }

   public zm_3(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(volatile_, Integer.valueOf(0)));
   }

   @Override
   public int class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      return var1.byte_(volatile_);
   }

   @Override
   public void class_(rYB var1, xc_3 var2, rff_3 var3, rhf_3 var4) {
      int var5 = class_((rRg_1)var1, var2, var3, (an_3)var4);
      if (var4.else_() instanceof rhN_2 var7) {
         var7.break_(rlB_2.T);
         Oo_1.short_.class_(var7, var4, var3.case_(), var5);
      }
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_);
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var2.import_() && !var1.class_(var4.break_()) && var1.byte_(volatile_) > 0 && !var2.finally_().class_(var3, this)) {
         var2.class_(var3, var1.class_(volatile_, Integer.valueOf(0)), 18);
      }
   }

   private static int class_(rff_3 var0, rjU_2 var1) {
      rpr_3 var2 = var0.break_();
      double var3 = Math.abs(rfU_2.catch_(var1.break_) - 0.5);
      double var5 = Math.abs(rfU_2.catch_(var1.byte_) - 0.5);
      double var7 = Math.abs(rfU_2.catch_(var1.protected_) - 0.5);
      rpB_2 var9 = var2.final_();
      double var10;
      if (var9 == rpB_2.Y) {
         var10 = Math.max(var3, var7);
      } else if (var9 == rpB_2.Z) {
         var10 = Math.max(var3, var5);
      } else {
         var10 = Math.max(var5, var7);
      }

      return Math.max(1, rfU_2.throws_(15.0 * rfU_2.class_((0.5 - var10) / 0.5, 0.0, 1.0)));
   }

   private static void class_(rRg_1 var0, xc_3 var1, int var2, rfH_2 var3, int var4) {
      var0.class_(var3, var1.class_(volatile_, Integer.valueOf(var2)), 3);
      var0.finally_().class_(var3, var1.break_(), var4);
   }

   private static int class_(rRg_1 var0, xc_3 var1, rff_3 var2, an_3 var3) {
      int var4 = class_(var2, var2.case_());
      int var5 = var3 instanceof rhm_3 ? 20 : 8;
      if (!var0.finally_().class_(var2.class_(), var1.break_())) {
         class_(var0, var1, var4, var2.class_(), var5);
      }

      return var4;
   }

   @Override
   public void break_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var1.byte_(volatile_) != 0) {
         var2.class_(var3, var1.class_(volatile_, Integer.valueOf(0)), 3);
      }
   }
}
