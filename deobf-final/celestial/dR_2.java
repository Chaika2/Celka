package celestial;

import java.util.Random;

public class dR_2 extends kk_3 {
   public static final rCm_1 volatile_ = rCT.J;

   public dR_2(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(volatile_, Integer.valueOf(0)));
   }

   @Override
   public rdn_3 class_(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      return rdn_3.break_;
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_);
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4, rfH_2 var5, boolean var6) {
      if (var4 == this && this.class_(var2, var3, 2)) {
         this.byte_(var1, var2, var3);
      }

      super.class_(var1, var2, var3, var4, var5, var6);
   }

   private boolean class_(rRq_1 var1, rfH_2 var2, int var3) {
      int var4 = 0;
      rfw_3 var5 = new rfw_3();

      for (rpr_3 var9 : rpr_3.values()) {
         var5.class_(var2, var9);
         if (var1.byte_(var5).class_(this)) {
            if (++var4 >= var3) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public void class_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      this.break_(var1, var2, var3, var4);
   }

   @Override
   public void break_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if ((var4.nextInt(3) == 0 || this.class_(var2, var3, 4))
         && var2.package_(var3) > 11 - var1.byte_(volatile_) - var1.break_(var2, var3)
         && this.throws_(var1, var2, var3)) {
         rfw_3 var5 = new rfw_3();

         for (rpr_3 var9 : rpr_3.values()) {
            var5.class_(var3, var9);
            xc_3 var10 = var2.byte_(var5);
            if (var10.class_(this) && !this.throws_(var10, var2, var5)) {
               var2.synchronized_().class_(var5, this, rfU_2.class_(var4, 20, 40));
            }
         }
      } else {
         var2.synchronized_().class_(var3, this, rfU_2.class_(var4, 20, 40));
      }
   }

   private boolean throws_(xc_3 var1, rYB var2, rfH_2 var3) {
      int var4 = var1.byte_(volatile_);
      if (var4 < 3) {
         var2.class_(var3, var1.class_(volatile_, Integer.valueOf(var4 + 1)), 2);
         return false;
      } else {
         this.byte_(var1, var2, var3);
         return true;
      }
   }
}
