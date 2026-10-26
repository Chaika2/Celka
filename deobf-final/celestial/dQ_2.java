package celestial;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Random;

public class dQ_2 extends dB_2 {
   public static final rCc_1 volatile_ = dz_3.volatile_;
   public static final rCN final_ = rCT.try_;
   private static final Map<rdb_3, UT> package_ = rqR_2.class_(new Object2ObjectOpenHashMap(), var0 -> var0.defaultReturnValue(new Uy_1()));

   protected dQ_2(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(volatile_, rpr_3.NORTH).class_(final_, Boolean.valueOf(false)));
   }

   public static eX_2 class_(Uq_1 var0) {
      rpr_3 var1 = var0.throws_().byte_(volatile_);
      double var2 = var0.class_() + 0.7 * (double)var1.implements_();
      double var4 = var0.break_() + 0.7 * (double)var1.finally_();
      double var6 = var0.byte_() + 0.7 * (double)var1.extends_();
      return new ex_3(var2, var4, var6);
   }

   @Override
   public xN_2 class_(xc_3 var1) {
      return xN_2.MODEL;
   }

   public static void class_(rpL_2 var0, UT var1) {
      package_.put(var0.case_(), var1);
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      if (var5.this_()) {
         ryO_2 var6 = var1.class_(var2);
         if (var6 instanceof rHC) {
            ((rHC)var6).class_(var5.continue_());
         }
      }
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_, final_);
   }

   @Override
   public xc_3 class_(xc_3 var1, rpa_3 var2) {
      return var1.class_(var2.class_(var1.byte_(volatile_)));
   }

   @Override
   public xc_3 class_(xc_3 var1, rqd_3 var2) {
      return var1.class_(volatile_, var2.class_(var1.byte_(volatile_)));
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4, rfH_2 var5, boolean var6) {
      boolean var7 = var2.public_(var3) || var2.public_(var3.final_());
      boolean var8 = var1.byte_(final_);
      if (var7 && !var8) {
         var2.finally_().class_(var3, this, 4);
         var2.class_(var3, var1.class_(final_, Boolean.valueOf(true)), 4);
      } else if (!var7 && var8) {
         var2.class_(var3, var1.class_(final_, Boolean.valueOf(false)), 4);
      }
   }

   protected UT class_(rdn_3 var1) {
      return package_.get(var1.break_());
   }

   protected void class_(rrEm_1 var1, rfH_2 var2) {
      ek_3 var3 = new ek_3(var1, var2);
      rHC var4 = var3.case_();
      int var5 = var4.catch_();
      if (var5 < 0) {
         var1.byte_(1001, var2, 0);
      } else {
         rdn_3 var6 = var4.extends_(var5);
         UT var7 = this.class_(var6);
         if (var7 != UT.class_) {
            var4.break_(var5, var7.dispense(var3, var6));
         }
      }
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var2.continue_) {
         return ryZ_2.SUCCESS;
      } else {
         ryO_2 var7 = var2.class_(var3);
         if (var7 instanceof rHC) {
            var4.class_((rHC)var7);
            if (var7 instanceof rHl_1) {
               var4.break_(rlB_2.b);
            } else {
               var4.break_(rlB_2.O);
            }
         }

         return ryZ_2.CONSUME;
      }
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      return this.continue_().class_(volatile_, var1.protected_().case_());
   }

   @Override
   public ryO_2 class_(rRq_1 var1) {
      return new rHC();
   }

   @Override
   public void break_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var1.class_(var4.break_())) {
         ryO_2 var6 = var2.class_(var3);
         if (var6 instanceof rHC) {
            rXn_1.class_(var2, var3, (rHC)var6);
            var2.byte_(var3, this);
         }

         super.break_(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public void break_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      this.class_(var2, var3);
   }

   @Override
   public int break_(xc_3 var1, rYB var2, rfH_2 var3) {
      return rJr_1.class_(var2.class_(var3));
   }

   @Override
   public boolean case_(xc_3 var1) {
      return true;
   }
}
