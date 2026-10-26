package celestial;

import com.google.common.collect.Maps;
import java.util.Map;

public class WT extends xd_3 {
   private final xd_3 volatile_;
   private static final Map<xd_3, xd_3> final_ = Maps.newIdentityHashMap();

   public WT(xd_3 var1, Jq_1 var2) {
      super(var2);
      this.volatile_ = var1;
      final_.put(var1, this);
   }

   public static xc_3 class_(xd_3 var0) {
      return final_.get(var0).continue_();
   }

   @Override
   public void class_(xc_3 var1, rrEm_1 var2, rfH_2 var3, rdn_3 var4) {
      super.class_(var1, var2, var3, var4);
      if (var2.B().break_(rRu_1.case_) && eA_2.class_(eY_2.else_, var4) == 0) {
         this.class_(var2, var3);
      }
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, rRW var3) {
      if (var1 instanceof rrEm_1) {
         this.class_((rrEm_1)var1, var2);
      }
   }

   private void class_(rrEm_1 var1, rfH_2 var2) {
      rGZ var3 = aI_2.L.class_(var1);
      var3.class_((double)var2.b_() + 0.5, (double)var2.c_(), (double)var2.d_() + 0.5, 0.0F, 0.0F);
      var1.a_(var3);
      var3.float_();
   }

   public xd_3 break_() {
      return this.volatile_;
   }

   public static boolean private_(xc_3 var0) {
      return final_.containsKey(var0.break_());
   }
}
