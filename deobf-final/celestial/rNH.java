package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class rNH extends rzO_2 {
   final rzV_2 break_;
   final int byte_;

   boolean byte_() {
      return this.byte_ > 0;
   }

   rNH(rQz_1[] var1, rzV_2 var2, int var3) {
      super(var1);
      this.break_ = var2;
      this.byte_ = var3;
   }

   public static rNy_1 class_(rzV_2 var0) {
      return new rNy_1(var0);
   }

   @Override
   public Set<rzd_3<?>> class_() {
      return ImmutableSet.of(rzQ_2.protected_);
   }

   @Override
   public rzx_3 break_() {
      return rNl_1.catch_;
   }

   @Override
   public rdn_3 break_(rdn_3 var1, rzr_3 var2) {
      an_3 var3 = var2.break_(rzQ_2.protected_);
      if (var3 instanceof iB_2) {
         int var4 = eA_2.catch_((iB_2)var3);
         if (var4 == 0) {
            return var1;
         }

         float var5 = (float)var4 * this.break_.break_(var2.class_());
         var1.case_(Math.round(var5));
         if (this.byte_() && var1.char_() > this.byte_) {
            var1.throws_(this.byte_);
         }
      }

      return var1;
   }
}
