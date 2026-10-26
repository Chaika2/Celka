package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Random;

public class zg_3 extends zZ_2 {
   public static final rCc_1 volatile_ = kE_2.p;
   private static final Map<rpr_3, rjC_2> final_ = Maps.newEnumMap(
      ImmutableMap.of(
         rpr_3.NORTH,
         xd_3.class_(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         rpr_3.SOUTH,
         xd_3.class_(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         rpr_3.WEST,
         xd_3.class_(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         rpr_3.EAST,
         xd_3.class_(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   protected zg_3(Jq_1 var1, rLx_1 var2) {
      super(var1, var2);
      this.extends_(this.abstract_.break_().class_(volatile_, rpr_3.NORTH));
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      rpr_3 var5 = var1.byte_(volatile_);
      double var6 = (double)var3.b_() + 0.5;
      double var8 = (double)var3.c_() + 0.7;
      double var10 = (double)var3.d_() + 0.5;
      double var12 = 0.22;
      double var14 = 0.27;
      rpr_3 var16 = var5.case_();
      var2.class_(rLQ.double_, var6 + 0.27 * (double)var16.implements_(), var8 + 0.22, var10 + 0.27 * (double)var16.extends_(), 0.0, 0.0, 0.0);
      var2.class_(this.new_, var6 + 0.27 * (double)var16.implements_(), var8 + 0.22, var10 + 0.27 * (double)var16.extends_(), 0.0, 0.0, 0.0);
   }

   @Override
   public xc_3 class_(xc_3 var1, rqd_3 var2) {
      return var1.class_(volatile_, var2.class_(var1.byte_(volatile_)));
   }

   @Override
   public xc_3 class_(xc_3 var1, rpa_3 var2) {
      return var1.class_(var2.class_(var1.byte_(volatile_)));
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_);
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return var2.case_() == var1.byte_(volatile_) && !var1.class_(var4, var5) ? xu_3.class_.continue_() : var1;
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return private_(var1);
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      xc_3 var2 = this.continue_();
      rYB var3 = var1.int_();
      rfH_2 var4 = var1.class_();
      rpr_3[] var5 = var1.throws_();

      for (rpr_3 var9 : var5) {
         if (var9.final_().protected_()) {
            rpr_3 var10 = var9.case_();
            var2 = var2.class_(volatile_, var10);
            if (var2.class_((rRR)var3, var4)) {
               return var2;
            }
         }
      }

      return null;
   }

   @Override
   public boolean class_(xc_3 var1, rRR var2, rfH_2 var3) {
      rpr_3 var4 = var1.byte_(volatile_);
      rfH_2 var5 = var3.break_(var4.case_());
      xc_3 var6 = var2.byte_(var5);
      return var6.protected_(var2, var5, var4);
   }

   public static rjC_2 private_(xc_3 var0) {
      return final_.get(var0.byte_(volatile_));
   }

   @Override
   public String volatile_() {
      return this.case_().break_();
   }
}
