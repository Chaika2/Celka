package celestial;

import com.google.common.collect.ImmutableMap;

public class rPG extends rPm_1<iB_2> {
   private final int class_;

   public rPG(il_3<?> var1, int var2) {
      super(ImmutableMap.of(il_3.package_, iC_2.REGISTERED, il_3.x, iC_2.VALUE_ABSENT, var1, iC_2.VALUE_PRESENT));
      this.class_ = var2;
   }

   @Override
   protected void protected_(rrEm_1 var1, iB_2 var2, long var3) {
      var2.SF().class_(il_3.x, true, (long)this.class_);
      var2.SF().break_(il_3.package_);
   }
}
