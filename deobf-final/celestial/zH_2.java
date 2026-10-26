package celestial;

import java.util.Random;

public class zH_2 extends xd_3 {
   private static final rjC_2 package_ = xd_3.class_(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final rjC_2 int_ = xd_3.class_(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final rCm_1 volatile_ = rCT.u;
   public static final rCm_1 final_ = rCT.c;

   public zH_2(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(volatile_, Integer.valueOf(0)).class_(final_, Integer.valueOf(1)));
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      xc_3 var2 = var1.int_().byte_(var1.class_());
      return var2.class_(this) ? var2.class_(final_, Integer.valueOf(Math.min(4, var2.byte_(final_) + 1))) : super.class_(var1);
   }

   @Override
   public boolean class_(xc_3 var1, rxx_3 var2) {
      return var2.volatile_().break_() == this.case_() && var1.byte_(final_) < 4 ? true : super.class_(var1, var2);
   }

   @Override
   public void class_(rYB var1, rhd_3 var2, rfH_2 var3, xc_3 var4, ryO_2 var5, rdn_3 var6) {
      super.class_(var1, var2, var3, var4, var5, var6);
      this.class_(var1, var3, var4);
   }

   private boolean class_(rYB var1) {
      float var2 = var1.protected_(1.0F);
      return (double)var2 < 0.69 && (double)var2 > 0.65 ? true : var1.int_.nextInt(500) == 0;
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (class_(var2, var3) && !var2.continue_) {
         var2.byte_(2005, var3, 0);
      }
   }

   private boolean class_(rYB var1, an_3 var2) {
      if (var2 instanceof rON || var2 instanceof rbv_3) {
         return false;
      } else {
         return !(var2 instanceof iB_2) ? false : var2 instanceof rhd_3 || var1.B().break_(rRu_1.break_);
      }
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_, final_);
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return var1.byte_(final_) > 1 ? int_ : package_;
   }

   @Override
   public void class_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (this.class_(var2) && class_(var2, var3)) {
         int var5 = var1.byte_(volatile_);
         if (var5 < 2) {
            var2.class_((rhd_3)null, var3, rqn_3.dC, rqL_2.BLOCKS, 0.7F, 0.9F + var4.nextFloat() * 0.2F);
            var2.class_(var3, var1.class_(volatile_, Integer.valueOf(var5 + 1)), 2);
         } else {
            var2.class_((rhd_3)null, var3, rqn_3.dl, rqL_2.BLOCKS, 0.7F, 0.9F + var4.nextFloat() * 0.2F);
            var2.class_(var3, false);

            for (int var6 = 0; var6 < var1.byte_(final_); var6++) {
               var2.byte_(2001, var3, xd_3.finally_(var1));
               rON var7 = aI_2.o.class_(var2);
               var7.e_(-24000);
               var7.implements_(var3);
               var7.class_((double)var3.b_() + 0.3 + (double)var6 * 0.2, (double)var3.c_(), (double)var3.d_() + 0.3, 0.0F, 0.0F);
               var2.a_(var7);
            }
         }
      }
   }

   private void class_(rYB var1, rfH_2 var2, xc_3 var3) {
      var1.class_((rhd_3)null, var2, rqn_3.dn, rqL_2.BLOCKS, 0.7F, 0.9F + var1.int_.nextFloat() * 0.2F);
      int var4 = var3.byte_(final_);
      if (var4 <= 1) {
         var1.break_(var2, false);
      } else {
         var1.class_(var2, var3.class_(final_, Integer.valueOf(var4 - 1)), 2);
         var1.byte_(2001, var2, xd_3.finally_(var3));
      }
   }

   private void class_(rYB var1, rfH_2 var2, an_3 var3, int var4) {
      if (this.class_(var1, var3) && !var1.continue_ && var1.int_.nextInt(var4) == 0) {
         xc_3 var5 = var1.byte_(var2);
         if (var5.class_(xu_3.OX)) {
            this.class_(var1, var2, var5);
         }
      }
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, an_3 var3, float var4) {
      if (!(var3 instanceof rbB_2)) {
         this.class_(var1, var2, var3, 3);
      }

      super.class_(var1, var2, var3, var4);
   }

   public static boolean class_(rRq_1 var0, rfH_2 var1) {
      return break_(var0, var1.break_());
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, an_3 var3) {
      this.class_(var1, var2, var3, 100);
      super.class_(var1, var2, var3);
   }

   public static boolean break_(rRq_1 var0, rfH_2 var1) {
      return var0.byte_(var1).class_(rls_3.throw_);
   }
}
