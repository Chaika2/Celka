package celestial;

import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class xK_2 extends dB_2 {
   private static final Logger package_ = LogManager.getLogger();
   public static final rCc_1 volatile_ = dz_3.volatile_;
   public static final rCN final_ = rCT.byte_;

   public xK_2(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(volatile_, rpr_3.NORTH).class_(final_, Boolean.valueOf(false)));
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
   public xN_2 class_(xc_3 var1) {
      return xN_2.MODEL;
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      return this.continue_().class_(volatile_, var1.protected_().case_());
   }

   private static void class_(rYB var0, rfH_2 var1, rpr_3 var2) {
      rfw_3 var3 = var1.new_();
      rRu_1 var4 = var0.B();
      int var5 = var4.byte_(rRu_1.synchronized_);

      while (var5-- > 0) {
         var3.class_(var2);
         xc_3 var6 = var0.byte_(var3);
         xd_3 var7 = var6.break_();
         if (!var6.class_(xu_3.bf) || !(var0.class_(var3) instanceof rHZ var9) || var9.final_() != rHF.SEQUENCE) {
            break;
         }

         if (var9.catch_() || var9.private_()) {
            rHm_1 var10 = var9.throws_();
            if (var9.native_()) {
               if (!var10.class_(var0)) {
                  break;
               }

               var0.byte_(var3, var7);
            } else if (var9.package_()) {
               var10.class_(0);
            }
         }

         var2 = var6.byte_(volatile_);
      }

      if (var5 <= 0) {
         int var11 = Math.max(var4.byte_(rRu_1.synchronized_), 0);
         package_.warn("Command Block chain tried to execute more than {} steps!", var11);
      }
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      if (var1.class_(var2) instanceof rHZ var7) {
         rHm_1 var8 = var7.throws_();
         if (var5.this_()) {
            var8.class_(var5.continue_());
         }

         if (!var1.continue_) {
            if (var5.break_("BlockEntityTag") == null) {
               var8.class_(var1.B().break_(rRu_1.final_));
               var7.break_(this == xu_3.bf);
            }

            if (var7.final_() == rHF.SEQUENCE) {
               boolean var9 = var1.public_(var2);
               var7.class_(var9);
            }
         }
      }
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4, rfH_2 var5, boolean var6) {
      if (!var2.continue_ && var2.class_(var3) instanceof rHZ var8) {
         boolean var9 = var2.public_(var3);
         boolean var10 = var8.catch_();
         var8.class_(var9);
         if (!var10 && !var8.private_() && var8.final_() != rHF.SEQUENCE && var9) {
            var8.native_();
            var2.finally_().class_(var3, this, 1);
         }
      }
   }

   private void class_(xc_3 var1, rYB var2, rfH_2 var3, rHm_1 var4, boolean var5) {
      if (var5) {
         var4.class_(var2);
      } else {
         var4.class_(0);
      }

      class_(var2, var3, var1.byte_(volatile_));
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      ryO_2 var7 = var2.class_(var3);
      if (var7 instanceof rHZ && var4.sU()) {
         var4.class_((rHZ)var7);
         return ryZ_2.class_(var2.continue_);
      } else {
         return ryZ_2.PASS;
      }
   }

   @Override
   public ryO_2 class_(rRq_1 var1) {
      rHZ var2 = new rHZ();
      var2.break_(this == xu_3.bf);
      return var2;
   }

   @Override
   public void break_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var2.class_(var3) instanceof rHZ var6) {
         rHm_1 var7 = var6.throws_();
         boolean var8 = !rql_3.break_(var7.private_());
         rHF var9 = var6.final_();
         boolean var10 = var6.extends_();
         if (var9 == rHF.AUTO) {
            var6.native_();
            if (var10) {
               this.class_(var1, var2, var3, var7, var8);
            } else if (var6.package_()) {
               var7.class_(0);
            }

            if (var6.catch_() || var6.private_()) {
               var2.synchronized_().class_(var3, this, 1);
            }
         } else if (var9 == rHF.REDSTONE) {
            if (var10) {
               this.class_(var1, var2, var3, var7, var8);
            } else if (var6.package_()) {
               var7.class_(0);
            }
         }

         var2.byte_(var3, this);
      }
   }

   @Override
   public int break_(xc_3 var1, rYB var2, rfH_2 var3) {
      ryO_2 var4 = var2.class_(var3);
      return var4 instanceof rHZ ? ((rHZ)var4).throws_().case_() : 0;
   }

   @Override
   public boolean case_(xc_3 var1) {
      return true;
   }
}
