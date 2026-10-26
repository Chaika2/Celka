package celestial;

import com.google.common.collect.ImmutableMap;

public class rrO_2 extends rPm_1<is_3> {
   private final int class_;

   public rrO_2(int var1) {
      super(ImmutableMap.of(il_3.final_, iC_2.REGISTERED, il_3.package_, iC_2.VALUE_PRESENT, il_3.int_, iC_2.VALUE_ABSENT));
      this.class_ = var1;
   }

   protected void class_(rrEm_1 var1, is_3 var2, long var3) {
      iB_2 var5 = this.break_(var2);
      iA_2.class_(var2, var5);
      var2.class_(rpm_3.MAIN_HAND);
      var2.public_(var5);
      var2.SF().class_(il_3.int_, true, (long)this.class_);
   }

   private boolean class_(is_3 var1) {
      return var1.class_(var1x -> var1x instanceof rkB_2 && var1.class_((rkB_2)var1x));
   }

   protected boolean class_(rrEm_1 var1, is_3 var2) {
      iB_2 var3 = this.break_(var2);
      return !this.class_(var2) && iA_2.byte_(var2, var3) && iA_2.break_(var2, var3);
   }

   private iB_2 break_(is_3 var1) {
      return var1.SF().byte_(il_3.package_).get();
   }
}
