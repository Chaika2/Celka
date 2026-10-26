package celestial;

import com.google.common.collect.ImmutableMap;

public class rrU_2 extends rPm_1<is_3> {
   private final float class_;

   public rrU_2(float var1) {
      super(ImmutableMap.of(il_3.volatile_, iC_2.REGISTERED, il_3.final_, iC_2.REGISTERED, il_3.package_, iC_2.VALUE_PRESENT, il_3.private_, iC_2.REGISTERED));
      this.class_ = var1;
   }

   private void class_(iB_2 var1) {
      var1.SF().break_(il_3.volatile_);
   }

   private void class_(iB_2 var1, iB_2 var2) {
      iZ_2 var3 = var1.SF();
      var3.class_(il_3.final_, new rfY_2(var2, true));
      iH_2 var4 = new iH_2(new rfY_2(var2, false), this.class_, 0);
      var3.class_(il_3.volatile_, var4);
   }

   protected void class_(rrEm_1 var1, is_3 var2, long var3) {
      iB_2 var5 = var2.SF().byte_(il_3.package_).get();
      if (iA_2.byte_(var2, var5) && iA_2.class_(var2, var5, 1)) {
         this.class_(var2);
      } else {
         this.class_(var2, var5);
      }
   }
}
