package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class zt_3 extends JL {
   public static final rCc_1 volatile_ = kE_2.p;
   private static final Map<rpr_3, rjC_2> final_ = Maps.newEnumMap(
      ImmutableMap.of(
         rpr_3.NORTH,
         xd_3.class_(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         rpr_3.SOUTH,
         xd_3.class_(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         rpr_3.WEST,
         xd_3.class_(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         rpr_3.EAST,
         xd_3.class_(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   public zt_3(rxL_2 var1, Jq_1 var2) {
      super(var1, var2);
      this.extends_(this.abstract_.break_().class_(volatile_, rpr_3.NORTH));
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
      return var2.byte_(var3.break_(var1.byte_(volatile_).case_())).byte_().break_();
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return final_.get(var1.byte_(volatile_));
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return var2 == var1.byte_(volatile_).case_() && !var1.class_(var4, var5) ? xu_3.class_.continue_() : super.class_(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public String volatile_() {
      return this.case_().break_();
   }
}
