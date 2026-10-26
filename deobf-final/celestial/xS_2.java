package celestial;

import com.google.common.collect.Maps;
import java.util.Map;

public class xS_2 extends JL {
   public static final rCm_1 volatile_ = rCT.T;
   private static final Map<rxL_2, xd_3> final_ = Maps.newHashMap();
   private static final rjC_2 package_ = xd_3.class_(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   public xS_2(rxL_2 var1, Jq_1 var2) {
      super(var1, var2);
      this.extends_(this.abstract_.break_().class_(volatile_, Integer.valueOf(0)));
      final_.put(var1, this);
   }

   @Override
   public xc_3 class_(xc_3 var1, rpa_3 var2) {
      return var1.class_(volatile_, Integer.valueOf(var2.class_(var1.byte_(volatile_), 16)));
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_);
   }

   public static xd_3 class_(rxL_2 var0) {
      return final_.getOrDefault(var0, xu_3.GG);
   }

   @Override
   public xc_3 class_(xc_3 var1, rqd_3 var2) {
      return var1.class_(volatile_, Integer.valueOf(var2.class_(var1.byte_(volatile_), 16)));
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return package_;
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      return this.continue_().class_(volatile_, Integer.valueOf(rfU_2.byte_((double)((180.0F + var1.private_()) * 16.0F / 360.0F) + 0.5) & 15));
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return var2 == rpr_3.DOWN && !var1.class_(var4, var5) ? xu_3.class_.continue_() : super.class_(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean class_(xc_3 var1, rRR var2, rfH_2 var3) {
      return var2.byte_(var3.break_()).byte_().break_();
   }
}
