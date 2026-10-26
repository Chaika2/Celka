package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class dd_3 extends ds_3 {
   public static final rCc_1 final_ = kE_2.p;
   private static final Map<rpr_3, rjC_2> package_ = Maps.newEnumMap(
      ImmutableMap.of(
         rpr_3.NORTH,
         xd_3.class_(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         rpr_3.SOUTH,
         xd_3.class_(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         rpr_3.WEST,
         xd_3.class_(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         rpr_3.EAST,
         xd_3.class_(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   protected dd_3(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(final_, rpr_3.NORTH).class_(volatile_, Boolean.valueOf(true)));
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var1.byte_(volatile_)) {
         var4.extends_().class_(var5, rXG.byte_, rXG.byte_.class_(var4));
      }

      return var2.case_() == var1.byte_(final_) && !var1.class_(var4, var5) ? xu_3.class_.continue_() : var1;
   }

   @Override
   public boolean class_(xc_3 var1, rRR var2, rfH_2 var3) {
      rpr_3 var4 = var1.byte_(final_);
      rfH_2 var5 = var3.break_(var4.case_());
      xc_3 var6 = var2.byte_(var5);
      return var6.protected_(var2, var5, var4);
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      xc_3 var2 = super.class_(var1);
      rYB var3 = var1.int_();
      rfH_2 var4 = var1.class_();
      rpr_3[] var5 = var1.throws_();

      for (rpr_3 var9 : var5) {
         if (var9.final_().protected_()) {
            var2 = var2.class_(final_, var9.case_());
            if (var2.class_((rRR)var3, var4)) {
               return var2;
            }
         }
      }

      return null;
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(final_, volatile_);
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return package_.get(var1.byte_(final_));
   }

   @Override
   public xc_3 class_(xc_3 var1, rpa_3 var2) {
      return var1.class_(var2.class_(var1.byte_(final_)));
   }

   @Override
   public xc_3 class_(xc_3 var1, rqd_3 var2) {
      return var1.class_(final_, var2.class_(var1.byte_(final_)));
   }
}
