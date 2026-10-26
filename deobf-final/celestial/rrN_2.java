package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.function.BiPredicate;

public class rrN_2 extends rPm_1<iB_2> {
   private final int class_;
   private final BiPredicate<iB_2, iB_2> byte_;

   public rrN_2(int var1, BiPredicate<iB_2, iB_2> var2) {
      super(ImmutableMap.of(il_3.package_, iC_2.VALUE_PRESENT, il_3.short_, iC_2.REGISTERED, il_3.double_, iC_2.VALUE_ABSENT, il_3.switch_, iC_2.REGISTERED));
      this.class_ = var1;
      this.byte_ = var2;
   }

   private iB_2 class_(iB_2 var1) {
      return var1.SF().byte_(il_3.package_).get();
   }

   @Override
   protected boolean class_(rrEm_1 var1, iB_2 var2) {
      return this.class_(var2).Sl();
   }

   @Override
   protected void protected_(rrEm_1 var1, iB_2 var2, long var3) {
      iB_2 var5 = this.class_(var2);
      if (this.byte_.test(var2, var5)) {
         var2.SF().class_(il_3.switch_, true, (long)this.class_);
      }

      var2.SF().class_(il_3.double_, var5.Bs(), (long)this.class_);
      if (var5.BC() != aI_2.rM || var1.B().break_(rRu_1.abstract_)) {
         var2.SF().break_(il_3.package_);
         var2.SF().break_(il_3.short_);
      }
   }
}
