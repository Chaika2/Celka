package celestial;

import java.util.Collections;
import java.util.List;

public class ky_3 extends dB_2 {
   public static final rCc_1 volatile_ = ka_3.volatile_;
   public static final rCu_1<rCg_1> final_ = ka_3.final_;

   public ky_3(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(volatile_, rpr_3.NORTH).class_(final_, rCg_1.DEFAULT));
   }

   @Override
   public xc_3 class_(xc_3 var1, rqd_3 var2) {
      return var1.class_(volatile_, var2.class_(var1.byte_(volatile_)));
   }

   @Override
   public rdn_3 class_(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      return rdn_3.break_;
   }

   private rHa_1 class_(rRq_1 var1, rfH_2 var2) {
      ryO_2 var3 = var1.class_(var2);
      return var3 instanceof rHa_1 ? (rHa_1)var3 : null;
   }

   @Override
   public ryO_2 class_(rRq_1 var1) {
      return null;
   }

   @Override
   public xc_3 class_(xc_3 var1, rpa_3 var2) {
      return var1.class_(var2.class_(var1.byte_(volatile_)));
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_, final_);
   }

   @Override
   public boolean class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   public static ryO_2 class_(xc_3 var0, rpr_3 var1, boolean var2, boolean var3) {
      return new rHa_1(var0, var1, var2, var3);
   }

   @Override
   public void class_(rRg_1 var1, rfH_2 var2, xc_3 var3) {
      super.class_(var1, var2, var3);
      rfH_2 var4 = var2.break_(var3.byte_(volatile_).case_());
      xc_3 var5 = var1.byte_(var4);
      if (var5.break_() instanceof kD_2 && var5.byte_(kD_2.final_)) {
         var1.class_(var4, false);
      }
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (!var2.continue_ && var2.class_(var3) == null) {
         var2.class_(var3, false);
         return ryZ_2.CONSUME;
      } else {
         return ryZ_2.PASS;
      }
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return rjw_3.class_();
   }

   @Override
   public List<rdn_3> class_(xc_3 var1, rzP_2 var2) {
      rHa_1 var3 = this.class_(var2.class_(), new rfH_2(var2.class_(rzQ_2.case_)));
      return var3 == null ? Collections.emptyList() : var3.native_().class_(var2);
   }

   @Override
   public void break_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var1.class_(var4.break_())) {
         ryO_2 var6 = var2.class_(var3);
         if (var6 instanceof rHa_1) {
            ((rHa_1)var6).volatile_();
         }
      }
   }

   @Override
   public rjC_2 break_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      rHa_1 var5 = this.class_(var2, var3);
      return var5 != null ? var5.class_(var2, var3) : rjw_3.class_();
   }
}
